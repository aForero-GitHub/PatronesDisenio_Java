/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepackage;

/**
 * fachada para econder y llamar a las clases
 * 
 * @author Andres Forero
 * @version: 1.0.0
 * @since 04/10/2020
 */

public class Fachada {
    private Cuadrado cuadrado;
    private Circulo circulo;
    private Triangulo triangulo;

    public Fachada() {
        cuadrado = new Cuadrado();
        circulo = new Circulo();
        triangulo = new Triangulo();
    }
    
    public void invocarCuadrado(){
        cuadrado.draw();
    }
    
    public void invocarTriangulo(){
        triangulo.draw();
    }
    
    public void invocarCirculo(){
        circulo.draw();
    }
    
}
