package Filtros;

import cl.pojos.Publicacion;

/**
 * Clase que extiende de Filtro para filtrar por un dueño en especifico
 * @author Mainque
 */
public class FiltroDuenio implements Filtro {
    private String duenio;
    
    //Constructores
    public FiltroDuenio(String nombre) {
        this.duenio = nombre;
    }
    
    @Override
    public boolean cumple(Publicacion p) {
        return p.getUsuario().getNombre().equals(this.duenio);
    }
}
