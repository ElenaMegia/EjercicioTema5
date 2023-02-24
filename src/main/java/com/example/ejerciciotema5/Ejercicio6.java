package com.example.ejerciciotema5;

public class Ejercicio6 {

    public static void Ejercicio6metodo() {
        final int TAMAÑO = 3;
        int i, j, val;
        int[][] tab2d = new int[TAMAÑO][TAMAÑO];
        val = 1;
        for (j = 0; j < TAMAÑO; j++) {
            for (i = 0; i < TAMAÑO; i++) {
                tab2d[j][i] = val;
                val = val + 1;
            }
        }

        for (j = 0; j < TAMAÑO; j++) {
            for (i = 0; i < TAMAÑO; i++) {
                System.out.print(tab2d[j][i] + " ");
            }
            System.out.println();
        }
    }



 }
