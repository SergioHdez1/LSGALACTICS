package com.generation.proyectousuarios.models;

public class UsuarioCliente extends Usuarios{
    String equipoFavorito;
    String posicionPrincipal;
    public UsuarioCliente() {
        super();
    }
    public UsuarioCliente(String nombre, String correo, String fechaNac, String password, String nombreUsuario,
            String equipoFavorito, String posicionPrincipal) {
        super(nombre, correo, fechaNac, password, nombreUsuario);
        this.equipoFavorito = equipoFavorito;
        this.posicionPrincipal = posicionPrincipal;
    }
    public String getEquipoFavorito() {
        return equipoFavorito;
    }
    public void setEquipoFavorito(String equipoFavorito) {
        this.equipoFavorito = equipoFavorito;
    }
    public String getPosicionPrincipal() {
        return posicionPrincipal;
    }
    public void setPosicionPrincipal(String posicionPrincipal) {
        this.posicionPrincipal = posicionPrincipal;
    }

    public void reportarUsuario (String usuario){
        System.out.println("Tu reporte a "+usuario+" ha sido recibida");
    }

    public void crearPartido (){
        System.out.println("Quien pa su pichanga");
    }

    public void ingresarTicket (String ticket) {
        System.out.println("Reporte recibido");
    }

    public void ingresarAEquipo (){
        System.out.println("Llego el queso");
    }
    
    @Override
    public String toString() {
        return super.toString()+" UsuarioCliente [equipoFavorito=" + equipoFavorito + ", posicionPrincipal=" + posicionPrincipal + "]";
    }


}
