/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.garage.manager;

/**
 *
 * @author Nadia Irina M Morales L
 */

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.garage.model.Automovil;
import com.garage.model.Camion;
import com.garage.model.Motocicleta;
import com.garage.model.Vehiculo;

public class Parqueadero {
    private List<Vehiculo> vehiculos;
    private List<String> historial;
    private static final double TARIFA_AUTOMOVIL = 5000;
    private static final double TARIFA_MOTOCICLETA = 3000;
    private static final double TARIFA_CAMION = 8000;
    
    public Parqueadero() {
        vehiculos = new ArrayList<>();
        historial = new ArrayList<>();
    }
    
    public void registrarEntrada(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo registrado con éxito. " + vehiculo.getPlaca());
    }
    
    public double registrarSalida(String placa) {
        Iterator<Vehiculo> iterator = vehiculos.iterator();
        while (iterator.hasNext()) {
            Vehiculo v = iterator.next();
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                long horas = Duration.between(v.getHoraEntrada(), LocalDateTime.now()).toHours();
                if (horas == 0) horas = 1;
                double tarifa = (v instanceof Automovil) ? TARIFA_AUTOMOVIL :
                                (v instanceof Motocicleta) ? TARIFA_MOTOCICLETA : TARIFA_CAMION;
                double costo = horas * tarifa;
                iterator.remove();
                historial.add("Placa: " + v.getPlaca() + ", Fecha: " + LocalDateTime.now() + ", Costo: $" + costo);
                System.out.println("Vehículo retirado. Costo: $" + costo);
                return costo;
            }
        }
        System.out.println("Error: Vehículo no encontrado en el parqueadero.");
        return 0;
    }
    
    public void consultarEstado() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos en el parqueadero.");
        } else {
            System.out.println("Vehículos en el parqueadero:");
            for (Vehiculo v : vehiculos) {
                System.out.println("- " + v.getPlaca() + " | " + v.getMarca() + " | " + v.getModelo());;
            }
        }
        
    }
    
    public void generarReporte() {
        List<String> reporte = historial.stream()
                .filter(entry -> entry.contains("Fecha: " + LocalDateTime.now()))
                .collect(Collectors.toList());
        
        if (reporte.isEmpty()) {
            System.out.println("No hay registros para el día de hoy.");
        } else {
            System.out.println("Reporte de vehículos registrados hoy:");
            reporte.forEach(System.out::println);
        }
    }
}