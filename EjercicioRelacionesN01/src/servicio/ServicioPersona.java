package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioPersona {

    private Scanner leer;
    private ServicioPerro servicioPerro;
    private List<Persona> listaPersonas;
    private List<Perro> listaPerros;
    private boolean personaEncontrada = false;
    private boolean perroEncontrado = false;
    private Perro perroObtenido = new Perro();
    private Persona personaObtenida = new Persona();

    public ServicioPersona() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.servicioPerro = new ServicioPerro();
        this.listaPersonas = new ArrayList<>();
        this.listaPerros = new ArrayList<>();
    }

    public Persona crearPersona() {
        Persona p = new Persona();
        System.out.println("Ingrese nombre de la persona: ");
        p.setNombre(leer.next());
        System.out.println("Ingrese apellido de la persona: ");
        p.setApellido(leer.next());
        System.out.println("Ingrese edad de la persona: ");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese DNI de la persona: ");
        p.setDNI(leer.next());
        return p;
    }

    public void crearListaDePersonas() {

        Persona persona1 = new Persona("Raul", "Gomez", 44, "22444555");
        Persona persona2 = new Persona("Alberto", "Gonzalez", 35, "33222111");
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
    }

    public void buscarPersona() {
        crearListaDePersonas();

        System.out.println(
                "Ingrese el nombre de la persona que quiere adoptar el perro:");
        String nomb = leer.next();

        System.out.println(
                "Ingrese el apellido de la persona que quiere adoptar el perro:");
        String apell = leer.next();
        for (Persona aux : listaPersonas) {
            if (aux.getNombre().equalsIgnoreCase(nomb) && aux.getApellido().equalsIgnoreCase(apell)) {
                personaEncontrada = true;
            }
        }
        if (!personaEncontrada) {
            System.out.println("la persona buscada no se encuentra en nuestros registros");
            System.out.println("Desea agregarla?");
            String op = leer.next();
            if (op.equalsIgnoreCase("s")) {
                agregarPersona();
                System.out.println(listaPersonas);
                System.out.println("desea adoptar un perro?");
                String op1 = leer.next();
                if(op1.equalsIgnoreCase("s")){
                    asignarPerro();
                }
            }else {
                System.out.println("Gracias por utilizar nuestros servicios");
            }
        }
    }

    public void agregarPersona() {
        listaPersonas.add(crearPersona());

    }

    public void buscarPerro() {

        listaPerros.addAll(servicioPerro.crearListaDePerros());

        System.out.println("***********Lista de Perros***********");
        System.out.println(listaPerros);
        System.out.println("************************************");
        System.out.println("Ingrese el nombre del perro a adoptar: ");
        String nombPerro = leer.next();
        for (Perro auxPerro : listaPerros) {
            if (auxPerro.getNombre().equalsIgnoreCase(nombPerro)) {
                perroEncontrado = true;
                perroObtenido = auxPerro;
            }
        }
    }

    public void asignarPerro() {
        buscarPersona();
        if (personaEncontrada) {
            buscarPerro();
            if (perroEncontrado) {
                personaObtenida.setPerro(perroObtenido);
                listaPerros.remove(perroObtenido);
                System.out.println(personaObtenida);
                System.out.println("Perros disponibles para adoptar:\n" + listaPerros);
            }
//        listaPerros.addAll(servicioPerro.crearListaDePerros());
//        crearListaDePersonas();
//        System.out.println("Ingrese el nombre de la persona que quiere adoptar el perro:");
//        String nomb = leer.next();
//        System.out.println("Ingrese el apellido de la persona que quiere adoptar el perro:");
//        String apell = leer.next();
//
//        for (Persona aux : listaPersonas) {
//
//            if (aux.getNombre().equalsIgnoreCase(nomb) && aux.getApellido().equalsIgnoreCase(apell)) {
//        if (personaEncontrada && perroEncontrado) {
//            System.out.println("***********Lista de Perros***********");
//            System.out.println(listaPerros);
//            System.out.println("************************************");
//            System.out.println("Ingrese el nombre del perro a adoptar: ");
//            String nombPerro = leer.next();
//        for (Perro auxPerro : listaPerros) {
//            if (auxPerro.getNombre().equalsIgnoreCase(nombPerro) && aux.getNombre().equalsIgnoreCase(nomb)) {
//                aux.setPerro(auxPerro);
//                System.out.println(aux);
//            }
//        }
//    }
//}
        }
    }
}
