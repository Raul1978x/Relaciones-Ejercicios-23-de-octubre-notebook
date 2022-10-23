package entidad;

/**
 * Por cada objeto tenemos una relación con muchos objetos de una clase.
 * Ejemplo: para un curso tengo muchos alumnos. En java para guardar varios
 * objetos de una clase utilizamos colecciones. Y como las listas son las
 * colecciones más rápidas de llenar, utilizamos una lista.
 *
 * @author Raul Gomez
 */
public class Alumno {

    private String nombre;
    private String apellido;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
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

    @Override
    public String toString() {
        return "Nombre y apellido: " + nombre.toUpperCase() + ", " + apellido.toUpperCase()+"\n";
    }
    
    
}
