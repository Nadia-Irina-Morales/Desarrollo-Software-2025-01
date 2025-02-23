/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.feria.manager.FeriaManager;
import com.feria.model.Empresa;
import com.feria.model.Stand;
import com.feria.model.Visitante;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nadia Irina M Morales L
 */
class FeriaManagerTest {
    private FeriaManager feria;

    @BeforeEach
    void setUp() {
        feria = new FeriaManager();

        // Agregar datos iniciales
        feria.agregarEmpresa(new Empresa(1, "UmbrellaCorp", "Tecnología", "contacto@umbrellacorp.com"));
        feria.agregarStand(new Stand(1, 101, "Pabellón A", "Grande", 1));
        feria.agregarStand(new Stand(2, 202, "Pabellón B", "Mediano", 2));
        feria.agregarVisitante(new Visitante(1, "Juan Pérez", "12345678", "juanperez@email.com"));
        feria.agregarVisitante(new Visitante(2, "Ana Gómez", "87654321", "ana@email.com"));
        feria.agregarVisita(1, 1, "2025-02-14", "Muy buen stand", 5);
        feria.agregarVisita(1, 2, "2025-02-14", "Interesante propuesta", 4);
        feria.agregarVisita(1, 1, "2025-02-15", "Volví porque me encantó", 5);
        feria.agregarVisita(2, 1, "2025-02-15", "Excelente atención", 5);
        feria.agregarVisita(2, 2, "2025-02-15", "Podría mejorar", 3);
    }

    @Test
    void testAgregarEmpresa() {
        FeriaManager feria = new FeriaManager();
        Empresa empresa = new Empresa(1, "UmbrellaCorp", "Tecnología", "contacto@umbrellacorp.com");

        feria.agregarEmpresa(empresa);

        assertEquals(1, feria.getEmpresas().size());
        assertEquals("TechCorp", feria.getEmpresas().get(0).getNombre());
    }

    // 🔹 PRUEBA PARA EDITAR UNA EMPRESA
    @Test
    void testActualizarEmpresa() {
        feria.agregarEmpresa(new Empresa(1, "UmbrellaCorp", "Tecnología", "contacto@umbrellacorp.com"));
        feria.actualizarEmpresa(1, "UmbrellaCorp Inc.", "Tecnología Avanzada", "newemail@umbrellacorp.com");
        Empresa empresa = feria.obtenerEmpresa(1);
        assertNotNull(empresa, "La empresa debería existir después de actualizarse.");
        assertEquals("UmbrellaCorp Inc.", empresa.getNombre());
        assertEquals("Tecnología Avanzada", empresa.getSector());
        assertEquals("newemail@umbrellacorp.com", empresa.getEmail());
    }
    
    // 🔹 PRUEBA PARA ELIMINAR UNA EMPRESA
    @Test
    void testEliminarEmpresa() {
        FeriaManager feria = new FeriaManager();
        feria.agregarEmpresa(new Empresa(1, "UmbrellaCorp", "Tecnología", "contacto@umbrellacorp.com"));
        feria.eliminarEmpresa(1);
        assertNull(feria.obtenerEmpresa(1), "La empresa eliminada no debería existir.");
    }
    
    @Test
    void testAgregarStand() {
        FeriaManager feria = new FeriaManager();
        feria.agregarStand(new Stand(1, 101, "Pabellón A", "Grande", 1));

        assertEquals(1, feria.getStands().size());
        assertEquals(101, feria.getStands().get(0).getNumero());
    }

    // 🔹 PRUEBA PARA EDITAR UN STAND
    @Test
    void testActualizarStand() {
        feria.agregarEmpresa(new Empresa(1, "UmbrellaCorp", "Tecnología", "contacto@umbrellacorp.com"));
        feria.agregarStand(new Stand(1, 101, "Pabellón A", "Grande", 1));
        
        feria.actualizarStand(1, 102, "Pabellón B", "Mediano", 1);
        Stand stand = feria.obtenerStand(1);

        assertNotNull(stand, "El stand debería existir después de actualizarse.");
        assertEquals(102, stand.getNumero());
        assertEquals("Pabellón B", stand.getUbicacion());
        assertEquals("Mediano", stand.getTamano());
    }

    // 🔹 PRUEBA PARA ELIMINAR UN STAND
    @Test
    void testEliminarStand() {
        feria.agregarEmpresa(new Empresa(1, "UmbrellaCorp", "Tecnología", "contacto@umbrellacorp.com"));
        feria.agregarStand(new Stand(1, 101, "Pabellón A", "Grande", 1));
        feria.eliminarStand(1);
        assertNull(feria.obtenerStand(1), "El stand eliminado no debería existir.");
    }
    
    @Test
    void testAgregarVisitante() {
        FeriaManager feria = new FeriaManager();
        feria.agregarVisitante(new Visitante(1, "Juan Pérez", "12345678", "juanperez@email.com"));

        assertEquals(1, feria.getVisitantes().size());
        assertEquals("Juan Pérez", feria.getVisitantes().get(0).getNombre());
    }

     // 🔹 PRUEBA PARA EDITAR UN VISITANTE
    @Test
    void testActualizarVisitante() {
        feria.agregarVisitante(new Visitante(1, "Juan Pérez", "12345678", "juanperez@email.com"));
        
        feria.actualizarVisitante(1, "Juan P.", "98765432", "juanp@email.com");
        Visitante visitante = feria.obtenerVisitante(1);

        assertNotNull(visitante, "El visitante debería existir después de actualizarse.");
        assertEquals("Juan P.", visitante.getNombre());
        assertEquals("98765432", visitante.getIdentificacion());
        assertEquals("juanp@email.com", visitante.getEmail());
    }

    // 🔹 PRUEBA PARA ELIMINAR UN VISITANTE
    @Test
    void testEliminarVisitante() {
        feria.agregarVisitante(new Visitante(1, "Juan Pérez", "12345678", "juanperez@email.com"));
        feria.eliminarVisitante(1);
        assertNull(feria.obtenerVisitante(1), "El visitante eliminado no debería existir.");
    }

    @Test
        void testAgregarVisita() {
        FeriaManager feria = new FeriaManager();

        // Agregar visitante y stand antes de la prueba
         feria.agregarVisitante(new Visitante(1, "Juan Pérez", "12345678", "juanperez@email.com"));
        feria.agregarStand(new Stand(1, 101, "Pabellón A", "Grande", 1));

        // Agregar visita
        feria.agregarVisita(1, 1, "2025-02-14", "Muy buen stand", 5);

        assertEquals(1, feria.getVisitas().size());
        assertEquals("Juan Pérez", feria.getVisitas().get(0).getNombreVisitante());
        assertEquals(5, feria.getVisitas().get(0).getCalificacion());
    }

    @Test
    void testObtenerCalificacionPromedioStand() {
        double promedioStand1 = feria.obtenerCalificacionPromedioStand(1);
        double promedioStand2 = feria.obtenerCalificacionPromedioStand(2);

        assertEquals(5.0, promedioStand1, 0.01, "El promedio del stand 1 debería ser 5.0");
        assertEquals(3.5, promedioStand2, 0.01, "El promedio del stand 2 debería ser 3.5");
    }  
    
    @Test
    void testListarCalificacionPromedioStands() {
        feria.listarCalificacionPromedioStands();
    }
}

    
