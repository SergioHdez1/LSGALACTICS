package com.generation.proyectousuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.proyectousuarios.models.UsuarioAdmin;
import com.generation.proyectousuarios.models.UsuarioCliente;
import com.generation.proyectousuarios.models.Usuarios;

@SpringBootApplication
public class ProyectousuariosApplication {

	public static void main(String[] args) {
		/* SpringApplication.run(ProyectousuariosApplication.class, args); */

		UsuarioCliente sergio = new UsuarioCliente();
		System.out.println(sergio);

		UsuarioAdmin francisca = new UsuarioAdmin("francisca", "francisca@generation.cl", "14/12/1992","1234","fran");
		System.out.println(francisca);

		UsuarioAdmin benjamin = new UsuarioAdmin("benjamin", "benjamin@generation.com", "08/02/1996", "contrasenia", "benja");
		System.out.println(benjamin);

		UsuarioCliente paula = new UsuarioCliente();
		System.out.println(paula);
		paula.setNombre("paula");
		paula.setCorreo("paula@generation.cl");
		paula.setPassword("patito");
		System.out.println(paula);

		UsuarioCliente ivan = new UsuarioCliente("ivan", "ivan@generation.cl", "31/05/2001", "salevalo", "ivansito", "U de Chile", "Delantero Killer");
		System.out.println(ivan);
		String var = ivan.getNombre();
		System.out.println(var);
		
		System.out.println(benjamin.iniciarSesion("benj", "contrasenia"));
		francisca.eliminarCuentas();
		paula.crearPartido();

		
	}

}
