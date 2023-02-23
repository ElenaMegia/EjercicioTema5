package com.example.ejerciciotema5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    static Scanner sc = new Scanner(System.in);
    //Crear un algoritmo que cuente los valores introducidos por consola del 1 al 4
    public static void main(String[] args) {
        List<Integer> tabla = new ArrayList<>();
        System.out.println("Bienvenido a el programa de votaciones");
        int numero = -1;
        do {
        System.out.println("Elija entre:\n" +
                "1 - Emilia TERREROS\n" +
                "2 - Gerardo ESCODAR\n" +
                "3 - María AGUAVIVA\n" +
                "4 - Nadia LETUX");
            numero = sc.nextInt();

            if (numero >= 1 && numero <= 4) {
                tabla.add(numero);
            } else if (numero != 68753421) {
                System.out.println("Porfavor, elija un numero entre 1 y 4");
            }
        }while(numero!=68753421);
    }


}
