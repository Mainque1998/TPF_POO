package Filtros;

import POJO.Publicacion;

/**
 * Clase que extiende de Filtro para filtrar por una zona determinada
 * @author Mainque
 */
public class FiltroZona implements Filtro {
    private String zona;

    //Constructor
    public FiltroZona(String z) {
        this.zona = z;
    }
    
    @Override
    public boolean cumple(Publicacion p) {
        return (p.getZona().equals(zona));
    }
}
