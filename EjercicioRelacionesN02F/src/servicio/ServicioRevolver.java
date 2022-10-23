/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Revolver;

/**
 * Métodos: • llenarRevolver(): le pone los valores de posición actual y de
 * posición del agua. Los valores deben ser aleatorios. • mojar(): devuelve true
 * si la posición del agua coincide con la posición actual • siguienteChorro():
 * cambia a la siguiente posición del tambor • toString(): muestra información
 * del revolver (posición actual y donde está el agua)
 *
 * @author elias
 */
public class ServicioRevolver {
    
    Revolver cargarRev = new Revolver();
    public Revolver llenarRevolver() {
        cargarRev.setPosicionActual((int) (Math.random() * (1 - 6) + 6));
        cargarRev.setPosicionAgua((int) (Math.random() * (1 - 6) + 6));
        return cargarRev;
    }
    
    public boolean mojar() {
        boolean mojar = false;
        if (cargarRev.getPosicionActual() == cargarRev.getPosicionAgua()) {//se puede utilizar equal
            
            mojar = true;
        }
        return mojar;
    }

    public void siguienteChorro() {
        if (cargarRev.getPosicionActual() < 6) {
            cargarRev.setPosicionActual(cargarRev.getPosicionActual() + 1);
        } else if (cargarRev.getPosicionActual() == 6) {
            cargarRev.setPosicionActual(1);
        }
//        System.out.println(cargarRev.toString());
    }
    
    public void mostrarPosiciones(){
        System.out.println(cargarRev.toString());
    }
}
