package com.generation.frstproyect.models;

public class Parlante {
    private String marca,modelo,color,entradaCorriente,botonEncender,botonApagar,entradaAudio,botonPausar,botonReproducir,volMas,volMenos;
    Integer bocina,tamano;
   
    
    
    

    
    public Parlante(String marca, String modelo, String color, String entradaCorriente, String botonEncender,
            String botonApagar, String entradaAudio, String botonPausar, String botonReproducir, String volMas,
            String volMenos, Integer bocina, Integer tamano) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.entradaCorriente = entradaCorriente;
        this.botonEncender = botonEncender;
        this.botonApagar = botonApagar;
        this.entradaAudio = entradaAudio;
        this.botonPausar = botonPausar;
        this.botonReproducir = botonReproducir;
        this.volMas = volMas;
        this.volMenos = volMenos;
        this.bocina = bocina;
        this.tamano = tamano;
    }


    public Parlante(){

    }
    
    
    public Parlante(String marca,String modelo,String color,Integer tamano){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tamano = tamano;
        this.entradaAudio = "Incorporado";
        this.entradaCorriente = "12v";
        this.botonEncender = "Incorporado";
        this.botonApagar = "Incorporado";
        this.botonPausar = "Incorporado";
        this.botonReproducir = "Incorporado";
       
        
    }


    
    
    

    public Integer getTamano() {
        return tamano;
    }

    public void setTamano(Integer tamano) {
        this.tamano = tamano;
    }


    public void setBotonPausar(String botonPausar) {
        this.botonPausar = botonPausar;
    }



    public String getBotonReproducir() {
        return botonReproducir;
    }



    public void setBotonReproducir(String botonReproducir) {
        this.botonReproducir = botonReproducir;
    }



    public String getVolMas() {
        return volMas;
    }



    public void setVolMas(String volMas) {
        this.volMas = volMas;
    }



    public String getVolMenos() {
        return volMenos;
    }



    public void setVolMenos(String volMenos) {
        this.volMenos = volMenos;
    }



    public Integer getBocina() {
        return bocina;
    }



    public void setBocina(Integer bocina) {
        this.bocina = bocina;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEntradaCorriente() {
        return entradaCorriente;
    }

    public void setEntradaCorriente(String entradaCorriente) {
        this.entradaCorriente = entradaCorriente;
    }

    public String getEntradaAudio() {
        return entradaAudio;
    }


    public void setEntradaAudio(String entradaAudio) {
        this.entradaAudio = entradaAudio;
    }

    public String getBotonEncender() {
        return botonEncender;
    }

    public void setBotonEncender(String botonEncender) {
        this.botonEncender = botonEncender;
    }
    public String getBotonApagar() {
        return botonApagar;
    }

    public void setBotonApagar(String botonApagar) {
        this.botonApagar = botonApagar;
    }

    void encender(){
        System.out.println("encendiendo");
    }
    void apagar(){
        System.out.println("apagando");
    }
    String reproducir(String botonReproducir){
        if (botonReproducir == "reprudce"){
            return "reproducir";
        }
        return "no hacer nada";

    }
    String pausar(String botonParar){
        if (botonParar == "pausa"){
            return "pausar";
        }
        return "no hacer nada";
    }
    String volumen(String vol){
        if (vol == "subir"){
            return "sube el volumen";
        }
        else if(vol == "bajar"){
            return "baja el volumen";
        }
        else{
            return "no hacer nada";
        }
        
    }

    @Override
    public String toString() {
        return "Parlante [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", entradaCorriente="
                + entradaCorriente + ", botonEncender=" + botonEncender + ", botonApagar=" + botonApagar
                + ", entradaAudio=" + entradaAudio + ", botonPausar=" + botonPausar + ", botonReproducir="
                + botonReproducir + ", volMas=" + volMas + ", volMenos=" + volMenos + ", bocina=" + bocina + ", tamano="
                + tamano + "]";
    }
    


    
}
    


    

 


    
    

