/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feria.main;

/**
 *
 * @author Nadia Irina M Morales L
 */

import com.feria.manager.FeriaManager;
import com.feria.model.Empresa;
import com.feria.model.Stand;
import com.feria.model.Visitante;
import com.feria.model.Visita;

public class Main {
    public static void main(String[] args) {
        FeriaManager feria = new FeriaManager();

        // Agregar empresas
        feria.agregarEmpresa(new Empresa(1, "UmbrellaCorp", "Tecnología", "contacto@umbrellacorp.com"));
        feria.agregarEmpresa(new Empresa(2, "HealthCare", "Salud", "info@healthcare.com"));

        // Agregar stands
        feria.agregarStand(new Stand(1, 101, "Pabellón A", "Grande", 1));
        feria.agregarStand(new Stand(2, 202, "Pabellón B", "Mediano", 2));

        // Agregar visitantes
        feria.agregarVisitante(new Visitante(1, "Juan Pérez", "12345678", "juanperez@email.com"));
        feria.agregarVisitante(new Visitante(2, "Ana Gómez", "87654321", "ana@email.com"));

        // Agregar visitas de un mismo visitante a diferentes stands
        feria.agregarVisita(1, 1, "2025-02-14", "Muy buen stand", 5);
        feria.agregarVisita(1, 2, "2025-02-14", "Interesante propuesta", 4);
        feria.agregarVisita(1, 1, "2025-02-15", "Volví porque me encantó", 5); // Segunda visita al mismo stand
        feria.agregarVisita(2, 1, "2025-02-15", "Excelente atención", 5);
        feria.agregarVisita(2, 2, "2025-02-15", "Podría mejorar", 3);
        
        feria.obtenerCalificacionPromedioStand(1);
        feria.obtenerCalificacionPromedioStand(2);
 

        // Mostrar datos
        feria.listarEmpresas();
        feria.listarStands();
        feria.listarVisitantes();
        feria.listarVisitas();
        feria.listarCalificacionPromedioStands();
    }
}
