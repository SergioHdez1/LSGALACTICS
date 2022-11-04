package com.generation.proyectousuarios.models;

public class Usuarios {
    String nombre;
    String correo;
    String fechaNac;
    String password;
    String nombreUsuario;
    public Usuarios() {
    }
    public Usuarios(String nombre, String correo, String fechaNac, String password, String nombreUsuario) {
        this.nombre = nombre;
        this.correo = correo;
        this.fechaNac = fechaNac;
        this.password = password;
        this.nombreUsuario = nombreUsuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    /* public String getPassword() {
        return password;
    } */
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    public void registrar(){
        System.out.println("Usuario registrado");
    }

    public String iniciarSesion (String userName, String contrasenia){
        try {
            if (userName != this.nombreUsuario || contrasenia != this.password){
                return "Usuario o contrasenia incorrecta";
            } 
            return "Sesion iniciada correctamente";            
        } catch (Exception e) {
            // TODO: handle exception
            return "Usuario o contrasenia incorrecta";
        }
    }

    public void cerrarSesion (){
        System.out.println("Sesion Finalizada");
    }


    @Override
    public String toString() {
        return "Usuarios [nombre=" + nombre + ", correo=" + correo + ", fechaNac=" + fechaNac + ", nombreUsuario="
                + nombreUsuario + "]";
    }    
}
