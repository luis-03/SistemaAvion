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
public abstract class ControladorVuelo {
    Vuelo vuelo;
    public abstract double calcularCosto();
    public abstract double calcularConsumoCumbustible();
}
