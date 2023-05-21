public class Pantalla extends ComponenteElectronico {
    
    private final int resolucionX;
    private final int resolucionY;
    
    public Pantalla( int resolucionX, int resolucionY) {
        super( "", "", "", ""); 
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }
    
    public int getResolucionX() {
        return resolucionX;
    }
    
    public int getResolucionY() {
        return resolucionY;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Resolución X: " + resolucionX + " Resolución Y: " + resolucionY;
    }
}