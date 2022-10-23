//Ahora deberemos en el main crear dos Personas y dos Perros.
package servicio;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPerro {

    private Scanner leer;
    private ArrayList<Perro> listaPerros1;

    public ServicioPerro() { //instancias el perro
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaPerros1 = new ArrayList<>();
    }

    private Perro crearPerro() {
        Perro p1 = new Perro();
        System.out.println(" Ingrese el nombre del perro: ");
        p1.setNombre(leer.next());
        System.out.println(" Ingrese la raza: ");
        p1.setRaza(leer.next());
        System.out.println(" Ingrese la edad: ");
        p1.setEdad(leer.nextInt());
        System.out.println(" Ingrese el tamaño: ");
        p1.setTamano(leer.next());
        return p1;
    }

    public void listaPerros() {
        do {
            listaPerros1.add(crearPerro());
            System.out.println("Desea agregar otro perro: s/n ");
        } while (leer.next().equalsIgnoreCase("s"));
        System.out.println(listaPerros1);
    }

    public ArrayList<Perro> getListaPerros1() {
        return listaPerros1;
    }

}
