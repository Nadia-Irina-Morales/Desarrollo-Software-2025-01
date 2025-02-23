/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.garage.main;

/**
 *
 * @author Nadia Irina M Morales L
 */

import java.util.Scanner;

import com.garage.manager.Parqueadero;
import com.garage.model.Vehiculo;
import com.garage.model.Automovil;
import com.garage.model.Motocicleta;
import com.garage.model.Camion;

public class Main {

    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú Parqueadero ---");
            System.out.println("1. Registrar entrada de vehículo");
            System.out.println("2. Registrar salida de vehículo");
            System.out.println("3. Consultar estado del parqueadero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione tipo de vehículo: 1. Automóvil, 2. Motocicleta, 3. Camión");
                    int tipo = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Ingrese placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Ingrese marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese modelo: ");
                    String modelo = scanner.nextLine();

                    Vehiculo vehiculo = null;
                    if (tipo == 1) {
                        System.out.print("Tipo de combustible: ");
                        String tipoCombustible = scanner.nextLine();
                        vehiculo = new Automovil(placa, marca, modelo, tipoCombustible);
                    } else if (tipo == 2) {
                        System.out.print("Cilindraje: ");
                        int cilindraje = scanner.nextInt();
                        vehiculo = new Motocicleta(placa, marca, modelo, cilindraje);
                    } else if (tipo == 3) {
                        System.out.print("Capacidad de carga (toneladas): ");
                        double capacidadCarga = scanner.nextDouble();
                        vehiculo = new Camion(placa, marca, modelo, capacidadCarga);
                    }

                    if (vehiculo != null) parqueadero.registrarEntrada(vehiculo);
                    break;

                case 2:
                    System.out.print("Ingrese placa: ");
                    String placaSalida = scanner.nextLine();
                    parqueadero.registrarSalida(placaSalida);
                    break;

                case 3:
                    parqueadero.consultarEstado();
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    return;
                    
                default:
                    System.out.println("Opción inválida.");    
            }
        }
    }
}