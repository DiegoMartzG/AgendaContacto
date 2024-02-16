package modelo.dao;
import modelo.javabean.Contacto;

import java.util.ArrayList;
public interface ContactoDao {
    /**
     * es para dar de alta a un contacto nuevo  si secea devuelve true si no false
     * busca en la clase contacto
     * @param contacto
     * @return boolean
     */
    boolean altaContacto(Contacto contacto);
    /**
     * es para eliminar un contacto existentes  si se elimina devuelve true si no false
     * busca en la clase contacto
     * @param contacto
     * @return boolean
     */
    boolean eliminarContacto(Contacto contacto);
    /**
     * es para buscar  un nombre si existe te lo muestra y si no te devuelve null
     * busca en la clase contacto> apartado nombre
     * @param nombre
     * @return String
     */
    Contacto buscarUno(String nombre);
    /**
     * es para buscar  un telefono si existe te lo muestra y si no te devuelve null
     * busca en la clase contacto> apartado telefono
     * @param telefono
     * @return String
     */
    Contacto buscarTelefono(String telefono);
    /**
     * es para buscar  un email si existe te lo muestra y si no te devuelve null
     * busca en la clase contacto> apartado email
     * @param email
     * @return String
     */
    Contacto buscarEmail(String email);
    /**
     * es para buscar  un nombre si existe te lo muestra las tres primeras letras y si no te devuelve null
     * busca en la clase contacto> apartado nombre
     * @param nombre
     * @return String
     */
    ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre);
    /**
     * es para modificar el contenido del array si lo modificas es true y si no false
     * @param contacto
     * @return boolean
     */
    boolean cambiarDatos(Contacto contacto);
    /**
     * es para buscar  un nombre de la empresa  si existe te lo muestra y si no te devuelve null
     * busca en la clase contacto> apartado empresa
     * @param empresa
     * @return String
     */
    ArrayList<Contacto> contactosPorEmpresa(String empresa);

}
