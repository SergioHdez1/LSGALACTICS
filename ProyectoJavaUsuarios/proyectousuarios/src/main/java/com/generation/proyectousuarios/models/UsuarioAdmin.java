package com.generation.proyectousuarios.models;

public class UsuarioAdmin extends Usuarios{

    public UsuarioAdmin() {
        super();
    }

    public UsuarioAdmin(String nombre, String correo, String fechaNac, String password, String nombreUsuario) {
        super(nombre, correo, fechaNac, password, nombreUsuario);
    }

    public void eliminarCuentas (){
        System.out.println("Pum te elimino");
    }

    public void eliminarPublicacion (){
        System.out.println("Silencio minoria");
    }
}
