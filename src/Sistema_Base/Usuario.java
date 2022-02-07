package Sistema_Base;

/**
 * Clase que hace de usuario, contiene todos sus datos
 * @author Mainque
 */
public class Usuario {
    //Atributos
    private int dni;
    private String nombre;
    private String email;
    private String telefono;
    private String localidad;
    
    //Constructor
    public Usuario(int dni, String nombre, String email, String telefono, String localidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.localidad = localidad;
    }
    
    //getters
    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getLocalidad() {
        return localidad;
    }
    
}
