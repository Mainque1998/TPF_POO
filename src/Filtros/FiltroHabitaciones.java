package Filtros;

import POJO.Publicacion;

/**
 * Clase que extiende de Filtro para filtrar por una cantidad de habitaciones determinada
 * @author Mainque
 */
public class FiltroHabitaciones implements Filtro {
    private int habitaciones;

    //Constructor
    public FiltroHabitaciones(int h) {
        this.habitaciones = h;
    }
    
    @Override
    public boolean cumple(Publicacion p) {
        return (p.getCantHabitaciones() == habitaciones);
    }
}
