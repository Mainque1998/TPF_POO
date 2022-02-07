package Filtros;

import Sistema_Base.Publicacion;

/**
 * Clase para invertir el resultado de un filtro
 * @author Mainque
 */
public class FiltroNot implements Filtro {
    private Filtro filtro;

    public FiltroNot(Filtro f) {
        this.filtro = f;
    }

    @Override
    public boolean cumple(Publicacion p) {
        return !(filtro.cumple(p));
    }
}
