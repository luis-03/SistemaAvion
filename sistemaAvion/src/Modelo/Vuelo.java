/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author usuario
 */
public abstract class  Vuelo {
    private int numeroVuelo;
    private String origen;
    private String destino;
    private int numeroAsiento;
    private double costo;
    private Date duracioin;

    public Vuelo(int numeroVuelo, String origen, String destino, int numeroAsiento, double costo, Date duracioin) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.numeroAsiento = numeroAsiento;
        this.costo = costo;
        this.duracioin = duracioin;
    }
    
    
    /**
     * @return the numeroVuelo
     */
    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    /**
     * @param numeroVuelo the numeroVuelo to set
     */
    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the numeroAsiento
     */
    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    /**
     * @param numeroAsiento the numeroAsiento to set
     */
    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    /**
     * @return the costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * @return the duracioin
     */
    public Date getDuracioin() {
        return duracioin;
    }

    /**
     * @param duracioin the duracioin to set
     */
    public void setDuracioin(Date duracioin) {
        this.duracioin = duracioin;
    }
    
    
}
