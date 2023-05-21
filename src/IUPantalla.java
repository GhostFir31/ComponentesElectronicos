public class IUPantalla extends Pantalla {
    
  
    public IUPantalla(String ruta,Pantalla pant) {

        super(pant.getResolucionX(), pant.getResolucionY());

        dibujar(ruta);
    }
    
    @Override
    public void dibujar(String ruta) {
        
        super.dibujar(ruta);
    }
}