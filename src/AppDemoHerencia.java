import java.util.ArrayList;
import java.util.Scanner;


public class AppDemoHerencia {

    private Scanner leer = new Scanner(System.in);
    private int opcion;

    public static void main(String[] args) {

        AppDemoHerencia app = new AppDemoHerencia();

        app.menuElectronicos();

    }

    public void menuElectronicos() {
        do{
        System.out.println("1.Parte 1 Herencia ");
        System.out.println("2.Dibuja ");
        System.out.println("3.Salir ");

            opcion = leer.nextInt();
        switch (opcion) {

            case 1:
                electronicos();
                break;
            case 2:
                menuDibujar();
                break;
        }
    }while(opcion!=3);
    }

    public void electronicos() {
        do{
        System.out.println("1.Inicializa y muestra 2 smartphones ");
        System.out.println("2.Inicializa y muestra 2 TVS ");
        System.out.println("3.Salir ");
        
        opcion = leer.nextInt();

        switch (opcion) {

            case 1:
                ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();

                Smartphone smartphone1 = new Smartphone("Apple", "1125", "Apple", "Smartphone 1", 255,
                        new Microprocesador(16, 4000), 10, new Sensor("Huella", "mm", 10), new Pantalla(1920, 1080));
                Smartphone smartphone2 = new Smartphone("Huawei", "1256", "China", "Smartphone 2", 120,
                        new Microprocesador(8, 3600), 8, new Sensor("Codigo", "cm", 20), new Pantalla(2560, 1440));
                listaDeSmartphones.add(smartphone1);
                listaDeSmartphones.add(smartphone2);

                System.out.println("Lista Smartphones : ");
                for (Smartphone smartphone : listaDeSmartphones) {
                    System.out.println(smartphone.toString());
                }

                break;

            case 2:
                ArrayList<Television> listaDeTVs = new ArrayList<>();

                Television tv1 = new Television("LG", "1212", "LG", "TV 1", 10000, new Pantalla(1920, 1080));
                Television tv2 = new Television("Huawei", "1254", "LG", "TV 2", 25255, new Pantalla(3840, 2160));
                listaDeTVs.add(tv1);
                listaDeTVs.add(tv2);

                System.out.println("Lista TVS: ");
                for (Television tv : listaDeTVs) {
                    System.out.println(tv.toString());
                }
                break;

        }
    }while(opcion!=3);
    }

    public void menuDibujar() {
        do{
        System.out.println("1.Microprocesador");
        System.out.println("2.Pantalla");
        System.out.println("3.Sensor");
        System.out.println("4.Computadora");
        System.out.println("5.Television");
        System.out.println("6.SmartPhone");
        System.out.println("7.Salir ");
      
        opcion = leer.nextInt();
   
     
  
        switch (opcion) {

            case 1: 
                    IUMicroprocesador iuMicroprocesador= new IUMicroprocesador("micro.png",new Microprocesador(1000, 1000));
                

                break;

            case 2: IUPantalla iuPantalla=new IUPantalla("pantalla.png", new Pantalla(1080, 960));
            
      
                break;
            case 3: IUSensor iuSensor=new IUSensor("sensor.png", new Sensor("Huella", "CM", 14)); 

                break; 

            case 4: 
                    IUComputadora iuComputadora=new IUComputadora("computadora.png", new Computadora("DELL", "1254", "USA", "Compu", 15000, new Microprocesador(1000, 1000), 14));
                  
                break;
            case 5: IUTelevision iuTv=new IUTelevision("television.png",new Television("LG", "1256", "lg", "tvchiquita", 1255, new Pantalla(1028, 768)));
            
            
    
                break;

            case 6: IUSmartphone iuSmartphone=new IUSmartphone("smartphone.jpg", new Smartphone(null, null, null, null, opcion, new Microprocesador(opcion, opcion), opcion, new Sensor(null, null, opcion), new Pantalla(opcion, opcion)));
            
            
            
    

                break;

        }
    }while(opcion!=7);
    }


}
