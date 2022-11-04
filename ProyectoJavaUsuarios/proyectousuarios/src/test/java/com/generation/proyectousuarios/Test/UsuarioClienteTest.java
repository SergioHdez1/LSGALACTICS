package com.generation.proyectousuarios.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.generation.proyectousuarios.models.*;

class UsuarioClienteTest {
    UsuarioCliente paula = new UsuarioCliente();
    UsuarioCliente ivan = new UsuarioCliente("ivan", "ivan@generation.cl", "31/05/2001", "salevalo", "ivansito", "U de Chile", "Delantero Killer");
        
    @Test
    void crearPartidoTest() {
        assertEquals("Te buscaremos amigos para jugar", paula.crearPartido("1234"));
        assertEquals("Te buscaremos amigos para jugar", ivan.crearPartido("pronto copec"));
    }

    @Test
    void pelotaTest() {
        assertEquals("no se si hay balón", paula.pelota(null));
        assertEquals("hay balón", paula.pelota(true));
        assertEquals("quién saca balón", ivan.pelota(false));
    }
}
