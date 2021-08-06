/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Vuelo;


/**
 *
 * @author usuario
 */
public class ControladorNacional extends Vuelo{
    
    public double calcularCosto(double distanciaVuelo,double duracion){
        return  distanciaVuelo*duracion;
    }
            
           
    public  double calcularConsumoCumbustible(){
        return 0;
    }
    
    public void CalcularIva(){
        
    }
    
            
}
