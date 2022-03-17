package Filtros;

import cl.pojos.Publicacion;

/**
 * Clase que extiende de Filtro para filtrar por un rango de precios
 * @author Mainque
 */
public class FiltroRangoPrecio implements Filtro {
    private int precio1;
    private int precio2;

    //Constructor
    public FiltroRangoPrecio(int precio1, int precio2) {
        this.precio1 = precio1;
        this.precio2 = precio2;
    }
    
    @Override
    public boolean cumple(Publicacion p) {
        return (precio1<=p.getPrecio() && p.getPrecio()<=precio2);
    }
}
