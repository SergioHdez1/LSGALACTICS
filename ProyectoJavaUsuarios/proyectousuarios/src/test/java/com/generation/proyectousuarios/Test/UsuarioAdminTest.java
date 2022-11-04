package com.generation.proyectousuarios.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.generation.proyectousuarios.models.*;

public class UsuarioAdminTest {
    @Test
    void eliminarCuentasTest() {
        Usuarios ivan = new Usuarios("ivan", "ivan@generation.cl", "31/05/2001", "salevalo", "ivansito");
        UsuarioAdmin benjamin = new UsuarioAdmin("benjamin", "benjamin@generation.com", "08/02/1996", "contrasenia", "benja");
		assertEquals("usuario eliminado", benjamin.eliminarCuentas(ivan));
		assertEquals("no te puedes eliminar a ti mismo", benjamin.eliminarCuentas(benjamin));
    }
}
