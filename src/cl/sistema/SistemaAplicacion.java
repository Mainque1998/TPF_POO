package cl.sistema;

import Filtros.Filtro;
import Filtros.FiltroDuenio;
import cl.pojos.Publicacion;
import cl.pojos.Usuario;
import cl.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Clase que se encarga de la administración del sistema, interactuando con las interfaces y la BD
 * @author Mainque
 */
public class SistemaAplicacion {
    
    public SistemaAplicacion() {
    }
    
    //Metodo para obtener la lista de publicaciones de la BD
    public List<Publicacion> obtenerPublicaciones(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        List<Publicacion> lista = ses.createQuery("from Publicacion").list();
        return lista;
    }
    
    //Metodo para obtener las publicaciones segun un filtrado
    public ArrayList<Publicacion> buscar(Filtro f){
        List<Publicacion> lista = this.obtenerPublicaciones();
        ArrayList<Publicacion> result = new ArrayList<Publicacion>();
        
        for(Publicacion p: lista){
            if(f.cumple(p))
                result.add(p);
        }
        
        return result;
    }
    
    //Metodo para agregar una publicacion (en caso de hacerlo correctamente devuelve true)
    public boolean agregarPublicacion(Publicacion p){
        List<Publicacion> lista = this.obtenerPublicaciones();
        //Verificamos que no exista en la lista
        boolean existe = false;
        for(Publicacion pi: lista){
            existe= (p.getCalle().equals(pi.getCalle()) && p.getPiso()==pi.getPiso() && p.getDepto()==pi.getDepto());
            if(existe)
                return false;
        }
        //La agregamos
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Transaction tx = ses.beginTransaction();
        ses.save(p);
        tx.commit();
        return true;
    }
    
    //Metodo para eliminar una publicacion
    public boolean eliminarPublicacion(Publicacion p, Usuario u){
        List<Publicacion> lista = this.buscar(new FiltroDuenio(u.getNombre()));
        for(Publicacion pi: lista){
            //Verificamos que exista la publicacion (En un contexto sin errores siempre existe la publicacion a borrar)
            if( p.getId().equals(pi.getId()) ){
                SessionFactory sf = HibernateUtil.getSessionFactory();
                Session ses = sf.openSession();
                ses.delete(p);
                ses.beginTransaction().commit();
                return true;//Encontramos y borramos la publicación
            }
        }
        
        return false; //la publicación no existe (esto no debería ocurrir en un contexto sin errores)
    }
    
    //Metodo para devolver un usuario o null si no existe o la contraseña es incorrecta (usado por Login)
    public Usuario getUsuario(int dni, String password){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Object result = ses.createQuery("from Usuario where dni= :dni").setParameter("dni", dni).uniqueResult();
        
        if(result != null){//Si existe un usuario con el dni
            Usuario u = (Usuario) result;
            //System.out.println("Ingresar con: dni= "+u.getDni()+", pass= "+u.getPassword());
            //System.out.println("Quiere ingresar con: dni= "+dni+", pass= "+password);
            if(!u.getPassword().equals(password))
                return null;//si la contraseña es incorrecta devuelve null
            else
                return u;
        }
        return null;//Si no existia un usuario con el dni entonces es null
    }
        
    //Metodo para obtener la lista de usuarios de la BD
    private List<Usuario> obtenerUsuarios(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        List<Usuario> lista = ses.createQuery("from Usuario").list();
        return lista;
    }
    
    //Metodo para agregar un usuario a la BD (usado por NuevoUsuario)
    public boolean agregarUsuario(Usuario u){
        List<Usuario> lista = this.obtenerUsuarios();
        //Verificamos que no exista en la lista
        boolean existe = false;
        for(Usuario ui: lista){
            existe= (u.getDni()==ui.getDni());
            if(existe)
                return false;
        }
        //Lo agregamos
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Transaction tx = ses.beginTransaction();
        ses.save(u);
        tx.commit();
        return true;
    }
}
