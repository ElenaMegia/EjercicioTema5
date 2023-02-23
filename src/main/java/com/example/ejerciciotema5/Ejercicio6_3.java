package com.example.ejerciciotema5;

public class Ejercicio6_3 {


    public static void main(String[] args) {
        final int TAMAÑO = 4;
        int i, j, val;
        int[][] tab2d = new int[TAMAÑO][TAMAÑO];
        val = 0;
        for (j = 0; j < TAMAÑO; j++) {
            for (i = 0; i < TAMAÑO; i++) {
                tab2d[j][i] = val;
                val = val + 1;
            }
            val = j+1;
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
