package Tema3;

public class SegundaParte {
        public static void main(String[] args) {
            Coche miCoche = new Coche();
            miCoche.NPuerta();
            System.out.println("Mi Coche tiene ahora" + " " + miCoche.puertas + " " + "Puertas");
        }

    }
    class Coche{
        public int puertas = 5;

        public void NPuerta(){
            this.puertas++;
        }
    }

