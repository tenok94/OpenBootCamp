package com.openbootcamp.probando;

public class mani2 {
    public static void main(String[] args) {

    }
}
interface Vehiculo{
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo{
    public void Acelerar(int cuantaVelocidad) {

    }
    public void Frenar(int cuantaVelocidad) {

    }
}


/*class Vehiculo{
    public void diHola(){
        System.out.println("Hola!!");
    }
}

class Coche extends Vehiculo{
    public void diHola(){
        System.out.println("Soy un coche!");
    }

    public int sumaNumero(int a, int b){
        System.out.println("Soy sumaNumeros INT");
        return a + b;
    }
    public float sumaNumero(float a, float b){
        System.out.println("Soy sumaNumeros float");
        return (float) (a + b * 9.0);
    }
    public void sumaNumeros(double a, double b){
        System.out.println("el resultado es: " + (a+b));
    }
}*/
/*abstract class Vehiculo{
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo(){
        System.out.println("estoy en el contructor");
    }

    abstract public String getSonido();
    abstract public void setSonido(String sonido);
}*/
/*class Coche extends Vehiculo{
    public String getSonido() {
        return "soy un supersonido: " + this.sonido;
    }
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
class Moto extends Vehiculo{
    public String getSonido() {
        return this.sonido;
    }
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}*/
/*abstract class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private boolean rapido;
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

    public void setRapido(boolean rapido) {

        this.rapido = rapido;
    }

    public boolean isRapido() {

        return rapido;
    }
}*/
