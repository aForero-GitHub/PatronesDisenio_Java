/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpackage;

/**
 * Implementacion del patron singleton 
 * 
 * @author Andres Forero
 * @version: 1.0.0
 * @since 04/10/2020
 */
public class SingletonClass {
    
    ColorSingleton color = ColorSingleton.getInstancia();
    
    public void singleton(){
        
        String vectorColores[] = color.getColor();
        
        for(String vc : vectorColores){
            System.out.println(vc);
        }
        
    }
}
