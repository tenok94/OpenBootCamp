/*Crear una clase coche.
 Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
 Una función que incremente el número de puertas que tiene el coche.
 Crear un objeto miCoche en el main y añadirle una puerta.
 Mostrar el número de puertas que tiene el objeto.*/

public class EjercicioTema3B {
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