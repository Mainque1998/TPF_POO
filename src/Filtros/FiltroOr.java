package Filtros;

import Sistema_Base.Publicacion;

/**
 * Clase para lograr la composicion por or de dos filtros
 * @author Mainque
 */
public class FiltroOr implements Filtro {
    private Filtro f1;
    private Filtro f2;

    public FiltroOr(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Publicacion p) {
        return (f1.cumple(p) || f2.cumple(p));
    }
}
