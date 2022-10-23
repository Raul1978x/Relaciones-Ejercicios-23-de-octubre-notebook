package entidad;

import java.util.Objects;
import utilidad.Comparadores;

/**
 * Realiza un programa en donde exista una clase Jugador que contenga nombre,
 * apellido, posición y número. Luego otra clase Equipo que contenga una
 * colección de jugadores. Una vez hecho esto, desde el main recorreremos el
 * equipo mostrando la información de cada jugador.
 *
 * @author Raul Gomez
 */
public class Jugador extends Comparadores {

    private String nombre;
    private String apellido;
    private String posicion;
    private Integer numero;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String posicion, Integer numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.apellido);
        hash = 47 * hash + Objects.hashCode(this.posicion);
        hash = 47 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.posicion, other.posicion)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return  nombre.toUpperCase() + ", " + apellido.toUpperCase() + "\tposicion: " + posicion.toUpperCase() + "\tnumero: " + numero+"\n";
    }
    
    
}
