package Tema3;

//Crear una función con tres parámetros que sean números que se suman entre sí.
//Llamar a la función en el main y darle valores.

public class PrimeraParte {
        public static void main(String[] args) {
            int valor1 = 20;
            int valor2 = 30;
            int valor3 = 40;

            var valorTotal = suma(valor1, valor2, valor3);

            System.out.println(valorTotal);
        }

        public static int suma(int a, int b, int c) {
            return a + b + c;

        }
    }

