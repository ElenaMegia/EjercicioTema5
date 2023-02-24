package com.example.ejerciciotema5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

    //Crear un algoritmo que guarde loas valores introducidos por el usuario en una tabla y calcule la media de los valores
    static Scanner sc = new Scanner(System.in);

    public static void Ejercicio3metodo() {
       List<Integer> tabla = new ArrayList<>();
        int valor = 0;
        while (valor != -1) {
            System.out.println("¿Nota?");
            valor = sc.nextInt();
            if (valor >= 0 && valor <= 10) {
                tabla.add(valor);
            } else if (valor != -1) {
                System.out.println("Otro valor, por favor o -1 para terminar...");
            }
        }
        //calcular la media de todos los valores de la tabla
        int suma = 0;
        for (int i = 0; i < tabla.size(); i++) {
            suma += tabla.get(i);
        }
        System.out.println("La media es: " + suma / tabla.size());
    }









}
