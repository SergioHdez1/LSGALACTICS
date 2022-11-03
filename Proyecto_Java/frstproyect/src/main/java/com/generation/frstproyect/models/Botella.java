package com.generation.frstproyect.models;

public class Botella extends Envases {

    String tipoTapa;

    public Botella() {
        super();
    }

    public Botella(String material, Integer volumen, String contenido, String tipoTapa) {
        super(material, volumen, contenido);
        this.tipoTapa = tipoTapa;
    }

    public String getTipoTapa() {
        return tipoTapa;
    }

    public void setTipoTapa(String tipoTapa) {
        this.tipoTapa = tipoTapa;
    }

    public void usoBotella(){
        System.out.println("No me uses de molotov");
    }

    @Override
    public String toString() {
        return super.toString()+"Botella [tipoTapa=" + tipoTapa + "]";
    }

    

    

    
 

}




        
   

