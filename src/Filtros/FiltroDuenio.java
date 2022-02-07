package Filtros;

import Sistema_Base.Publicacion;

/**
 * Clase que extiende de Filtro para filtrar por un dueño en especifico
 * @author Mainque
 */
public class FiltroDuenio implements Filtro {
    private String dueño;

    //Constructor
    public FiltroDuenio(String d) {
        this.dueño = d;
    }
    
    @Override
    public boolean cumple(Publicacion p) {
        return (p.getDueño().equals(dueño));
    }
}
