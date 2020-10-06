/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypackage;

/**
 * fabrica para invocar los metodos de las clases
 * 
 * @author Andres Forero
 * @version: 1.0.0
 * @since 04/10/2020
 */

public class FabricaShape {
    
    public IShape getShape(String figura){
       
        if(figura.equals("CUADRADO")){
            
            return new Cuadrado();
            
        }else if (figura.equals("CIRCULO")){
            
            return new Circulo();
            
        }else if (figura.equals("TRIANGULO")){
            
            return new Triangulo();
            
        }else {
            
            return null;
        }
    }
}
