/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepackage;

/**
 * Impresion triangulo
 * 
 * @author Andres Forero
 * @version: 1.0.0
 * @since 04/10/2020
 */
public class Triangulo implements IShape{

    @Override
    public void draw() {
        System.out.println("IMPRIMIENDO TRIANGULO");
    }
}
