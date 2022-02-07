package Filtros;

import Sistema_Base.Publicacion;

/**
 * Clase que extiende de Filtro para filtrar por un rango de tamaño en metros cuadrados
 * @author Mainque
 */
public class FiltroRangoTamanio implements Filtro {
    private int tam1;
    private int tam2;

    //Constructor
    public FiltroRangoTamanio(int t1, int t2) {
        this.tam1 = t1;
        this.tam2 = t2;
    }
    
    @Override
    public boolean cumple(Publicacion p) {
        return (tam1<=p.getMetrosCuadrados() && p.getMetrosCuadrados()<=tam2);
    }
}
