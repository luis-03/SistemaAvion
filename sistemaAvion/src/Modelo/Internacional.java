/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Internacional extends Vuelo{
    private Vuelo vuelo;
    private double impuesto;
    private boolean requiereVisa;

    public Internacional(double impuesto, boolean requiereVisa) {
        this.impuesto = impuesto;
        this.requiereVisa = requiereVisa;
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
