package modelo.javabean;

import java.util.Objects;

/**
 * esta es la creacion  de los atrivutos en privados para posteriormente introducir los datos en el constructor
 */
public class Contacto {
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private String empresa;
    /**
     * este metodo sirve para la creacion del constructor con toodo de Contacto
     */
    // constructor con todo
    public Contacto(String nombre, String apellidos, String telefono, String email, String empresa) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.empresa = empresa;
    }
    // constructor sin nada

    /**
     * este metodo sirve para la creacion del constructor sin nada de Contacto
     */
    public Contacto() {
        super();
    }


    //getter and setter
    /**
     * este metodo sirve para introducir y sacar  informacion
     */
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    //ToString
    /**
     * Este metodo sirve para que no coja los métodos de Object
     */
    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email=" + email
                + ", empresa=" + empresa + "]";
    }
    // hashCode y Equals

    /**
     * Estos método junto al hasCode  lo que hace es comparar por el campo indicado en la creación del método
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre);
    }
/**
        * Estos método junto al equal  lo que hace es comparar por el campo indicado en la creación del método
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
