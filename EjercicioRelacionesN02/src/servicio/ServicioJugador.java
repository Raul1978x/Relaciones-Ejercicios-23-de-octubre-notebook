package servicio;

import entidad.Jugador;
import entidad.RevolverAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Jugador: esta clase posee los siguientes atributos: id (representa el
 * número del jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por
 * ejemplo) y mojado (indica si está mojado o no el jugador). El número de
 * jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no está
 * en este rango, por defecto será 6. Métodos: • disparo(Revolver r): el método,
 * recibe el revolver de agua y llama a los métodos de mojar() y
 * siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si
 * el revolver tira el agua, el jugador se moja. El atributo mojado pasa a false
 * y el método devuelve true, sino false.
 *
 * @author Raul
 */
public class ServicioJugador {

    private Jugador j1;
    private Scanner leer;
    private ArrayList<Jugador> jugadores;

    public ServicioJugador() {

        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.j1 = new Jugador();
        this.jugadores = new ArrayList<>();

    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void cantidadJugadores() {

        System.out.println("Ingrese la cantidad de jugadores: ");
        int cantJug = leer.nextInt();
        if (cantJug > 6 || cantJug < 1) {
            cantJug = 6;
        } else {
            cargaJugador(cantJug);
        }
    }

    public Jugador cargaJugador(Integer cantJug) {

        do {
            System.out.print("Ingrese nombre de jugador:");
            j1.setNombre(leer.next());
            j1.setId(cantJug);
            j1.setMojado(Boolean.FALSE);
            jugadores.add(j1);
            cantJug = cantJug - 1;
        } while (cantJug != 0);
        return j1;
    }

    public void disparo(ServicioRevolverAgua revolverAgua) {
        revolverAgua.mojar();

    }
}
