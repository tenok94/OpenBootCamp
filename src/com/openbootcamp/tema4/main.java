package com.openbootcamp.tema4;

public class main {

    public static void main(String[] args) {
        int numerosIF = 0;

        if (numerosIF>0){
            System.out.println("La variable numeroIf " + numerosIF + " es positivo");
        } else if (numerosIF<0) {
            System.out.println("La variable numeroIf " + numerosIF+ " es negativa");
        }
        else{
            System.out.println("La variable numeroIf " +numerosIF+ " es cero");
        }

        int numeroWhile = 1;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("La variable numeroWhile ahora vale: " + numeroWhile);
        }

        int numeroDoWhile = 3;

        do{
            numeroDoWhile++;
            System.out.println("La variable numeroDoWhile ahora vale " +numeroDoWhile);
        }while (numeroDoWhile<4);

        for (int numeroFor = 0;numeroFor <=3; numeroFor++ ){
            System.out.println("La variable ahora vale: "+numeroFor);
        }

        String estacion = "otoño";
        switch (estacion){
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "primavera":
                System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "otoño":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("No puso una estacion");
        }
    }
}

