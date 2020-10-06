package com.udec.patronesdisenio;
import singletonpackage.SingletonClass;

/**
 * Clase por donde inicia el programa
 * 
 * @author Andres Forero
 * @version: 1.0.0
 * @since 04/10/2020
 */ 
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //SINGLETON-------------------------------------------------------
            SingletonClass singleton = new SingletonClass();
            singleton.singleton();
        //----------------------------------------------------------------
            
        //FACTORY---------------------------------------------------------
            FactoryClass factory = new FactoryClass();
            factory.factory();
        //----------------------------------------------------------------
        
        //FACADE----------------------------------------------------------
            FacadeClass facade= new FacadeClass();
            facade.facade();
        //----------------------------------------------------------------
        
        //OBSERVABLE------------------------------------------------------
            ObservableClass observar = new ObservableClass();
            observar.observar();
        //----------------------------------------------------------------
    }
    
}
