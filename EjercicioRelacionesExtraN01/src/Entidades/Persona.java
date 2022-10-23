package Entidades;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private Perro p;
    private boolean adopto;

    public Persona() {
    }
    
    public Persona(String nombre, String apellido, int edad, String documento, Perro p) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.p = p;
        this.adopto= false;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return p;
    }

    public void setPerro(Perro perro) {
        this.p= perro;
    }

    public Perro getP() {
        return p;
    }

    public void setP(Perro p) {
        this.p = p;
    }

    public boolean isAdopto() {
        return adopto;
    }

    public void setAdopto(boolean adopto) {
        this.adopto = adopto;
    }

    @Override
    public String toString() {
        return nombre.toUpperCase() + ",\t" + apellido.toUpperCase() + "\tedad: " + edad + " años\tDNI: " + documento + "\nPerro: " + p;
    }
    
}
