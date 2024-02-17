package testing;

import modelo.dao.ContactoDaoImplArrayList;
import modelo.javabean.Contacto;

import java.util.ArrayList;

public class TestArrayListContactos {

    /**
     * Método principal para ejecutar las pruebas.
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        TestArrayListContactos cdao = new TestArrayListContactos();
        cdao.testAltaContacto();
        cdao.testEliminarContacto();
        cdao.testBuscarUno();
        cdao.testBuscarTelefono();
        cdao.testBuscarEmail();
        cdao.testBuscarContactosPorTresPrimeros();
        cdao.testCambiarDatos();
        cdao.testContactosPorEmpresa();
    }


    /**
     * Prueba la inserción de un nuevo contacto.
     */
    void testAltaContacto() {
        ContactoDaoImplArrayList dao = new ContactoDaoImplArrayList();
        Contacto nuevoContacto = new Contacto("Juan", "Pérez", "123456789", "juan@example.com", "Empresa");

        System.out.println("Prueba de altaContacto:");
        if (dao.altaContacto(nuevoContacto)) {
            System.out.println("Contacto agregado correctamente.");
        } else {
            System.out.println("Error al agregar el contacto.");
        }
    }

    /**
     * Prueba la eliminación de un contacto existente.
     */
    void testEliminarContacto() {
        ContactoDaoImplArrayList dao = new ContactoDaoImplArrayList();
        Contacto contactoAEliminar = dao.buscarUno("Deivi");

        System.out.println("Prueba de eliminarContacto:");
        if (dao.eliminarContacto(contactoAEliminar)) {
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("Error al eliminar el contacto.");
        }
    }

    /**
     * Prueba la busqueda de un contacto existente.
     */
    void testBuscarUno() {
        ContactoDaoImplArrayList dao = new ContactoDaoImplArrayList();

        System.out.println("Prueba de buscarUno:");
        Contacto encontrado = dao.buscarUno("Deivi");
        if (encontrado != null) {
            System.out.println("Contacto encontrado: " + encontrado);
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    /**
     * Prueba la busqueda de un teléfono existente.
     */
    void testBuscarTelefono() {
        ContactoDaoImplArrayList dao = new ContactoDaoImplArrayList();

        System.out.println("Prueba de buscarTelefono:");
        Contacto encontrado = dao.buscarTelefono("644526468");
        if (encontrado != null) {
            System.out.println("Contacto encontrado: " + encontrado);
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    /**
     * Prueba la busqueda de un email existente.
     */
    void testBuscarEmail() {
        ContactoDaoImplArrayList dao = new ContactoDaoImplArrayList();

        System.out.println("Prueba de buscarEmail:");
        Contacto encontrado = dao.buscarEmail("deivi@gmail.com");
        if (encontrado != null) {
            System.out.println("Contacto encontrado: " + encontrado);
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    /**
     * Prueba la busqueda de contactos existentes por los tres primeros caracteres.
     */
    void testBuscarContactosPorTresPrimeros() {
        ContactoDaoImplArrayList dao = new ContactoDaoImplArrayList();

        System.out.println("Prueba de buscarContactosPorTresPrimeros:");
        ArrayList<Contacto> encontrados = dao.buscarContactosPorTresPrimeros("Jos");
        if (!((ArrayList<?>) encontrados).isEmpty()) {
            for (Contacto c : encontrados) {
                System.out.println("Contacto encontrado: " + c);
            }
        } else {
            System.out.println("No se encontraron contactos.");
        }
    }

    /**
     * Prueba el cambio de datos.
     */
    void testCambiarDatos() {
        ContactoDaoImplArrayList dao = new ContactoDaoImplArrayList();
        Contacto contactoAModificar = dao.buscarUno("Deivi");

        System.out.println("Prueba de cambiarDatos:");
        if (contactoAModificar != null) {
            contactoAModificar.setApellidos("González");
            if (dao.cambiarDatos(contactoAModificar)) {
                System.out.println("Contacto modificado correctamente.");
            } else {
                System.out.println("Error al modificar el contacto.");
            }
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    /**
     * Prueba la busqueda de contactos por empresa.
     */
    void testContactosPorEmpresa() {
        ContactoDaoImplArrayList dao = new ContactoDaoImplArrayList();

        System.out.println("Prueba de contactosPorEmpresa:");
        ArrayList<Contacto> contactosEmpresa = dao.contactosPorEmpresa("Etecsa");
        if (!contactosEmpresa.isEmpty()) {
            for (Contacto c : contactosEmpresa) {
                System.out.println("Contacto de Etecsa: " + c);
            }
        } else {
            System.out.println("No se encontraron contactos de Etecsa.");
        }
    }
}

