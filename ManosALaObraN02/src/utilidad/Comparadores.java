package utilidad;

import entidad.Jugador;
import java.util.Comparator;

public class Comparadores {

     public static Comparator<Jugador> ordenarPorNumeroAscescendente = new Comparator<Jugador>() {
        @Override
        public int compare(Jugador o1, Jugador o2) {
            return o1.getNumero().compareTo(o2.getNumero());
        }
    };
}
