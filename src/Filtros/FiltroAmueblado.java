package Filtros;

import Sistema_Base.Publicacion;

/**
 * Clase que extiende de Filtro para filtrar por los amueblados o no amueblados
 * @author Mainque
 */
public class FiltroAmueblado implements Filtro {
    private boolean esAmueblado;

    public FiltroAmueblado(boolean esAmueblado) {
        this.esAmueblado = esAmueblado;
    }

    @Override
    public boolean cumple(Publicacion p) {
        return (esAmueblado==p.esAmueblado());
    }
}