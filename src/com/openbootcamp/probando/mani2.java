package com.openbootcamp.probando;

public class mani2 {
    public static void main(String[] args) {
        /*Vehiculo coche = new Vehiculo();
        coche.setTipo("Coche");
        coche.setVelocidadMaxima(120);
        coche.setRapido(true);

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Scotter");
        moto.setVelocidadMaxima(50);
        moto.setRapido(false);

        System.out.println(coche.getTipo() + " " + coche.getVelocidadMaxima() + " " + coche.isRapido());
        System.out.println(moto.getTipo() + " " + moto.getVelocidadMaxima() + " " + moto.isRapido());*/
    }
}

abstract class Vehiculo {
    private String tipo;
    private int velocidadMaxima;

    //private boolean rapido;
    private String sonido;

    abstract public void setSonido(String sonido);

    abstract public String getSonido();

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public String getTipo() {

        return tipo;
    }

    public int getVelocidadMaxima() {

        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {

        this.velocidadMaxima = velocidadMaxima;
    }

    /*public void setRapido(boolean rapido) {

        this.rapido = rapido;
    }

    public boolean isRapido() {

        return rapido;
    }*/
}
