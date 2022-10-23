package enumeraciones;

public enum EnumRaza {
    BEAGLE("Beagle"), CALLEJERO("Callejero"), PITBULL("Pitbull"), SIBERIANO("Siberiano"), CANICHE("Caniche"), COLI("Coli"), CHIGUAGUA("Chiguaqua"), GRAN_DANES("Gran Danes"), OVEJERO("Ovejero");

    private String raza;

    private EnumRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return raza;
    }

}
