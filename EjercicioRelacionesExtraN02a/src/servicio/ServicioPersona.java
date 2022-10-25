package servicio;

import entidad.Asiento;
import entidad.Persona;
import java.util.Scanner;

public class ServicioPersona {

    private Scanner leer;
    private Persona persona;

    public ServicioPersona() {
        this.leer = new Scanner(System.in).useDelimiter("\n");

    }
    public Persona crearPersona(){
        persona = new Persona();
        System.out.println("Ingrese el nombre de la persona:");
        persona.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona:");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el dinero disponible de la persona:");
        persona.setDineroDisponible(leer.nextInt());
        return persona;
    }

   
}
