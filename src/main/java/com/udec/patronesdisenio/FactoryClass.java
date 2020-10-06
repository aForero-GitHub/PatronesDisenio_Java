/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.patronesdisenio;

import factorypackage.FabricaShape;
import factorypackage.IShape;

/**
 * Llamar al paquete factory
 * 
 * @author Andres Forero
 * @version: 1.0.0
 * @since 04/10/2020
 */
public class FactoryClass {
    
    FabricaShape fabrica = new FabricaShape();
    
    public void factory(){
        IShape cuadrado = fabrica.getShape("CUADRADO");
        cuadrado.draw();
        
        IShape circulo = fabrica.getShape("CIRCULO");
        circulo.draw();
        
        IShape triangulo = fabrica.getShape("TRIANGULO");
        triangulo.draw();
    }
}
