public class Smartphone extends Computadora{
    private final Sensor sensorDeHuella;
    private final Pantalla pantalla;

    public Smartphone(String fabricante, String serie, String marca, String nombre, float costo,Microprocesador cpu, long ramMB,Sensor sensorDeHuella, Pantalla pantalla) {
        super(fabricante,serie,marca,nombre,costo,cpu,ramMB);
        this.sensorDeHuella = sensorDeHuella;
        this.pantalla = pantalla;
    }

    public Sensor getSensorDeHuella() {
        return sensorDeHuella;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }
    @Override
    public String toString() {
        return super.toString() + ", Sensor de Huella: " + sensorDeHuella + ", Pantalla: " + pantalla;
    }
}
