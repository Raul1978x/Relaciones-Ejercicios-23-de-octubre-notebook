package servicio;

import entidad.Asiento;
import entidad.Persona;
import entidad.Sala;
import enumerador.EnumeradorFila;
import enumerador.EnumeradorNumero;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioSala {

    private ArrayList<Asiento> salaAux;
    private ArrayList<Asiento> filaA;
    private ArrayList<Asiento> filaB;
    private ArrayList<Asiento> filaC;
    private ArrayList<Asiento> filaD;
    private ArrayList<Asiento> filaE;
    private ArrayList<Asiento> filaF;
    private Sala sala;
    private Scanner leer;

    public ServicioSala() {
        this.filaA = new ArrayList();
        this.filaB = new ArrayList();
        this.filaC = new ArrayList();
        this.filaD = new ArrayList();
        this.filaE = new ArrayList();
        this.filaF = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearSala() {
        sala = new Sala();
        salaAux = new ArrayList<>();
        for (EnumeradorFila fila : EnumeradorFila.values()) {
            for (EnumeradorNumero columna : EnumeradorNumero.values()) {
                switch (fila) {
                    case F:
                        filaF.add(new Asiento(fila, columna));
                        break;
                    case E:
                        filaE.add(new Asiento(fila, columna));
                        break;
                    case D:
                        filaD.add(new Asiento(fila, columna));
                        break;
                    case C:
                        filaC.add(new Asiento(fila, columna));
                        break;
                    case B:
                        filaB.add(new Asiento(fila, columna));
                        break;
                    case A:
                        filaA.add(new Asiento(fila, columna));
                        break;
                    default:
                        break;
                }
            }
        }
        salaAux.addAll(filaA);
        salaAux.addAll(filaB);
        salaAux.addAll(filaC);
        salaAux.addAll(filaD);
        salaAux.addAll(filaE);
        salaAux.addAll(filaF);
        sala.setListaAsientos(salaAux);

    }

    public void asignarAsiento() {
        ServicioPelicula servicioPelicula = new ServicioPelicula();
        String op = "";
        do {
            System.out.println("Ingrese la letra del asiento a asignar");
            String letra = leer.next().toUpperCase();
            System.out.println("Ingrese el numero del asiento a asignar");
            String numero = leer.next();
            for (Asiento asiento : sala.getListaAsientos()) {
                if (asiento.getFila().name().equalsIgnoreCase(letra) && asiento.getColumna().getValor().equalsIgnoreCase(numero)) {
                    asiento.setOcupado(true);
//
                }
            }
//            }
            System.out.println("¿Desea asignar otro asiento?(s/n)");
            op = leer.next();
        } while (op.equalsIgnoreCase("s"));
    }

    public void mostrarSala() {
//        crearSala();
        for (Asiento asiento : filaF) {
            System.out.print(asiento);
        }
        System.out.println("");
        for (Asiento asiento : filaE) {
            System.out.print(asiento);
        }
        System.out.println("");
        for (Asiento asiento : filaD) {
            System.out.print(asiento);
        }
        System.out.println("");
        for (Asiento asiento : filaC) {
            System.out.print(asiento);
        }
        System.out.println("");
        for (Asiento asiento : filaB) {
            System.out.print(asiento);
        }
        System.out.println("");
        for (Asiento asiento : filaA) {
            System.out.print(asiento);
        }
        System.out.println("");
    }
//                        for (Pelicula aux : servicioPelicula.getPeliculas()) {
//                    if (p.getEdad() > 18) {
//                        p.setAsientoAsignado(asiento);
//                        System.out.println("el asiento ha sido asignado en la posicion |" + numero + " " + letra + "|");
//                    } else if (p.getEdad() >= 16 && servicioPelicula.getPeliculas().contains(enumerador.EnumClasificacion.MAYORES16)) {
//                        p.setAsientoAsignado(asiento);
//                        System.out.println("el asiento ha sido asignado en la posicion |" + numero + " " + letra + "|");
//                    } else if (p.getEdad() < 16 && servicioPelicula.getPeliculas().contains(enumerador.EnumClasificacion.MAYORES16)) {
//                        System.out.println("Película no apta para la edad del espectador");
//                    }
    //        mostrarSala();

}
