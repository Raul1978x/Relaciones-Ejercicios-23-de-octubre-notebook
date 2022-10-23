package ejercicio_1_realciones;

import servicio.PersonaServicio;
import servicio.ServicioPerro;

public class Ejercicio_1_realciones {

    public static void main(String[] args) {


      PersonaServicio ps = new PersonaServicio();
      ServicioPerro serviPerro = new ServicioPerro();
      
    serviPerro.listaPerros();
    ps.cargarPersonas();
    ps.asignarPerros();



    }
    
}
