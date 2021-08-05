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
public class Pasajeros {
    private String nombre;
    private String cedula;
    private String pasaporte;
    private Date fechaNacimiento;
    private boolean CuntaConVisaDestino;

    public Pasajeros(String nombre, String cedula, String pasaporte, Date fechaNacimiento, boolean CuntaConVisaDestino) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.pasaporte = pasaporte;
        this.fechaNacimiento = fechaNacimiento;
        this.CuntaConVisaDestino = CuntaConVisaDestino;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isCuntaConVisaDestino() {
        return CuntaConVisaDestino;
    }

    public void setCuntaConVisaDestino(boolean CuntaConVisaDestino) {
        this.CuntaConVisaDestino = CuntaConVisaDestino;
    }
    
}
