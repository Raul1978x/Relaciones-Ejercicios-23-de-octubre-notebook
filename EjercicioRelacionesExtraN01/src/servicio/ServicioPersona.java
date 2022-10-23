package servicio;

import Entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {

    private Persona persona;
    private Scanner leer;

    public ServicioPersona() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
      
    }

    public Persona crearPersona(){
        persona = new Persona();
        
        System.out.println("Ingrese el nombre del persona:");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido del persona:");
        persona.setApellido(leer.next());
        System.out.println("Ingrese el DNI del persona:");
        persona.setDocumento(leer.next());
        System.out.println("Ingrese el edad del persona:");
        persona.setEdad(leer.nextInt());

        return persona;
    }
    
    
}
