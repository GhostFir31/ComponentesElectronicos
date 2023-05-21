

public abstract class ComponenteElectronico extends DispositivoElectronico{
    
   private DispositivoElectronico esParteDe;

   public ComponenteElectronico(DispositivoElectronico esParteDe,String fabricante, String serie, String marca,String nombre,float costo){

     super(fabricante,serie, marca, nombre,costo);

     this.esParteDe = esParteDe;
   }

   public ComponenteElectronico(DispositivoElectronico esParteDe,String fabricante, String serie, String marca,String nombre){
    
    super(fabricante,serie, marca, nombre);

    this.esParteDe = esParteDe;
    
   }

   
   public ComponenteElectronico(String fabricante, String serie, String marca,String nombre){
    
    super(fabricante,serie, marca, nombre);

     
   }
   
   public DispositivoElectronico getEsParteDe() {
    return esParteDe;
    }

public void setEsParteDe(DispositivoElectronico esParteDe) {
    this.esParteDe = esParteDe;
    }

    @Override
    public String toString() {
        return "Es parte de: Componente Electronico" ;
    }

}
