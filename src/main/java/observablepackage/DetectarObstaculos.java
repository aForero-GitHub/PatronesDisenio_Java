package observablepackage;

import java.util.Observable;
import java.util.Random;
/**
 * Clase observada, encargada de detectar objetos en el camino
 * 
 * @author Andres Forero
 * @version: 1.0.0
 * @since 04/10/2020
 */ 
public class DetectarObstaculos extends Observable implements Runnable {
    
    //objeto que almacena si hay o no un obstaculo
    private String objeto;
    
   //nombre del sensor
    private String nombre;
    
    //valor random para cambiar el estado del objeo 
    private final Random r = new Random();

    public DetectarObstaculos(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        
        for (int i = 0; i < 20; i++) {
            
            //TIEMPO DE ESPERA 
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                System.out.println("ERROR EN EL SISTEMA");
            }
            int opcion = r.nextInt(3);
            
            switch(opcion){
                case 1:
                    //si no hay nada en el camino
                    this.objeto = "nada";
                    break;
                case 2:
                    //si hay algo en el camino 
                    this.objeto = "objeto";
                    break;
            }
            
            //informando que hubo un cambio
            this.setChanged();
            
            //enviando el parametro necesario al observador 
            this.notifyObservers(this.objeto);
        }
    }
    
    public String getNombre() {
        return nombre;
    }
   
}
    
