package com.openbootcamp.probando;

public class main {
    public static void main(String[] args) {
        Coche coche = new Coche(2,90);
        System.out.printf("El numero de Puertas son: %d\n", coche.numeroDePuertas);
        System.out.printf("La velocidad maxima es: %d\n", coche.velocidadMaxima);


        Coche coche2 = new Coche();
        System.out.printf("El numero de Puertas son: %d\n", coche2.numeroDePuertas);
        System.out.printf("La velocidad maxima es: %d\n", coche2.velocidadMaxima);
        


    }

    static class Coche {
        int numeroDePuertas;
        int velocidadMaxima;
        float velocidadActual;

        public Coche(int numeroDePuertas, int velocidadMaxima){
            this.numeroDePuertas = numeroDePuertas;
            this.velocidadMaxima = velocidadMaxima;
            System.out.println("estoy en el constructor sin PARAMETROS");
        }

        public Coche(){
            numeroDePuertas = 5;
            velocidadMaxima = 120;
            System.out.println("estoy en el constructor con PARAMETROS");
        }

        public void acelerar(){
            velocidadActual += 15.5;
        }
        public void desacelerar(){}
    }
}
