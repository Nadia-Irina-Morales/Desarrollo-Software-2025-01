/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feria.model;

/**
 *
 * @author Nadia Irina M Morales L
 */
public class Visita {
    private String nombreVisitante;
    private int idStand;
    private int vecesVisitado;
    private String fecha;
    private String comentario;
    private int calificacion;
    
    public Visita(String nombreVisitante, int idStand, String fecha, String comentario, int calificacion) {
        this.nombreVisitante = nombreVisitante;
        this.idStand = idStand;
        this.vecesVisitado = 1;
        this.fecha = fecha;
        this.comentario = comentario;
        this.calificacion = calificacion;
    }

    public void incrementarVisita() {
        this.vecesVisitado++;
    }
        
    @Override
    public String toString() {
        return "Visita{" +
                "Visitante='" + nombreVisitante + '\'' +
                ", Stand Número=" + idStand +
                ", Veces Visitado=" + vecesVisitado +
                ", Fecha='" + fecha + '\'' +
                ", Comentario='" + comentario + '\'' +
                ", Calificación=" + calificacion +
                '}';
    }

    public String getNombreVisitante() {
        return nombreVisitante;
    }

    public int getIdStand() {
        return idStand;
    }

    public int getVecesVisitado() {
        return vecesVisitado;
    }

    public String getFecha() {
        return fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}