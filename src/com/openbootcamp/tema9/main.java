package com.openbootcamp.tema9;

public class main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.nombre = "Leandro";
        cliente.edad = 28;
        cliente.telefono = 1234;
        cliente.credito = 550.5;

        System.out.println("Mi nombre es: "+cliente.nombre+" Tengo: "+cliente.edad+" Años "+"Mi telefono es: "+cliente.telefono+" Mi credito es: "+cliente.credito);

        trabajador.nombre = "Hernan";
        trabajador.edad = 30;
        trabajador.telefono= 5678;
        trabajador.salario= 40.52;

        System.out.println("Mi nombre es: "+trabajador.nombre+" Tengo: "+trabajador.edad+" Años "+"Mi telefono es: "+trabajador.telefono+" Mi salario es: "+trabajador.salario);

    }
}

class Persona{
   int edad;
   String nombre;
   int telefono;

}
class Cliente extends Persona{
    Double credito;
}

class Trabajador extends Persona{
    Double salario;
}
