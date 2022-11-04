package com.generation.proyectousuarios.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.generation.proyectousuarios.models.*;

class UsuariosTest {
    @Test
    void iniciarSesionTest() {
        Usuarios nulo = new Usuarios();
        Usuarios francisca = new Usuarios("francisca", "francisca@generation.cl", "14/12/1992","1234","fran");
        // en el primer assertEquals comprobamos que ingresando mal la contraseña nos devuelva lo esperado
        assertEquals("Usuario o contrasenia incorrecta", francisca.iniciarSesion(francisca.getNombreUsuario(), "123334"));
        // en el primer assertEquals comprobamos que ingresando mal el nombre de usuario nos devuelva lo esperado
        assertEquals("Usuario o contrasenia incorrecta", francisca.iniciarSesion("quien soy", "1234"));
        // comprobamos que ingresando un dato null no nos devuelve un error
        assertEquals("Usuario o contrasenia incorrecta", nulo.iniciarSesion(nulo.getNombreUsuario(), "123334"));
        // comprobamos que ingresando los datos correctos se el codigo funciona
        assertEquals("Sesion iniciada correctamente", francisca.iniciarSesion(francisca.getNombreUsuario(), "1234"));
    }
}
