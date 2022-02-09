package Sistema_Base;

import Filtros.Filtro;

/**
 * Clase que hace de una publicacion determinada con sus respectivos detalles
 * @author Mainque
 */
public class Publicacion {
    //Atributos
    private int id; //identificador unico de las publicaciones
    private String tipo; //valores: venta, alquiler, residencia
    private String zona;
    private String calle; // TODO CAMBIAR SEGUN PRECISE OPENSTREET
    private int piso;
    private int depto;
    private Usuario dueño;
    private String pago; //valores: mensual, semanal, etc.
    private int precio;
    private int cantHabitaciones;
    private int metrosCuadrados;
    private boolean esAmueblado;
    private boolean tienePatio;
    private String descripcion; //descripcion detallada por el dueño
    
    //Constructor
    public Publicacion(int id, String tipo, String zona, String calle, int piso, int depto, Usuario dueño, String pago, int precio, int cantHabitaciones, int metrosCuadrados, boolean esAmueblado, boolean tienePatio, String descripcion) {
        this.id = id;
        this.tipo = tipo;
        this.zona = zona;
        this.calle = calle;
        this.piso = piso;
        this.depto = depto;
        this.dueño = dueño;
        this.pago = pago;
        this.precio = precio;
        this.cantHabitaciones = cantHabitaciones;
        this.metrosCuadrados = metrosCuadrados;
        this.esAmueblado = esAmueblado;
        this.tienePatio = tienePatio;
        this.descripcion = descripcion;
    }
    
    //getters
    public int getId() {
        return id;
    }
    
    public String getTipo() {
        return tipo;
    }

    public String getZona() {
        return zona;
    }

    public Usuario getDueño() {
        return dueño;
    }

    public String getPago() {
        return pago;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public boolean esAmueblado() {
        return esAmueblado;
    }

    public int getPiso() {
        return piso;
    }

    public int getDepto() {
        return depto;
    }

    public boolean tienePatio() {
        return tienePatio;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
