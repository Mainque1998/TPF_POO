package Filtros;

import Sistema_Base.Publicacion;

/**
 * Clase abstracta para realizar el filtrado a traves del meotodo cumple
 * @author Mainque
 */
public abstract interface Filtro {
    
    public abstract boolean cumple(Publicacion p);
}
