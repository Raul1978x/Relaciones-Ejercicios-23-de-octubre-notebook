package manosalaobran02;

import entidad.Jugador;
import servicio.ServicioJugador;

/**
 * Realiza un programa en donde exista una clase Jugador que contenga nombre,
 * apellido, posición y número. Luego otra clase Equipo que contenga una
 * colección de jugadores. Una vez hecho esto, desde el main recorreremos el
 * equipo mostrando la información de cada jugador.
 *
 * @author Raul Gomez
 */
public class ManosALaObraN02 {

    public static void main(String[] args) {

        ServicioJugador servicioJugador = new ServicioJugador();
        servicioJugador.fabricaEquipo();
        servicioJugador.imprimirLista();

    }

}
