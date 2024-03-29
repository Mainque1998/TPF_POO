package cl.pojos;
// Generated 15 mar. 2022 19:19:46 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int dni;
     private String password;
     private String nombre;
     private String email;
     private String telefono;
     private String localidad;
     private Set<Publicacion> publicacions = new HashSet<Publicacion>(0);

    public Usuario() {
    }

	
    public Usuario(int dni, String password, String nombre, String email, String telefono, String localidad) {
        this.dni = dni;
        this.password = password;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.localidad = localidad;
    }
    public Usuario(int dni, String password, String nombre, String email, String telefono, String localidad, Set<Publicacion> publicacions) {
       this.dni = dni;
       this.password = password;
       this.nombre = nombre;
       this.email = email;
       this.telefono = telefono;
       this.localidad = localidad;
       this.publicacions = publicacions;
    }
   
    public int getDni() {
        return this.dni;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getLocalidad() {
        return this.localidad;
    }
    
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public Set<Publicacion> getPublicacions() {
        return this.publicacions;
    }
    
    public void setPublicacions(Set<Publicacion> publicacions) {
        this.publicacions = publicacions;
    }




}


