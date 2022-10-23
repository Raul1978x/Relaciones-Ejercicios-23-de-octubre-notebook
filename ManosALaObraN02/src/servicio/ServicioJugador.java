package servicio;

import entidad.Equipo;
import entidad.Jugador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import utilidad.Comparadores;

public class ServicioJugador {

    private Set<Jugador> jugadores;
    private List<Jugador> jugadoresOrdenados;

    public ServicioJugador() {
        jugadores = new HashSet();
        jugadoresOrdenados = new ArrayList<>();

    }
    Equipo equipo = new Equipo();

    public void fabricaEquipo() {
        Jugador j1 = new Jugador("Damian", "Martinez", "arquero", 1);
        jugadores.add(j1);
        jugadoresOrdenados.add(j1);
        Jugador j2 = new Jugador("Lisandro", "Martinez", "defensa", 2);
        jugadores.add(j2);
        jugadoresOrdenados.add(j2);
        Jugador j3 = new Jugador("Nicolas", "Otamendi", "defensa", 3);
        jugadores.add(j3);
        jugadoresOrdenados.add(j3);
        Jugador j4 = new Jugador("Nicolas", "Tagliafico", "defensa", 4);
        jugadores.add(j4);
        jugadoresOrdenados.add(j4);
        Jugador j5 = new Jugador("Giovani", "Lo Censo", "mediocampista", 5);
        jugadores.add(j5);
        jugadoresOrdenados.add(j5);
        Jugador j6 = new Jugador("Leandro", "Paredes", "mediocampista", 6);
        jugadores.add(j6);
        jugadoresOrdenados.add(j6);
        Jugador j7 = new Jugador("Enzo", "Fernandez", "mediocampista", 7);
        jugadores.add(j7);
        jugadoresOrdenados.add(j7);
        Jugador j8 = new Jugador("Angel", "Di Maria", "mediocampista", 8);
        jugadores.add(j8);
        jugadoresOrdenados.add(j8);
        Jugador j9 = new Jugador("Lautaro", "Martinez", "delantero", 9);
        jugadores.add(j9);
        jugadoresOrdenados.add(j9);
        Jugador j10 = new Jugador("Lionel ", "Messi  ", "centroDelant", 10);
        jugadores.add(j10);
        jugadoresOrdenados.add(j10);
        Jugador j11 = new Jugador("Julian", "Alvarez", "delantero", 11);
        jugadores.add(j11);
        jugadoresOrdenados.add(j11);
        equipo.setJugadores(jugadores);
        Collections.sort(jugadoresOrdenados, Comparadores.ordenarPorNumeroAscescendente);
    }

    public void imprimirLista() {
        System.out.println(jugadoresOrdenados.toString());
        System.out.println(equipo.toString());

    }
}
