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
        System.out.println("Hello World!");
        leerViajes();
        mostrarViajes();
    }
    
    public static void leerViajes(){
        ViajeFamiliar viajeF = new ViajeFamiliar(0, "Popayán", "Cali", 0, new Date(), new Date());
        viajes.add(viajeF);
    }
    
    
    public static void mostrarViajes(){
        for(Viaje viaje: viajes){
            System.out.println(viaje.descripcion());
        }
        
    }
    
    
    
}
