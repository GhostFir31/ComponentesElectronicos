public class IUSensor extends Sensor{
    
  

    public IUSensor(String ruta,Sensor sensor) {
        
        super(sensor.getTipo(),sensor.getTipo(),sensor.getValor());
        
        dibujar(ruta);
    }

    @Override
    public void dibujar(String ruta) {
        
        super.dibujar(ruta);
    }
}