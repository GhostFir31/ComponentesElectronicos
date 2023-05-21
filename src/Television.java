public class Television extends DispositivoElectronicoDeConsumo {
    
    private final Pantalla pantalla;

    public Television(String fabricante, String serie, String marca, String nombre, float costo, Pantalla pantalla) {
        super(fabricante, serie, marca, nombre, costo);
        this.pantalla = pantalla;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    @Override
    public String toString() {
        return super.toString() + " Pantalla: " + pantalla;
    }
}