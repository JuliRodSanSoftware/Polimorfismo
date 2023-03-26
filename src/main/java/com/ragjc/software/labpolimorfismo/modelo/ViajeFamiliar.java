/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ragjc.software.labpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author RodAlejo
 */
public class ViajeFamiliar extends Viaje{
    private int familia;

    public ViajeFamiliar(int familia, String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }

    @Override
    public String descripcion(){
       return "ViajeFamiliar{" + "origen=" + getOrigen() + ", destino=" + getDestino() + ", costo=" + getCosto() + 
               ", fechaSalida=" + getFechaSalida() + ", fechaLlegada=" + getFechaLlegada()+ "familia=" + familia + '}';
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }
     
    @Override
    public String cualquierMetodo2(){
        return "cualquierMetodo2 en Viaje Familiar";
    }
}
