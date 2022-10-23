package entidad;

import java.util.Set;

/**
 * Realiza un programa en donde exista una clase Jugador que contenga nombre,
 * apellido, posición y número. Luego otra clase Equipo que contenga una
 * colección de jugadores. Una vez hecho esto, desde el main recorreremos el
 * equipo mostrando la información de cada jugador.
 *
 * @author Raul Gomez
 */
public class Equipo {

    private Set<Jugador> jugadores;

    public Equipo() {
    }

    public Equipo(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Titulares:\n" + jugadores +"\n";
    }

}
