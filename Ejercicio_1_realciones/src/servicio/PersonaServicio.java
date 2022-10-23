//Ahora deberemos en el main crear dos Personas y dos Perros.
package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaServicio {

    private Persona persona;
    private Scanner leer;
    private ArrayList<Persona> listaPersonas;
    private ServicioPerro servicioPerro;
    private ArrayList<Perro> perros;

    public PersonaServicio() {
        this.persona = new Persona();
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.servicioPerro = new ServicioPerro();
        this.listaPersonas = new ArrayList<>();
        this.perros = new ArrayList<>();
    }

    private Persona crearPersona() {
        System.out.println(" Ingrese el nombre de la persona: ");
        persona.setNombre(leer.next());
        System.out.println(" Ingrese el apellido: ");
        persona.setApellido(leer.next());
        System.out.println(" Ingrese la edad: ");
        persona.setEdad(leer.nextInt());
        System.out.println(" Ingrese el DNI: ");
        persona.setDocumento(leer.next());
        return persona;
    }

    public void cargarPersonas() {
        do {
            crearPersona();
            listaPersonas.add(persona);
            System.out.println("Desea cargar otra persona?");
        } while (leer.next().equalsIgnoreCase("s"));
    }

    private void asignarPerro() {
        
        String nombrePerro;
        String nombreGenerosa;
//        System.out.println(servicioPerro.getListaPerros1().toString());
        System.out.println(perros.toString());
        if (!servicioPerro.getListaPerros1().isEmpty()) {
            System.out.println(servicioPerro.getListaPerros1().toString());
            System.out.println("seleccione el nombre del perro a adoptar ");
            nombrePerro = leer.next();
            System.out.println(listaPersonas.toString());
            System.out.println("Seleccione nombre persona generosa");
            nombreGenerosa = leer.next();
            for (Perro aux : servicioPerro.getListaPerros1()) {
                if (aux.getNombre().equalsIgnoreCase(nombrePerro)) {
                    for (Persona aux2 : listaPersonas) {
                        if (aux2.getNombre().equalsIgnoreCase(nombreGenerosa)) {
                            aux2.setPerroPersona(aux);
                            System.out.println(aux2.toString());
                        }
                    }
                }
            }
        }
    }

    public void asignarPerros() {
        do {
            asignarPerro();
            System.out.println("Desea aisgnar otro perro?");
        } while (leer.next().equalsIgnoreCase("s"));
    }
//   public void listaPerros (){
//       String opcion;
//       do {
//           perritos.add(crearPerro());
//           System.out.println("Desea agregar otro perro: s/n ");
//           opcion = leer.next();
//       } while (opcion.equalsIgnoreCase("s"));
//       
//   }
}
