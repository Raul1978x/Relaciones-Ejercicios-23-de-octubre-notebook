package servicio;

import entidad.Perro;
import java.util.ArrayList;
import java.util.List;

public class ServicioPerro {

    private ArrayList<Perro> listaPerros;

    public ServicioPerro() {
        this.listaPerros = new ArrayList<>();
    }
    
    public ArrayList<Perro> crearListaDePerros() {
        Perro perro1 = new Perro("negra", "callejera", 7, "chica");
        Perro perro2 = new Perro("nana", "pitbull", 5, "mediana");
        listaPerros.add(perro1);
        listaPerros.add(perro2);
        return listaPerros;
    }
}
