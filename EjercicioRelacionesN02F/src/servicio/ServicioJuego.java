package servicio;

import entidad.Jugador;
import java.util.ArrayList;

import java.util.Scanner;

/**
 * Métodos: • llenarJuego(ArrayList <Jugador> jugadores, Revolver r): este
 * método recibe los jugadores y el revolver para guardarlos en los atributos
 * del juego.
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
public class ServicioJuego {

    ArrayList<Jugador> integrantes;
    Jugador sj = new Jugador();
    ServicioRevolver servRev = new ServicioRevolver();
    ServicioJugador servJug = new ServicioJugador();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    boolean fin = false;

    public void llenarJugadores() {
        integrantes = new ArrayList();

        System.out.println("Cuantos jugadores juegan? ");
        int resp = leer.nextInt();
        if (resp > 6 || resp < 1) {
            resp = 6;
            System.out.println("Opcion no válida, se asignan \npor defecto 6 jugadores");
        }
        int cont = 0;
        do {
            Jugador auxju = new Jugador();
            System.out.println("Ingrese su nombre");
            auxju.setNombre(leer.next());
            auxju.setId((cont + 1));
            System.out.println("Su ID: " + auxju.getId());
            cont++;
            integrantes.add(auxju);
        } while (resp != cont);

    }

    public void ronda() {
        servRev.llenarRevolver();

        for (int i = 0; i < integrantes.size() || fin; i++) {
            System.out.println("El revolver esta cargado, " + integrantes.get(i).getNombre().toUpperCase() + "\n¿apretarás el gatillo(s/n)?");
            integrantes.get(i).setMojado(servJug.disparo(servRev, sj));
            if (integrantes.get(i).isMojado()) {
                integrantes.get(i).setMojado(true);
               System.out.println("El jugador " + integrantes.get(i).getNombre().toUpperCase() + " paso a mejor vida.");
                break;
            }
        }
        
        imprimirLista();
    }

    public void imprimirLista() {
        System.out.println("\nGAME OVER\n*************RESULTADOS*************\n");
        for (Jugador integrante : integrantes) {
            System.out.println(integrante);
        }
        System.out.println("\n************************************");
    }
}
