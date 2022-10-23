/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Asiento;
import entidad.Sala;
import enumerador.EnumeradorFila;
import enumerador.EnumeradorNumero;
import java.util.ArrayList;

/**
 *
 * @author Juan Cruz
 */
public class ServicioSala {
    
    public Sala crearSala() {

        ArrayList<Asiento> aux = new ArrayList();
        for (EnumeradorNumero columna : EnumeradorNumero.values()) {
            for (EnumeradorFila fila : EnumeradorFila.values()) {
                aux.add(new Asiento(fila, columna));
            }
        }
        Sala s1 = new Sala();
        
        s1.setListaAsientos(aux);

        return s1;

    }

    
}
