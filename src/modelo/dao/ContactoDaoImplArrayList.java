package modelo.dao;
import modelo.javabean.Contacto;

import java.util.ArrayList;
public class ContactoDaoImplArrayList implements ContactoDao {
    private ArrayList<Contacto> lista;
    private String nombre;

    /**
     * Creo un método  con una ArrayList y cargardatos() es un método para introducir los datos
     */
    public ContactoDaoImplArrayList() {
        nombre="mi agenda";
        lista = new ArrayList<>();
        cargardatos();
    }

    /**
     * Con el constructor con todo creado en la clase Contacto  permite introducir de forma ordenada sindo lista la variable que hace referencia al ArrayList
     */
    private void  cargardatos() {
        lista.add(new Contacto("Juan","Gutierrez","111222333","juan@mecanico.com","Taller Gutierrez"));
        lista.add(new Contacto("Marta","Sainz", "965789444","marta@decoratucasa.es","Decoración Total"));
        lista.add(new Contacto("Lucia","Martínez","555879545","lucia@vendetucasa.com","ForoCasa"));
        lista.add(new Contacto("Mario","Sanchez","522641158","mario@taxista.es","PideTaxi"));
        lista.add(new Contacto("Mario","Dominguez","115589647","mario@fontanero.com", "MarioFontareo"));
    }


    /**
     * estos son los geter and seter  que no tiene mucha utilidad es de forma obtativa  paro no influye
     * @return
     */
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //  se crean al improtar contactoDaoImplArrayList(metodos no com el import)

    /**
     * crea un contacto nuevo
     * @param contacto
     * @return true
     */
    @Override
    public boolean altaContacto(Contacto contacto) {
        contacto.setNombre(nombre);
        return true;
    }

    /**
     * te muestra el nombre eliminado
     * @param contacto
     * @return nombre
     */
    @Override
    public boolean eliminarContacto(Contacto contacto) {
        return lista.remove(contacto);
    }

    /**
     * te indica en que posicion esta en caso de que exista  te indica la posicion y si no te devuekve -1 es decir no existe
     * @param nombre
     * @return null o posicion
     */
    @Override
    public Contacto buscarUno(String nombre) {
        for (Contacto contacto : lista) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    /**
     * busca el numero introducido y si lo encuentra ta muestra la informacion y si no -1
     * @param telefono
     * @return -1 o posEncontrada
     */
    @Override
    public Contacto buscarTelefono(String telefono) {
        int posEncontrada= -1;
        //creamos un for para recorrer array
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTelefono()==telefono) {
                posEncontrada=i;
                break;
            }
        }
        if (posEncontrada == -1) {
            return null;
        }else {

            return lista.get(posEncontrada);

        }
    }

    /**
     * busca el email introducido y si lo encuentra ta muestra la informacion y si no -1
     * @param email
     * @return -1 o posEncontrada
     */
    @Override
    public Contacto buscarEmail(String email) {
        // creamos variable con valor negativo para saber si esta o no
        int posEncontrada= -1;
        //creamos un for para recorrer array
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getEmail()==email) {
                posEncontrada=i;
                break;
            }
        }
        if (posEncontrada == -1) {
            return null;
        }else {

            return lista.get(posEncontrada);

        }
    }

    /**
     * Al crear la variable aux para referirse al arrayList
     * @param nombre
     * @return null o contacto
     */
    @Override
    public ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre) {
        ArrayList<Contacto> aux= new ArrayList<>();



        for(Contacto contacto : lista) {
            if (lista.size()==3) {
                aux.add(contacto);
            }else {
                return null;

            }

        }
        return null;
    }

    /**
     *  permite cambiar los datos en caso de sea correctoes true y si no  se pudo es false
     * @param contacto
     * @return false o true
     */

    @Override
    public boolean cambiarDatos(Contacto contacto) {
        int pos = lista.indexOf(contacto);
        if (pos== -1) {
            return false;
        }else {
            lista.set(pos, contacto);
            return true;
        }

    }

    /**
     * Si es correcto te vuelve la informacion y si no te devuelve todo por defecto
     * @param empresa
     * @return aux o contacto
     */
    @Override
    public ArrayList<Contacto> contactosPorEmpresa(String empresa) {
        ArrayList<Contacto> aux= new ArrayList<>();



        for(Contacto contacto : lista) {
            if (contacto.getEmpresa()==empresa) {
                aux.add(contacto);
            }
        }
        return aux;


    }


}

