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
public class Nacional extends Vuelo {
    private ArrayList<Vuelo> vuelo;

    public Nacional(ArrayList<Vuelo> vuelo, int numeroVuelo, String origen, String destino, int numeroAsiento, double costo, Date duracioin) {
        super(numeroVuelo, origen, destino, numeroAsiento, costo, duracioin);
        this.vuelo = vuelo;
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
    

    
    
    
}
