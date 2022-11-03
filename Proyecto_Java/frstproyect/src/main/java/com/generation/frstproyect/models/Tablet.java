package com.generation.frstproyect.models;

public class Tablet {

    String marca,color,modelo;
    Boolean camara,microfono;
    Float tamanoPantalla,bateria;

    String sacarFoto(String foto){
        if (foto == "apretar boton"){
            return "toma la foto";
        }
        return "no toma la foto";
    }

    String grabar(Boolean botonGrabar){
        if ( botonGrabar == true){
            return "grabando";
        }
        return "hacer nada";
        

    }
    
}
