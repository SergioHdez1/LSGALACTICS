package com.generation.proyectousuarios.models;

public class UsuarioAdmin extends Usuarios{

    public UsuarioAdmin() {
        super();
    }

    public UsuarioAdmin(String nombre, String correo, String fechaNac, String password, String nombreUsuario) {
        super(nombre, correo, fechaNac, password, nombreUsuario);
    }

    public String eliminarCuentas (Usuarios usuario) {
        if(usuario.getNombreUsuario() == this.getNombreUsuario()) {
            return "no te puedes eliminar a ti mismo";
        }
        return "usuario eliminado";
    }

    public void eliminarPublicacion (){
        System.out.println("Silencio minoria");
    }
}
