package Sistema_Base;

import Filtros.Filtro;
import java.util.ArrayList;

/**
 * Clase contenedora de las publicaciones del sistema
 * @author Mainque
 */
public class Publicaciones {
    private static ArrayList<Publicacion> lista = new ArrayList<Publicacion>();

    //Constructores
    public Publicaciones(ArrayList<Publicacion> lista) {
        this.lista = lista;
    }
    public Publicaciones() {
    }
    
    //Metodo para obtener las publicaciones segun un filtrado
    public ArrayList<Publicacion> buscar(Filtro f){
        ArrayList<Publicacion> result = new ArrayList<Publicacion>();
        
        for(Publicacion p: lista){
            if(f.cumple(p))
                result.add(p);
        }
        
        return result;
    }
    
    //Metodo para agregar una publicacion, en caso de hacerlo correctamente devuelve true
    public static boolean agregar(int id, String tipo, String zona, String calle, int altura, int piso, int depto, int dueño, String pago, int precio, int cantHabitaciones, int metrosCuadrados, boolean esAmueblado, boolean tienePatio, String descripcion){
        //Verificamos que no exista en la lista
        boolean existe = false;
        for(Publicacion p: lista){
            existe= (calle.equals(p.getCalle()) && piso==p.getPiso() && depto==p.getDepto());
            if(existe)
                return false;
        }
        //La agregamos
        Publicacion p = new Publicacion(id, tipo, zona, calle, altura, piso, depto, dueño, pago, precio, cantHabitaciones, metrosCuadrados, esAmueblado, tienePatio, descripcion);
        lista.add(p);
        return true;
    }//TODO VERIFICAR COMO ASIGNAR EL ID
    //TODO TAMBIEN DEBE MODIFICAR LA BD
    
    //Metodo para eliminar una publicacion dado una calle, piso y depto y el usuario propietario, si lo hace correctamente devuelve true
    public static boolean eliminar(String calle, int piso, int depto, int dueño){
        for(int i=0; i<lista.size(); i++){
            Publicacion p= lista.get(i);
            System.out.println(p.getCalle() +" "+ p.getAltura());
            System.out.println(p.getPiso());
            System.out.println(p.getDepto());
            if( calle.equals(p.getCalle() +" "+ p.getAltura()) && (p.getPiso()==piso) && (p.getDepto()==depto) ){//Buscamos la publicacion
                System.out.println("Coindice con el deseado");
                if(p.getDueño()==dueño){//Verificamos que el usuario sea el dueño de la publicacion
                    lista.remove(i);
                    return true;
                }else{//Este caso no deberia darse
                    System.out.println("No concuerda con el dueño");
                    return false;
                }
            }
        }
        System.out.println("No se encontró ninguna coindicencia");
        return false; //la publicación no existe
    }//TODO TAMBIEN DEBE MODIFICAR LA BD
}
