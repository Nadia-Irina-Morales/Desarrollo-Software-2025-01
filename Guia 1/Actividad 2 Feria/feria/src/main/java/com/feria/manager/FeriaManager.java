/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feria.manager;

/**
 *
 * @author Nadia Irina M Morales L
 */
import com.feria.model.Empresa;
import com.feria.model.Stand;
import com.feria.model.Visitante;
import com.feria.model.Visita;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 * Clase que gestiona las operaciones CRUD de la feria empresarial.
 */
public class FeriaManager {
    private final List<Empresa> empresas;
    private final List<Stand> stands;
    private final List<Visitante> visitantes;
    private final List<Visita> visitas;

    public FeriaManager() {
        this.empresas = new ArrayList<>();
        this.stands = new ArrayList<>();
        this.visitantes = new ArrayList<>();
        this.visitas = new ArrayList<>();
        
    }

    // ====================== MÉTODOS PARA EMPRESAS ======================
    public void agregarEmpresa(Empresa empresa) {
        empresas.add(empresa);
        System.out.println("✅ Empresa agregada: " + empresa);
    }

    public Empresa obtenerEmpresa(int id) {
        return empresas.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public void actualizarEmpresa(int id, String nombre, String sector, String email) {
        Empresa empresa = obtenerEmpresa(id);
        if (empresa != null) {
            empresa.setNombre(nombre);
            empresa.setSector(sector);
            empresa.setEmail(email);
            System.out.println("✅ Empresa actualizada: " + empresa);
        } else {
            System.out.println("⚠ Empresa no encontrada.");
        }
    }

    public void eliminarEmpresa(int id) {
        empresas.removeIf(e -> e.getId() == id);
        System.out.println("⚠ Empresa eliminada con ID: " + id);
    }

    public void listarEmpresas() {
        System.out.println("\n📌 Empresas Registradas:");
        empresas.forEach(System.out::println);
    }

    // ====================== MÉTODOS PARA STANDS ======================
    public void agregarStand(Stand stand) {
        for (Stand s : stands) {
        if (s.getId() == stand.getId()) {
            System.out.println("⚠️ Error: El stand con ID " + stand.getId() + " ya existe.");
            return;
        }
    }
    stands.add(stand);
    System.out.println("✅ Stand agregado: " + stand);
}

    public Stand obtenerStand(int id) {
        return stands.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    public void actualizarStand(int id, int numero, String ubicacion, String tamano, Integer idEmpresa) {
        Stand stand = obtenerStand(id);
        if (stand != null) {
            stand.setNumero(numero);
            stand.setUbicacion(ubicacion);
            stand.setTamano(tamano);
            stand.setIdEmpresa(idEmpresa);
            System.out.println("✅ Stand actualizado: " + stand);
        } else {
            System.out.println("⚠ Stand no encontrado.");
        }
    }

    public void eliminarStand(int id) {
        stands.removeIf(s -> s.getId() == id);
        System.out.println("⚠ Stand eliminado con ID: " + id);
    }

    public void listarStands() {
        System.out.println("\n📌 Stands Registrados:");
        stands.forEach(System.out::println);
    }

    // ====================== MÉTODOS PARA VISITANTES ======================
    public void agregarVisitante(Visitante visitante) {
        for (Visitante v : visitantes) {
        if (v.getId() == visitante.getId()) {
            System.out.println("⚠️ Error: El visitante con ID " + visitante.getId() + " ya está registrado.");
            return;
        }
    }
    visitantes.add(visitante);
    System.out.println("✅ Visitante agregado: " + visitante);
}

    public Visitante obtenerVisitante(int id) {
        return visitantes.stream().filter(v -> v.getId() == id).findFirst().orElse(null);
    }

    public void actualizarVisitante(int id, String nombre, String identificacion, String email) {
        Visitante visitante = obtenerVisitante(id);
        if (visitante != null) {
            visitante.setNombre(nombre);
            visitante.setIdentificacion(identificacion);
            visitante.setEmail(email);
            System.out.println("✅ Visitante actualizado: " + visitante);
        } else {
            System.out.println("⚠ Visitante no encontrado.");
        }
    }

    public void eliminarVisitante(int id) {
        visitantes.removeIf(v -> v.getId() == id);
        System.out.println("⚠ Visitante eliminado con ID: " + id);
    }

    public void listarVisitantes() {
        System.out.println("\n📌 Visitantes Registrados:");
        visitantes.forEach(System.out::println);
    }

    // ====================== MÉTODOS PARA VISITAS ======================
    public void agregarVisita(int idVisitante, int idStand, String fecha, String comentario, int calificacion) {
    Visitante visitante = obtenerVisitante(idVisitante);
    Stand stand = obtenerStand(idStand);
    
    if (visitante == null) {
    System.out.println("⚠ Visitante no encontrado.");
    return;
    }
    if (stand == null) {
    System.out.println("⚠ Stand no encontrado.");
    return;
        }
    
      // Contar cuántas veces el visitante ha visitado este stand
    for (Visita v : visitas) {
        if (v.getIdStand() == idStand && v.getNombreVisitante().equals(visitante.getNombre())) {
            v.incrementarVisita(); // Incrementa la cantidad de visitas
            v.setComentario(comentario); // Actualiza comentario
            v.setCalificacion(calificacion); // Actualiza calificación
            System.out.println("🔄 Visita actualizada: " + v);
            return;
        }
    }

    // Registrar la nueva visita
    Visita nuevaVisita = new Visita(visitante.getNombre(), idStand, fecha, comentario, calificacion);
    visitas.add(nuevaVisita);
    System.out.println("✅ Nueva visita agregada: " + nuevaVisita);
    }

    public void listarVisitas() {
    if (visitas.isEmpty()) {
        System.out.println("❌ No hay visitas registradas.");
        return;
    }
    System.out.println("\n📋 LISTADO DE VISITAS:");
    for (Visita visita : visitas) {
        System.out.println("🔹 Visitante: " + visita.getNombreVisitante());
        System.out.println("🔹 Stand visitado: " + visita.getIdStand());
        System.out.println("🔹 Stand visitado " + visita.getVecesVisitado() + " veces");
        System.out.println("🔹 Fecha: " + visita.getFecha());
        System.out.println("🔹 Comentario: " + visita.getComentario());
        System.out.println("🔹 Calificación: " + visita.getCalificacion() + "⭐");
        System.out.println("----------------------------------");
    }
    }
    
    public double obtenerCalificacionPromedioStand(int idStand) {
        List<Integer> calificaciones = new ArrayList<>();
        for (Visita visita : visitas) {
            if (visita.getIdStand() == idStand) {
                calificaciones.add(visita.getCalificacion());
            }
        }
        return calificaciones.isEmpty() ? 0.0 : calificaciones.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public void listarCalificacionPromedioStands() {
        if (visitas.isEmpty()) {
            System.out.println("❌ No hay visitas registradas para calcular calificaciones.");
            return;
        }

        System.out.println("📊 Calificación promedio por Stand:");
        for (Stand stand : stands) {
            double promedio = obtenerCalificacionPromedioStand(stand.getId());
            System.out.println("🔹 Stand " + stand.getNumero() + " → Calificación promedio: " + String.format("%.2f", promedio) + "⭐");
        }
    }

// Métodos de agregar empresas, stands, visitantes y visitas...

public List<Empresa> getEmpresas() {
        return empresas;
    }

    public List<Stand> getStands() {
        return stands;
    }

    public List<Visitante> getVisitantes() {
        return visitantes;
    }

    public List<Visita> getVisitas() {
        return visitas;
    }
}


