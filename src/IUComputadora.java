public class IUComputadora extends Computadora {

  
    public IUComputadora(String ruta,Computadora computadora) {

        super(" ", " ", " ", " ", 16, computadora.getCpu(), computadora.getRamMB());
         dibujar(ruta);
    }

   @Override
   public void dibujar(String ruta) {
       
       super.dibujar(ruta);
   }
}
