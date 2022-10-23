package manosalaobran01;

/**
 * Realiza un programa en donde una clase Persona tenga como atributo nombre,
 * apellido y un objeto de clase Dni. La clase Dni tendrá como atributos la
 * serie (carácter) y número. Prueba acceder luego a los atributos del dni de la
 * persona creando objetos y jugando desde el main.
 *
 * @author Raul Gomez
 */
import entidad.Alumno;
import entidad.Curso;
import java.util.ArrayList;
import java.util.List;

public class ManosALaObraN01 {

    public static void main(String[] args) {
//        Persona persona = new Persona("raul", "Gomez", "22.554.488");
//        System.out.println(persona.getApellido() + ", " + persona.getNombre() + ", DNI: " + persona.getDni());
//        Persona persona1 = new Persona("alberto", "Gonzalez", "23.556.687");
//        System.out.println(persona1.getApellido() + ", " + persona1.getNombre() + ", DNI: " + persona1.getDni());
//        Persona persona2 = new Persona("maria", "Saldaña", "41.552.277");
//        System.out.println(persona2.getApellido()+", "+persona2.getNombre()+", DNI: "+persona2.getDni());

        Curso curso = new Curso();
        curso.setAnio(5);
        curso.setDivision('a');
        List<Alumno> alumnos = new ArrayList<>();

        Alumno a1 = new Alumno("Raul", "Gomez");
        alumnos.add(a1);
        Alumno a2 = new Alumno("Alberto", "Gonzalez");
        alumnos.add(a2);
        Alumno a3 = new Alumno("Maria", "Saldaña");
        alumnos.add(a3);
        curso.setAlumnos(alumnos);
        System.out.println(curso);
    }

}
