import java.awt.Frame;
import java.util.ArrayList;

public abstract class DispositivoElectronico {

    private String fabricante;
    private String numeroSerie;
    private String marca;
    private String nombre;
    private float costo;

    private ArrayList<ComponenteElectronico> componentes;

    public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.costo = costo;
        this.componentes = new ArrayList<>();
    }

    public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre) {
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }


    public String getFabricante() {
        return fabricante;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public ArrayList<ComponenteElectronico> getComponentes() {
        return componentes;
    }

    public void agregarComponente(ComponenteElectronico componente) {
        componentes.add(componente);
       
    }

    public void quitarComponente(ComponenteElectronico componente) {
        componentes.remove(componente);
       

    }
    public void dibujar(String ruta){

        CanvasImagen canvasPantalla = new CanvasImagen(ruta);
    
        Frame framePantalla = new Frame();
        framePantalla.setSize(300, 300);
        framePantalla.add(canvasPantalla);
        framePantalla.setVisible(true);
    
    }
    @Override
    public String toString() {
        return "Fabricante: " + fabricante + " Numero de Serie: " + numeroSerie +" Marca: " + marca +" Nombre: " + nombre +" Costo: " + costo;
    }
}
