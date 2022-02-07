package Sistema_Base;

import Filtros.Filtro;
import java.util.ArrayList;

/**
 * Clase contenedora de las publicaciones del sistema
 * @author Mainque
 */
public class Publicaciones {
    private ArrayList<Publicacion> lista;

    //Constructor
    public Publicaciones(ArrayList<Publicacion> lista) {
        this.lista = lista;
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
    
    //Metodos para agregar y eliminar publicaciones
    public void agregar(int id, String tipo, String zona, String calle, Usuario dueño, String pago, int precio, int cantHabitaciones, int metrosCuadrados, boolean esAmueblado, String descripcion){
        Publicacion p = new Publicacion(id, tipo, zona, calle, dueño, pago, precio, cantHabitaciones, metrosCuadrados, esAmueblado, descripcion);
        lista.add(p);
    }//TODO: VERIFICAR COMO ASIGNAR EL ID
    
    public void eliminar(int id, int usuario){
        for(int i=0; i<lista.size(); i++){
            Publicacion p= lista.get(i);
            if(p.getId() == id){//Buscamos la publicacion
                if(p.getDueño().getDni()==usuario){//Verificamos que el usuario sea el dueño de la publicacion
                    lista.remove(i);
                }else{
                    // TODO AGREGAR ERROR DE QUE NO CORRESPONDE LA PUBLICACION CON EL USUARIO QUE DESEA ELIMINARLA
                }
                break;//Termino el for porque solo hay una publicacion con determinado id
            }
        }
    }
}
