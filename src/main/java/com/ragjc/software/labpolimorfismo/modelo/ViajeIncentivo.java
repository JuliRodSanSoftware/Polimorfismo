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
public class ViajeIncentivo extends Viaje{
    private String empresa;

    public ViajeIncentivo(String empresa, String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa = empresa;
    }

    @Override
    public String descripcion(){
       return "ViajeIncentivo{" + "origen=" + getOrigen() + ", destino=" + getDestino() + ", costo=" + getCosto() + 
               ", fechaSalida=" + getFechaSalida() + ", fechaLlegada=" + getFechaLlegada()+ "empresa=" + empresa + '}';
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    @Override
    public String cualquierMetodo2(){
        return "cualquierMetodo2 en Viaje Incentivo";
    }  
        
}
