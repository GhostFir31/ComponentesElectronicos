public abstract class DispositivoElectronicoDeConsumo extends DispositivoElectronico{
    
    private boolean encendido;

    public DispositivoElectronicoDeConsumo(String fabricante, String serie, String marca,String nombre,float costo) {

        super(fabricante,serie, marca, nombre,costo);

        this.encendido = false; 
    }

    public DispositivoElectronicoDeConsumo(String fabricante, String serie, String marca,String nombre) {

        super(fabricante,serie, marca, nombre);

        this.encendido = false; 
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    @Override
    public String toString() {
        return " Encendido: " + encendido;
    }
}
