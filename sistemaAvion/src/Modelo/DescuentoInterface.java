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
public  class  DescuentoInterface{
    private boolean aplicaDescuento;
    private double descuento;

    public DescuentoInterface(boolean aplicaDescuento, double descuento) {
        this.aplicaDescuento = aplicaDescuento;
        this.descuento = descuento;
    }
    
    
    /**
     * @return the aplicaDescuento
     */
    public boolean isAplicaDescuento() {
        return aplicaDescuento;
    }

    /**
     * @param aplicaDescuento the aplicaDescuento to set
     */
    public void setAplicaDescuento(boolean aplicaDescuento) {
        this.aplicaDescuento = aplicaDescuento;
    }

    /**
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
}
