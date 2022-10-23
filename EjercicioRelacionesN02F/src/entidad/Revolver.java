
package entidad;

/**
 *Clase Revolver de agua: esta clase posee los
 * siguientes atributos: posición actual (posición del tambor que se dispara,
 * puede que esté el agua o no) y posición agua (la posición del tambor donde se
 * encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
 * @author elias
 */
public class Revolver {
    private int posicionActual, posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "Posición Actual=" + posicionActual + ", Posición Agua=" + posicionAgua + '}';
    }

    
    

    
    
}

