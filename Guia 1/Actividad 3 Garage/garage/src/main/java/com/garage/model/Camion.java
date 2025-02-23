/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.garage.model;

/**
 *
 * @author Nadia Irina M Morales L
 */
public class Camion extends Vehiculo {
    private double capacidadCarga;
    private static final double TARIFA_POR_HORA = 8000; // Tarifa en pesos

    public Camion(String placa, String marca, String modelo, double capacidadCarga) {
        super(placa, marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() { return capacidadCarga; }
    public void setCapacidadCarga(double capacidadCarga) { this.capacidadCarga = capacidadCarga; }

    @Override
    public double calcularTarifa(long horas) {
        return horas * TARIFA_POR_HORA;
    }
}
