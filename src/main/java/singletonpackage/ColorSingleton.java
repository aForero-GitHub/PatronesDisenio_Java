/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpackage;

/**
 * Colores almacenados
 * 
 * @author Andres Forero
 * @version: 1.0.0
 * @since 04/10/2020
 */

public class ColorSingleton {
    
    private String[] color = {"NEGRO", "AZUL","amarillo","VERDE"};
    
    private static ColorSingleton instancia;
    
    private ColorSingleton() {
        
    }
    
    public static ColorSingleton getInstancia() {
        if(instancia == null){
            instancia = new ColorSingleton();
        }
        return instancia;
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }
    
}
