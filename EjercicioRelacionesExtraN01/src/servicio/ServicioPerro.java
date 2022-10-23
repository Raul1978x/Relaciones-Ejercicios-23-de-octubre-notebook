package servicio;

import Entidades.Perro;
import enumeraciones.EnumRaza;
import enumeraciones.EnumTam;
import java.util.Scanner;

public class ServicioPerro {

    private Perro perro;
    private Scanner leer;
    private EnumRaza[] razas;
    private EnumTam[] tamanios;
    
    
    public ServicioPerro() {
        this.razas = EnumRaza.values();
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.tamanios = EnumTam.values();
    }

    public Perro crearPerro() {
        perro = new Perro();

        System.out.println("Ingrese el nombre del perro:");
        perro.setNombre(leer.next());
        System.out.println("Ingrese el raza del perro:");
        imprimirRazas();
        perro.setRaza(elegirRaza(leer.nextInt()));
        System.out.println("Ingrese el tamaño del perro:");
        imprimirTam();
        perro.setTamanio(elegirTam(leer.nextInt()));
        System.out.println("Ingrese el edad del perro:");
        perro.setEdad(leer.nextInt());

        return perro;
    }

    public String elegirRaza(int eleccion) {
        String raza = "";
        for (int i = 0; i < razas.length; i++) {
            raza = razas[eleccion - 1].toString();
        }
        return raza;
    }

    public void imprimirRazas() {
        for (int i = 0; i < razas.length; i++) {
            System.out.println((i + 1) + ".- " + razas[i]);
        }
    }

    public String elegirTam(int eleccion) {
        String tam = "";
        for (int i = 0; i < tamanios.length; i++) {
            tam = tamanios[eleccion - 1].toString();
        }
        return tam;
    }
    public void imprimirTam() {
        for (int i = 0; i < tamanios.length; i++) {
            System.out.println((i + 1) + ".- " + tamanios[i]);
        }
    }
}
