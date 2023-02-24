package com.example.ejerciciotema5;

public class Ejercicio6_2 {


    public static void Ejercicio62metodo() {
        final int TAMAÑO = 4;
        int i, j, val;
        int[][] tab2d = new int[TAMAÑO][TAMAÑO];
        val = 1;
        for (j = 0; j < TAMAÑO; j++) {
            for (i = 0; i < TAMAÑO; i++) {
                tab2d[j][i] = val;
                val = val + 1;
            }
        }

        //Mostrar la tabla
        for (j = 0; j < TAMAÑO; j++) {
            for (i = 0; i < TAMAÑO; i++) {
                System.out.print(tab2d[j][i] + " ");
            }
            System.out.println();
        }
    }









}
