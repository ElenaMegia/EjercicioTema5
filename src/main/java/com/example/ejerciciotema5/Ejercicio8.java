package com.example.ejerciciotema5;

import java.util.Scanner;

public class Ejercicio8 {

    static Scanner sc = new Scanner(System.in);

    public static void Ejercicio8metodo() {
        char[][] tabla = new char[4][4];
        int fila = (int) (Math.random() * 4);
        int columna = (int) (Math.random() * 4);
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = '?';
            }
        }
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
        int filaUsuario = 0;
        int columnaUsuario = 0;
        do {
            System.out.println("¿Qué columna?");
            columnaUsuario = sc.nextInt() - 1;
            System.out.println("¿Qué fila?");
            filaUsuario = sc.nextInt() - 1;
            if (filaUsuario == fila && columnaUsuario == columna) {
                System.out.println("Tocado y hundido");

            } else {
                tabla[filaUsuario][columnaUsuario] = '~';
                System.out.println("Agua");
            }
            for (int i = 0; i < tabla.length; i++) {
                for (int j = 0; j < tabla[i].length; j++) {
                    System.out.print(tabla[i][j] + " ");
                }
                System.out.println();
            }
        } while (filaUsuario != fila || columnaUsuario != columna);
        System.out.println("Ha ganado");
    }
}
