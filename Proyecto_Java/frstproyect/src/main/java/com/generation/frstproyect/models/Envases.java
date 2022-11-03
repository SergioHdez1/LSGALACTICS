package com.generation.frstproyect.models;

public class Envases {

    String material;
    Integer volumen;
    String contenido;
    
    
    public Envases() {
    }


    public Envases(String material, Integer volumen, String contenido) {
        this.material = material;
        this.volumen = volumen;
        this.contenido = contenido;
    }


    public String getMaterial() {
        return material;
    }


    public void setMaterial(String material) {
        this.material = material;
    }


    public Integer getVolumen() {
        return volumen;
    }


    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }


    public String getContenido() {
        return contenido;
    }


    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void contener(){
        System.out.println("Contengo cosas xd");
    }


    @Override
    public String toString() {
        return "Envases [material=" + material + ", volumen=" + volumen + ", contenido=" + contenido + "]";
    }

}
