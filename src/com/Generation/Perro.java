package com.Generation;

public class Perro {
    String nombre;
    String raza;
    int edad;
    String tamanio;

    public Perro() {

    }

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public Perro(String nombre, String raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public void caracteristicas() {
        System.out.println("Mi nombre es " + this.nombre
        + ", soy de raza " + this.raza + " tengo " + this.edad + " años y soy de tamaño " + this.tamanio + ".");
    }

    public void dormir() {
        System.out.println("Estoy durmiendo.");
    }

    public void comer() {
        System.out.println("Estoy comiendo");
    }

    public void nombre() {
        System.out.println("Mi nombre es " + this.nombre + ".");
    }

}
