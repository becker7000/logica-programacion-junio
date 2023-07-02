package com.mycompany.primeros.pasos;

import java.util.Scanner;

public class Cadenas2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre;

        System.out.print("\n\t Escribe tu nombre: ");
        nombre = entrada.nextLine();

        System.out.print("\n\t Hola, que tal " + nombre);

        entrada.close();

    }

}
