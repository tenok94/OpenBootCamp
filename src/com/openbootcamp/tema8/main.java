package com.openbootcamp.tema8;

public class main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.setEdad(28);
        persona1.setNombre("Leandro");
        persona1.setTelefono(1234);

        persona2.setEdad(26);
        persona2.setNombre("Anita");
        persona2.setTelefono(4321);

        System.out.println("Nombre: " + persona1.getNombre() +" "+ "Edad: " + persona1.getEdad() + " Años " + " " + "Telelefono: " + persona1.getTelefono());
        System.out.println("Nombre: " + persona2.getNombre() +" "+ "Edad: " + persona2.getEdad() + " Años " + " " + "Telelefono: " + persona2.getTelefono());

    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
