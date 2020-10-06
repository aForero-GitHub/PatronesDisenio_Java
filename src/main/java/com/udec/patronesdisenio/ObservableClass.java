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

    public void observar() {

        DetectarObstaculos sensor = new DetectarObstaculos("Sensor 1 ");
        DetectarObstaculos sensor1 = new DetectarObstaculos("Sensor 2 ");
        DetectarObstaculos sensor2 = new DetectarObstaculos("Sensor 3 ");
        DetectarObstaculos sensor3 = new DetectarObstaculos("Sensor 4 ");

        AcelerarFrenar acelerar = new AcelerarFrenar();

        Thread hilo = new Thread(sensor);
        Thread hilo1 = new Thread(sensor1);
        Thread hilo2 = new Thread(sensor2);
        Thread hilo3 = new Thread(sensor3);

        acelerar.escucharSensor(sensor);
        acelerar.escucharSensor(sensor1);
        acelerar.escucharSensor(sensor2);
        acelerar.escucharSensor(sensor3);

        hilo.start();
        hilo1.start();
        hilo2.start();
        hilo3.start();

    }

}
