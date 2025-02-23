/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feria.model;

/**
 *
 * @author Nadia Irina M Morales L
 */
public class Visitante {
    private int id;
    private String nombre;
    private String identificacion;
    private String email;

    public Visitante(int id, String nombre, String identificacion, String email) {
        this.id = id;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getIdentificacion() { return identificacion; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Visitante {ID=" + id + ", Nombre='" + nombre + "', Identificación='" + identificacion + "', Email='" + email + "'}";
    }
}
