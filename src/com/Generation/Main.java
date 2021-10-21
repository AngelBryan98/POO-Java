package com.Generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Perro lomito = new Perro();
        lomito.nombre = "chems";
        lomito.edad = 1;
        lomito.raza = "mestizo";
        lomito.tamanio = "wrande";
        lomito.caracteristicas();
        lomito.comer();

        Perro lomito2 = new Perro();
        lomito2.nombre = "Firulais";
        lomito2.edad = 2;
        lomito2.raza = "pug";
        lomito2.tamanio = "chico";
        lomito2.caracteristicas();
        lomito2.dormir();

        Perro lomito3 = new Perro("Milanezo");
        lomito3.nombre();

        Perro lomito4 = new Perro( "Sr.kawamura", "Husky", 4, "Gigante");
        lomito4.caracteristicas();

    }
}
