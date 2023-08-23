package Filtros;

import cl.pojos.Publicacion;

/**
 * Clase que extiende de Filtro para filtrar por los que tienen o no patio
 * @author Mainque
 */
public class FiltroPatio implements Filtro {
    private boolean tienePatio;

    public FiltroPatio(boolean tienePatio) {
        this.tienePatio = tienePatio;
    }

    @Override
    public boolean cumple(Publicacion p) {
        return (tienePatio==p.isTienePatio());
    }
}