package enumeraciones;

public enum EnumTam {
    CHICO("Chico"), MEDIO("Medio"), GRANDE("Grande");
    public String tam;

    private EnumTam(String tam) {
        this.tam = tam;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return tam;
    }

}
