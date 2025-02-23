/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.garage.manager;

/**
 *
 * @author Nadia Irina M Morales L
 */

import com.garage.model.Vehiculo;
import java.util.List;

public class Reporte {
     public static void generarReporte(List<Vehiculo> vehiculos) {
        System.out.println("\n===== Reporte de Parqueadero =====");
        for (Vehiculo v : vehiculos) {
            System.out.println(v.getPlaca() + " | " + v.getMarca() + " | " + v.getModelo());
        }
        System.out.println("==================================");
    }
} 
