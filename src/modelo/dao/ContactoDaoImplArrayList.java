package modelo.dao;
import modelo.javabean.Contacto;

import java.util.ArrayList;
public class ContactoDaoImplArrayList {
    private ArrayList<Contacto> lista;
    private String nombre;

    public ContactoDaoImplArrayList() {
        nombre="mi agenda";
        lista = new ArrayList<>();
        cargardatos();
    }


    private void  cargardatos() {
        lista.add(new Contacto("Juan","Gutierrez","111222333","juan@mecanico.com","Taller Gutierrez"));
        lista.add(new Contacto("Marta","Sainz", "965789444","marta@decoratucasa.es","Decoración Total"));
        lista.add(new Contacto("Lucia","Martínez","555879545","lucia@vendetucasa.com","ForoCasa"));
        lista.add(new Contacto("Mario","Sanchez","522641158","mario@taxista.es","PideTaxi"));
        lista.add(new Contacto("Mario","Dominguez","115589647","mario@fontanero.com", "MarioFontareo"));
    }





    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //  se crean al improtar contactoDaoImplArrayList(metodos no com el import)
    @Override
    public boolean altaContacto(Contacto contacto) {
        contacto.setNombre(nombre);
        return true;
    }

    @Override
    public boolean eliminarContacto(Contacto contacto) {
        return eliminarContacto(buscarUno(nombre));

    }

    @Override
    public Contacto buscarUno(String nombre) {
        // creas la variable autor
        Contacto contacto =new Contacto();
        contacto.setNombre(nombre);
        int pos = contacto.indexOf(contacto);
        if (pos == -1) {
            return null;
        }else {
            return contacto.get(pos);
        }
    }

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


    @Override
    public Contacto buscarUno(String nombre) {
        // TODO Auto-generated method stub
        return null;
    }

}
}
