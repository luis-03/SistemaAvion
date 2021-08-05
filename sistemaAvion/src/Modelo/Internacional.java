/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Internacional extends Vuelo{
    private ArrayList<Vuelo> vuelo; 
    private double impuesto;
    private boolean requiereVisa;

    public Internacional(ArrayList<Vuelo> vuelo, double impuesto, boolean requiereVisa, int numeroVuelo, String origen, String destino, int numeroAsiento, double costo, Date duracioin) {
        super(numeroVuelo, origen, destino, numeroAsiento, costo, duracioin);
        this.vuelo = vuelo;
        this.impuesto = impuesto;
        this.requiereVisa = requiereVisa;
    }
    
    
    /**
     * @return the vuelo
     */
    public ArrayList<Vuelo> getVuelo() {
        return vuelo;
    }

    /**
     * @param vuelo the vuelo to set
     */
    public void setVuelo(ArrayList<Vuelo> vuelo) {
        this.vuelo = vuelo;
    }

    /**
     * @return the impuesto
     */
    public double getImpuesto() {
        return impuesto;
    }

    /**
     * @param impuesto the impuesto to set
     */
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    /**
     * @return the requiereVisa
     */
    public boolean isRequiereVisa() {
        return requiereVisa;
    }

    /**
     * @param requiereVisa the requiereVisa to set
     */
    public void setRequiereVisa(boolean requiereVisa) {
        this.requiereVisa = requiereVisa;
    }
    
    
    

  
    
}
