package POJO;
// Generated 13 mar. 2022 14:21:54 by Hibernate Tools 4.3.1



/**
 * Publicacion generated by hbm2java
 */
public class Publicacion  implements java.io.Serializable {


     private Integer id;
     private Usuario usuario;
     private String tipo;
     private String zona;
     private String calle;
     private int altura;
     private Integer piso;
     private Integer depto;
     private String pago;
     private int precio;
     private int cantHabitaciones;
     private int metrosCuadrados;
     private boolean esAmueblado;
     private boolean tienePatio;
     private String descripcion;

    public Publicacion() {
    }

	
    public Publicacion(Usuario usuario, String tipo, String zona, String calle, int altura, String pago, int precio, int cantHabitaciones, int metrosCuadrados, boolean esAmueblado, boolean tienePatio, String descripcion) {
        this.usuario = usuario;
        this.tipo = tipo;
        this.zona = zona;
        this.calle = calle;
        this.altura = altura;
        this.pago = pago;
        this.precio = precio;
        this.cantHabitaciones = cantHabitaciones;
        this.metrosCuadrados = metrosCuadrados;
        this.esAmueblado = esAmueblado;
        this.tienePatio = tienePatio;
        this.descripcion = descripcion;
    }
    public Publicacion(Usuario usuario, String tipo, String zona, String calle, int altura, Integer piso, Integer depto, String pago, int precio, int cantHabitaciones, int metrosCuadrados, boolean esAmueblado, boolean tienePatio, String descripcion) {
       this.usuario = usuario;
       this.tipo = tipo;
       this.zona = zona;
       this.calle = calle;
       this.altura = altura;
       this.piso = piso;
       this.depto = depto;
       this.pago = pago;
       this.precio = precio;
       this.cantHabitaciones = cantHabitaciones;
       this.metrosCuadrados = metrosCuadrados;
       this.esAmueblado = esAmueblado;
       this.tienePatio = tienePatio;
       this.descripcion = descripcion;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getZona() {
        return this.zona;
    }
    
    public void setZona(String zona) {
        this.zona = zona;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public int getAltura() {
        return this.altura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public Integer getPiso() {
        return this.piso;
    }
    
    public void setPiso(Integer piso) {
        this.piso = piso;
    }
    public Integer getDepto() {
        return this.depto;
    }
    
    public void setDepto(Integer depto) {
        this.depto = depto;
    }
    public String getPago() {
        return this.pago;
    }
    
    public void setPago(String pago) {
        this.pago = pago;
    }
    public int getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getCantHabitaciones() {
        return this.cantHabitaciones;
    }
    
    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }
    public int getMetrosCuadrados() {
        return this.metrosCuadrados;
    }
    
    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    public boolean esAmueblado() {
        return this.esAmueblado;
    }
    
    public void setEsAmueblado(boolean esAmueblado) {
        this.esAmueblado = esAmueblado;
    }
    public boolean tienePatio() {
        return this.tienePatio;
    }
    
    public void setTienePatio(boolean tienePatio) {
        this.tienePatio = tienePatio;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

@Override
    public String toString() {
        String patio ="";
        String amueblado ="";
        if(tienePatio)
            patio=", con patio";
        if(esAmueblado)
            amueblado=", es amueblado";
        
        String piso_depto="";
        if(piso>0 || depto>0)
            piso_depto= ", piso " + piso + ", depto " + depto;
        
        return tipo + " con pago " + pago + " de $" + precio + ", en zona " + zona + ", calle " + calle +" "+altura + piso_depto + ", con " + cantHabitaciones + " habitaciones, " + metrosCuadrados + " metros cuadrados"+ patio + amueblado +". Descripcion extra: " + descripcion;
    }


}


