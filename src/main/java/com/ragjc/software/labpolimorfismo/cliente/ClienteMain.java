/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ragjc.software.labpolimorfismo.cliente;

import com.ragjc.software.labpolimorfismo.modelo.Viaje;
import com.ragjc.software.labpolimorfismo.modelo.ViajeFamiliar;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ClienteMain {
    static List<Viaje> viajes = new ArrayList<>();
    public static void main(String[] args) {
        leerViajes();
        mostrarViajes();
    }
    
    public static void leerViajes(){
        ViajeFamiliar viajeF = new ViajeFamiliar( "Popayán", "Cali", 0, new Date(), new Date(), 0);
        viajes.add(viajeF);
    }
    
    
    public static void mostrarViajes(){
        for(Viaje viaje: viajes){
            System.out.println(viaje.descripcion());
        }
        
    }
    
    
    
}
