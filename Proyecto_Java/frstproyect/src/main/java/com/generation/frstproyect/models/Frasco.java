package com.generation.frstproyect.models;

public class Frasco extends Envases {

    String forma;

    public Frasco() {
        super();
    }

    public Frasco(String material, Integer volumen, String contenido, String forma) {
        super(material, volumen, contenido);
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void usoFrasco(){
        System.out.println("No soy un vaso :c");
    }

    @Override
    public String toString() {
        return super.toString()+"Frasco [forma=" + forma + "]";
    }

    

    

    

    



    
}
