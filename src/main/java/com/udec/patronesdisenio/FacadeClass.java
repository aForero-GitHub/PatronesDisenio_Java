/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.patronesdisenio;

import facadepackage.Fachada;

/**
 * LLamar al paquete facade
 * 
 * @author Andres Forero
 * @version: 1.0.0
 * @since 04/10/2020
 */
public class FacadeClass {
    
    public void facade(){
        Fachada fachada = new Fachada();
        
        fachada.invocarCirculo();
        
        fachada.invocarCuadrado();
        
        fachada.invocarTriangulo();
        
    }
}
