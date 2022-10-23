
package entidad;

import java.util.HashSet;
import java.util.Objects;



/**
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto
 * de Jugadores) y Revolver 
 * Métodos: • llenarJuego(ArrayList<Jugador<jugadores,
 * Revolver r): este método recibe los jugadores y el revolver para guardarlos
 * en los atributos del juego.
 *
 * 10 • ronda(): cada ronda consiste en un jugador que se apunta con el revolver
 * de agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se moja
 * y se termina el juego, sino se moja, se pasa al siguiente jugador hasta que
 * uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se debe
 * mostrar que jugador se mojó. Pensar la lógica necesaria para realizar esto,
 * usando los atributos de la clase Juego.
 *
 * @author elias
 */
public class Juego {
   private HashSet <Jugador> Jugadores;
   private Revolver revolver;

    public Juego() {
    }

    public Juego(HashSet<Jugador> Jugadores, Revolver revolver) {
        this.Jugadores = Jugadores;
        this.revolver = revolver;
    }

    public HashSet<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(HashSet<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.Jugadores);
        hash = 37 * hash + Objects.hashCode(this.revolver);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Juego other = (Juego) obj;
        if (!Objects.equals(this.Jugadores, other.Jugadores)) {
            return false;
        }
        if (!Objects.equals(this.revolver, other.revolver)) {
            return false;
        }
        return true;
    }
   
}
