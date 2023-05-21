public class IUMicroprocesador extends Microprocesador {


    public IUMicroprocesador(String ruta,Microprocesador micro) {

       super(micro.getCacheRAM(), micro.getVelocidadHz());
       
        dibujar(ruta);
 
    }


    @Override
    public void dibujar(String ruta) {
        
        super.dibujar(ruta);
    }

}