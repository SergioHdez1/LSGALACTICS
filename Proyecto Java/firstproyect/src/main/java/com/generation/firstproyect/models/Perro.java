package com.generation.firstproyect.models;

public class Perro {
    private String nombre;
    private String pelaje;
    private String raza;
    private Boolean vacunado;
    // constructor
    public Perro() {
    }

    public Perro(String nombre, String pelaje, String raza, Boolean vacunado) {
        this.nombre = nombre;
        this.pelaje = pelaje;
        this.raza = raza;
        this.vacunado = vacunado;
    }
    
    public Perro(String nombre, String pelaje, String raza) {
        this.nombre = nombre;
        this.pelaje = pelaje;
        this.raza = raza;
        this.vacunado = false;
    }
    public Perro(String nombre, String pelaje) {
        this.nombre = nombre;
        this.pelaje = pelaje;
        this.raza = "Quiltro";
        this.vacunado = false;
    }

    //getters & setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    public String getPelaje() {
        return pelaje;
    }
    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public Boolean getVacunado() {
        return vacunado;
    }
    public void setVacunado(Boolean vacunado) {
        this.vacunado = vacunado;
    }
    //funciones
    public void ladrar(){
        System.out.println("guau");
    }

    public void caminar(){
        System.out.println("dar un pasito");
    }

    public String truco(String tipoTruco){
        if (tipoTruco == "da la pata"){
            return "doy la pata";
        }
        return "no hago nada :c";
    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", pelaje=" + pelaje + ", raza=" + raza + ", vacunado=" + vacunado + "]";
    }

    
}
