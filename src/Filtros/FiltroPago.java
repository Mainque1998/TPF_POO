package Filtros;

import POJO.Publicacion;

/**
 * Clase que extiende de Filtro para filtrar por un tipo de pago determinado
 * @author Mainque
 */
public class FiltroPago implements Filtro {
    private String pago;

    //Constructor
    public FiltroPago(String p) {
        this.pago = p;
    }
    
    @Override
    public boolean cumple(Publicacion p) {
        return (p.getPago().equals(pago));
    }
}
