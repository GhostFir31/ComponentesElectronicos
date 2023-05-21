public class IUTelevision extends Television {
    

    public IUTelevision(String ruta,Television tv) {

        super(tv.getFabricante(), "1256", "LG", "tvchiquita", tv.getCosto(), new Pantalla(1028,768));

        dibujar(ruta);
     
    }

    @Override
    public void dibujar(String ruta) {
        
        super.dibujar(ruta);
    }

}