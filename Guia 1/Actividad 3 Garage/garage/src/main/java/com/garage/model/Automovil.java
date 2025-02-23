/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.garage.model;

/**
 *
 * @author Nadia Irina M Morales L
 */
public class Automovil extends Vehiculo {
    private String tipoCombustible;
    private static final double TARIFA_POR_HORA = 5000; // Tarifa en pesos

    public Automovil(String placa, String marca, String modelo, String tipoCombustible) {
        super(placa, marca, modelo);
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    @Override
    public double calcularTarifa(long horas) {
        return horas * TARIFA_POR_HORA;
    }
}