package Filtros;

import POJO.Publicacion;

/**
 * Clase que extiende de Filtro para filtrar por un dueño en especifico
 * @author Mainque
 */
public class FiltroDuenio implements Filtro {
    private String nombreDueño;
    private int dniDueño;
    
    //Constructores
    public FiltroDuenio(String nombre) { //este filtro es usado por el buscador
        this.nombreDueño = nombre;
    }
    public FiltroDuenio(int dni) { //este filtro es usado por la lista de "Mis publicaciones"
        this.dniDueño = dni;
    }
    
    @Override
    public boolean cumple(Publicacion p) {//TODO agregar la comparacion del nombre asociado al dni de la pub con el string dueño
        return dniDueño== p.getUsuario().getDni();
    }
}
