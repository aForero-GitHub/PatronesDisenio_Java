package com.udec.patronesdisenio;

import observablepackage.AcelerarFrenar;
import observablepackage.DetectarObstaculos;

/**
 * podemos tener varios objetos que observen los "sensores", asi como podemos 
 * tener varios sensores
 * 
 * @author Andres Forero
 * @version: 1.0.0
 * @since 04/10/2020
 */ 
public class ObservableClass {
    
    public void observar(){
        
       DetectarObstaculos sensor = new DetectarObstaculos();
       
       AcelerarFrenar acelerar = new AcelerarFrenar();
       
       Thread hilo = new Thread(sensor);
       
       acelerar.escucharSensor(sensor);
       
       hilo.start();
       
    }
    
}
