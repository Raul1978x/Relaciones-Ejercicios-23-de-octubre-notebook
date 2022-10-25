
package enumerador;

public enum EnumClasificacion {
    ATP("ATP - Apta para Todo Público"),MAYORES13("+13"), MAYORES16("+16"), MAYORES18("+18"), CONDICIONA("C - Exhibición Condicionada"); 
    public String clasificacion;

    private EnumClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return clasificacion;
    }
    
}
