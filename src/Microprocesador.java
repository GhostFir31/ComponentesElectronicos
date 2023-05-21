public class Microprocesador extends ComponenteElectronico {

    private final int cacheRAM;
    private final long velocidadHz;

    public Microprocesador( int cacheRAM, long velocidadHz) {
        super( "", "", "", ""); 
        this.cacheRAM = cacheRAM;
        this.velocidadHz = velocidadHz;
    }

    public int getCacheRAM() {
        return cacheRAM;
    }

    public long getVelocidadHz() {
        return velocidadHz;
    }

    @Override
    public String toString() {
        return "Cache RAM: " + cacheRAM + ", Velocidad Hz: " + velocidadHz;
    }
}