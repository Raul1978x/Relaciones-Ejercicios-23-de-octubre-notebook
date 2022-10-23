package servicio;

import entidad.Jugador;
import java.util.Scanner;

/**
 * Métodos: • disparo(Revolver r): el método, recibe el revolver de agua y llama
 * a los métodos de mojar() y siguienteChorro() de Revolver. El jugador se
 * apunta, aprieta el gatillo y si el revolver tira el agua, el jugador se moja.
 * El atributo mojado pasa a false y el método devuelve true, sino false.
 *
 * @author elias
 */
public class ServicioJugador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Jugador cargarJug = new Jugador();
//    ServicioJuego servicioJuego = new ServicioJuego();

//    public void disparo(ServicioRevolver r) {
//        boolean band = false;
//        String resp = leer.next();
//        if (resp.equalsIgnoreCase("s")) {
//            if (r.mojar()) {
//                band = true;
//                cargarJug.setMojado(true);
//                System.out.println("Te mojaste");
//            } else {
//                r.siguienteChorro();
//                System.out.println("Safaste");
//            }
//        } else {
//            System.out.println("Sos un Cagon");
//        }
//    }
    public boolean disparo(ServicioRevolver r, Jugador CargarJug) {
        String resp = leer.next();
        boolean band = false;
        if (resp.equalsIgnoreCase("s")) {
            if (r.mojar()) {
                band = true;
            } else {
                r.siguienteChorro();
                System.out.println("Safaste");
            }
        } else {
            System.out.println("Sos un Cagon");
        }
        return band;
    }
}
