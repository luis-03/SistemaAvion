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
//Hola
//Como estas
public class Aeorupuerto {
    private String nombre;
    private String ubicacion;
    private int capacida;

    public Aeorupuerto(String nombre, String ubicacion, int capacida) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacida = capacida;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the capacida
     */
    public int getCapacida() {
        return capacida;
    }

    /**
     * @param capacida the capacida to set
     */
    public void setCapacida(int capacida) {
        this.capacida = capacida;
    }
    
    
}
