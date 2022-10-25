package servicio;

import entidad.Pelicula;
import enumerador.EnumClasificacion;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPelicula {

    private Scanner leer;
    private Pelicula pelicula;
    private ArrayList<Pelicula> peliculas;
    private EnumClasificacion[] clasificacion;

    public ServicioPelicula() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.clasificacion = EnumClasificacion.values();
        
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

       
    private Pelicula crearPelicula(){
        pelicula = new Pelicula();
        System.out.println("Ingrese el título de la película:");
        pelicula.setTitulo(leer.next());
        System.out.println("Ingrese el director de la película:");
        pelicula.setDirector(leer.next());
        System.out.println("Ingrese la duracion en minutos de la película:");
        pelicula.setDuracion(leer.nextInt());
        System.out.println("Ingrese la clasificación de la película:");
        imprimirClasificacion();
        pelicula.setClasificacion(elegirClasificacion(leer.nextInt()));
        return pelicula;
    }
    public void cargarPeliculas(){
        peliculas = new ArrayList<>();
        do {            
            peliculas.add(crearPelicula());
            System.out.println("¿Desea cargar otra película?");
        } while (leer.next().equalsIgnoreCase("s"));
    }
    private String elegirClasificacion(int eleccion) {
        String clasificador = "";
        for (int i = 0; i < clasificacion.length; i++) {
            clasificador = clasificacion[eleccion - 1].toString();
        }
        return clasificador;
    }

    private void imprimirClasificacion() {
        for (int i = 0; i < clasificacion.length; i++) {
            System.out.println((i + 1) + ".- " + clasificacion[i]);
        }
    }
    public void imprimirCartelera() {
        for (Pelicula auxPeli : peliculas) {
            System.out.println(auxPeli.toString());
        }
    }
}
