package observablepackage;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Clase encargada de observar a (DetectarObeto)
 * 
 * @author Andres Forero
 * @version: 1.0.0
 * @since 04/10/2020
 */ 

public class AcelerarFrenar implements Observer {
    
    //COLORES-----------------------------------------------
    public static final String rojo= "\u001B[31m";
    public static final String verde = "\u001B[32m";
    public static final String normal = "\u001B[0m";
    //------------------------------------------------------
    
    /**
     * Podemos observar varios objetos de DetectarObstaculos (Sensores)
     */
    private ArrayList<DetectarObstaculos> observados = new ArrayList<DetectarObstaculos>();

    /**
     * agregar objetos observados (sensores)
     * @param detectar 
     */
    public void escucharSensor(DetectarObstaculos detectar) {
        detectar.addObserver(this);
        this.observados.add(detectar);
    }
    
    /**
     * dejar de escuchar a los sensores
     * @param detectar 
     */
    public void limpiarSensor(DetectarObstaculos detectar) {
        detectar.deleteObserver(this);
        this.observados.remove(detectar);
    }

    /**
     * segun lo capturado por objeto en DetectarObstaculo
     * cambiara el estado de AcelerarFrenar
     * 
     * @param detectar
     * @param objeto 
     */
    @Override
    public void update(Observable detectar, Object objeto) {
        
        
        if (this.observados.contains(detectar)) {
            
            //Si no hay ningun obstaculo se acelera
            if (objeto == "nada"){
                
                System.out.println(verde + "Acelerando, " + objeto + " En el camino" + normal);
                System.out.println(" ");
            
            //Si se encuentran obstaculos se frena 
            }else if (objeto == "objeto"){
                
                System.out.println(rojo + "Frenando, " + objeto + " En el camino" + normal);
                System.out.println(" ");
            }
            
        } else {
            
            throw new IllegalArgumentException();
            
        }

    }

}
