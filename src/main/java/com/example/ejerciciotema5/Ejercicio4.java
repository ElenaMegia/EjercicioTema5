package com.example.ejerciciotema5;

import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    static Scanner sc = new Scanner(System.in);
    //Crear un algoritmo que cuente los valores introducidos por consola del 1 al 4
    public static void Ejercicio4metodo() {
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

        //calcular el porcentaje de numeros 2 introducidos
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        int suma4 = 0;
        for (int i = 0; i < tabla.size(); i++) {
            if(tabla.get(i) == 1) {
                suma1++;
            }else if(tabla.get(i) == 2) {
                suma2++;
            } else if (tabla.get(i) == 3) {
                suma3++;
            } else if (tabla.get(i) == 4) {
                suma4++;
            }
            }

        DecimalFormat df = new DecimalFormat("#.##");

        double porcentaje1 = (double) suma1 / (tabla.size()+1) * 100;
        System.out.println("El porcentaje de votos de Emilia Terreros es: " +df.format(porcentaje1)+ "%");
        double porcentaje2 = (double) suma2 / (tabla.size()+1) * 100;
        System.out.println("El porcentaje de votos de Gerardo Escodar es: " + df.format(porcentaje2) + "%");
        double porcentaje3 = (double) suma3 / (tabla.size()+1) * 100;
        System.out.println("El porcentaje de votos de María Aguaviva es: " + df.format(porcentaje3)+ "%");
        double porcentaje4 = (double) suma4 / (tabla.size()+1) * 100;
        System.out.println("El porcentaje de votos de Nadia Letux es: " + df.format(porcentaje4) + "%");


        }


    }



