public class IUSmartphone extends Smartphone{


    public IUSmartphone(String ruta,Smartphone telefono) {
        super("Apple", "", "", "", telefono.getCosto(), telefono.getCpu(), telefono.getRamMB(), telefono.getSensorDeHuella(), telefono.getPantalla());
        dibujar(ruta);
    }

    @Override
    public void dibujar(String ruta) {
        
        super.dibujar(ruta);
    }

}