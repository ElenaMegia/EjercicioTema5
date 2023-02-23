package com.example.ejerciciotema5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> tabla = new ArrayList<>();
        int valor = 0;
        while (valor != -1) {
            System.out.println("Indicar un valor comprendido entre 0 y 9 o -1 para terminar:");
            valor = sc.nextInt();
            if (valor >= 0 && valor <= 9) {
                tabla.add(valor);
            } else if (valor != -1) {
                System.out.println("Otro valor, por favor o -1 para terminar...");
            }
        }
        for (int i = 0; i < tabla.size(); i++) {
            System.out.println("Cantidad de " + i + ": " + tabla.get(i));
        }
    }

}
