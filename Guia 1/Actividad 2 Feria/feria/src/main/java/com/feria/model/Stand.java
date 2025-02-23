/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feria.model;

/**
 *
 * @author Nadia Irina M Morales L
 */
public class Stand {
    private int id;
    private int numero;
    private String ubicacion;
    private String tamano;
    private Integer idEmpresa; 

    public Stand(int id, int numero, String ubicacion, String tamano, Integer idEmpresa) {
        this.id = id;
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.idEmpresa = idEmpresa;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public String getTamano() { return tamano; }
    public void setTamano(String tamano) { this.tamano = tamano; }

    public Integer getIdEmpresa() { return idEmpresa; }
    public void setIdEmpresa(Integer idEmpresa) { this.idEmpresa = idEmpresa; }

    @Override
    public String toString() {
        return "Stand {ID=" + id + ", Número=" + numero + ", Ubicación='" + ubicacion +
                "', Tamaño='" + tamano + "', Empresa ID=" + (idEmpresa != null ? idEmpresa : "Ninguna") + "}";
    }
}

