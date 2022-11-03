package com.generation.frstproyect.models;

public class Lata extends Envases {

    boolean Anilla;

    public Lata() {
        super();
    }

    public Lata(String material, Integer volumen, String contenido, boolean anilla) {
        super(material, volumen, contenido);
        Anilla = anilla;
    }

    public boolean isAnilla() {
        return Anilla;
    }

    public void setAnilla(boolean anilla) {
        Anilla = anilla;
    }

    public void usoLata (){
        System.out.println("No me gusta guardar palmitos");
    }

    @Override
    public String toString() {
        return super.toString()+"Lata [Anilla=" + Anilla + "]";
    }

    

    

    
    
}
