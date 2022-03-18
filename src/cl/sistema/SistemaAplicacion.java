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
 * Clase contenedora de las publicaciones del sistema
 * @author Mainque
 */
public class SistemaAplicacion {
    //private static ArrayList<Publicacion> lista = new ArrayList<Publicacion>();

    //Constructor
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
    
    //Metodo para eliminar una publicacion dado una calle, piso y depto y el usuario propietario (si lo hace correctamente devuelve true)
    public boolean eliminarPublicacion(String calle, int piso, int depto, String dueño){
        List<Publicacion> lista = this.buscar(new FiltroDuenio(dueño));
        for(int i=0; i<lista.size(); i++){
            Publicacion p= lista.get(i);
            System.out.println(p.getCalle() +" "+ p.getAltura());
            System.out.println(p.getPiso());
            System.out.println(p.getDepto());
            if( calle.equals(p.getCalle() +" "+ p.getAltura()) && (p.getPiso()==piso) && (p.getDepto()==depto) ){//Buscamos la publicacion
                System.out.println("Coindice con el deseado");
                //REMOVER DE LA BD
                lista.remove(i);
                return true;
            }
        }
        System.out.println("No se encontró ninguna coindicencia");
        return false; //la publicación no existe
    }
    
    //Metodo para obtener la lista de publicaciones de la BD
    public List<Usuario> obtenerUsuarios(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        List<Usuario> lista = ses.createQuery("from Usuario").list();
        return lista;
    }
    
    //Metodo para devolver un usuario o null si no existe o la contraseña es incorrecta (usado por Login)
    public Usuario getUsuario(int dni, String password){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Usuario u = (Usuario) ses.createQuery("from Usuario where dni= :dni").setParameter("dni", dni).uniqueResult();
        if(u != null)//Si existe un usuario con el dni
            if(u.getPassword().equals(password))
                return null;//si la contraseña es incorrecta devuelve null
        return u;//Si no existia un usuario con el dni entonces es null, en caso contrario la contraseña era correcta y devuelve el usuario
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
        //La agregamos
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Transaction tx = ses.beginTransaction();
        ses.save(u);
        tx.commit();
        return true;
    }
}
