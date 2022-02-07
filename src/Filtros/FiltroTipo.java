package Filtros;

import Sistema_Base.Publicacion;

/**
 * Clase que extiende de Filtro para filtrar por un tipo determinado
 * @author Mainque
 */
public class FiltroTipo implements Filtro {
    private String tipo;

    //Constructor
    public FiltroTipo(String t) {
        this.tipo = t;
    }
    
    @Override
    public boolean cumple(Publicacion p) {
        return (p.getTipo().equals(tipo));
    }
}
