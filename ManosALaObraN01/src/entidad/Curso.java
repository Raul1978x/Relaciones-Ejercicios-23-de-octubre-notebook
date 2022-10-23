package entidad;

import java.util.List;

/**
 * Por cada objeto tenemos una relación con muchos objetos de una clase.
 * Ejemplo: para un curso tengo muchos alumnos. En java para guardar varios
 * objetos de una clase utilizamos colecciones. Y como las listas son las
 * colecciones más rápidas de llenar, utilizamos una lista. En este ejemplo en
 * el Main vamos a tener que crear varios objetos Alumno para después guardarlos
 * en un ArrayList de tipo Alumno, para poder guardarlo en el Curso. Para
 * guardar el objeto podemos usar el set que se va a generar de dicho ArrayList
 * de tipo Alumno, ya que es un atributo de la clase Curso
 *
 * @author Raul Gomez
 */
public class Curso {

    private int anio;
    private char division;
    private List<Alumno> alumnos;

    public Curso() {
    }

    public Curso(int anio, char division, List<Alumno> alumnos) {
        this.anio = anio;
        this.division = division;
        this.alumnos = alumnos;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso: " + "año=" + anio + ", division=" + division + "\nAlumnos:\n" + alumnos + "\n";
    }

}
