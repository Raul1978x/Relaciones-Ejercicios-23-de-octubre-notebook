package servicio;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Veterinaria {

    private ArrayList<Persona> personas;
    private ArrayList<Perro> perros;
    private ArrayList<Perro> perrosAdoptados;
    private ServicioPerro servicioPerro;
    private ServicioPersona servicioPersona;
    private Scanner leer;

    public Veterinaria() {
        this.personas = new ArrayList<>();
        this.servicioPerro = new ServicioPerro();
        this.servicioPersona = new ServicioPersona();
        this.perros = new ArrayList<>();
        this.perrosAdoptados = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    private void cargarPersonas() {
        do {
            personas.add(servicioPersona.crearPersona());
            System.out.println("Desea cargar otro persona?(s/n)");
        } while (leer.next().equalsIgnoreCase("s"));

    }

    private void cargarPerros() {
        do {
            perros.add(servicioPerro.crearPerro());
            System.out.println("Desea cargar otro perro?(s/n)");
        } while (leer.next().equalsIgnoreCase("s"));
    }

    private void mostrarListaPerros() {

        System.out.println("************LISTA DE PERROS************");
        for (Perro perro : perros) {
            System.out.println(perro.toString());
        }
        System.out.println("***************************************");

    }

    private void mostrarListaPerrosAdoptados() {
        System.out.println("*******LISTA DE PERROS ADOPTADOS*******");
        for (Perro perro : perrosAdoptados) {
            System.out.println(perro.toString());
        }
        System.out.println("***************************************");

    }

    private void mostrarListaPersonas() {
        System.out.println("***********LISTA DE PERSONAS***********");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre().toUpperCase() + "\t" + persona.getApellido().toUpperCase() + "\tAdoptó: " + persona.isAdopto());
        }
        System.out.println("***************************************");

    }

    private void adoptarPerros() {
        if (!perros.isEmpty()) {
            mostrarListaPerros();
            System.out.println("Seleccione el nombre del perro a adoptar:");
            String nombrePerro = leer.next();
            System.out.println("Seleccione el nombre de la persona que va a adoptar:");
            String nombrePers = leer.next();
            for (Persona persona : personas) {
                if (persona.getNombre().equalsIgnoreCase(nombrePers)) {
                    for (int i = 0; i < perros.size(); i++) {
                        if (perros.get(i).getNombre().equalsIgnoreCase(nombrePerro)) {
                            persona.setPerro(perros.get(i));
                            persona.setAdopto(true);
                            perros.get(i).setAdoptado(true);
                            perrosAdoptados.add(perros.get(i));
                            perros.remove(perros.get(i));
                        }
                    }
                }
            }
        } else {
            System.out.println("No hay perros disponibles para adopcion");
        }
    }

    public void menu() {
        String op = "";
        boolean bucle = true;
        do {
            System.out.println("*****************MENU******************");
            System.out.println("1.-Cargar personas\n"
                    + "2.-Cargar Perros\n"
                    + "3.-Mostrar Lista de Personas\n"
                    + "4.-Mostrar Lista de Perros\n"
                    + "5.-Adoptar Perros\n"
                    + "6.-Mostrar Perros Adoptados\n"
                    + "x.-Salir");
            System.out.println("***************************************");
            System.out.println("Ingrese la opcion deseada:");
            op = leer.next();
            switch (op) {
                case "1":
                    cargarPersonas();
                    break;
                case "2":
                    cargarPerros();
                    break;
                case "3":
                    mostrarListaPersonas();
                    break;
                case "4":
                    mostrarListaPerros();
                    break;
                case "5":
                    adoptarPerros();
                    break;
                case "6":
                    mostrarListaPerrosAdoptados();
                    break;
                case "x":
                    System.out.println("Hasta luego...!!!");
                    bucle = false;
                    break;
                default:

                    break;
            }
        } while (bucle);
    }

}
