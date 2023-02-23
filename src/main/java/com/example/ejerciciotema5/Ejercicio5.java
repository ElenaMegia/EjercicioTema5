package com.example.ejerciciotema5;

import java.util.Scanner;

public class Ejercicio5 {
    //Escriba un algoritmo que pida al usuario una palabra sin acento, en minúsculas y seguida de un carácter en particular para indicar el final (# por ejemplo), y que le diga al usuario si esta palabra es un palíndromo.
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduzca una palabra y despues #:");
        String palabra = sc.nextLine();
        if(palabra.charAt(palabra.length()-1) != '#'){
            System.out.println("La palabra no termina en #");

        }else {
            boolean esPalindromo = true;
            //crear una variable String que contenga la palabra sin el último carácter
            palabra = palabra.substring(0, palabra.length() - 1);
            for (int i = 0; i < palabra.length()-1 / 2; i++) {
                if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                    esPalindromo = false;
                    break;
                }else if(palabra.length()-1==0){
                    esPalindromo = false;
                    System.out.println("La palabra no tiene más de un carácter");
                    break;
                }
            }
            if (esPalindromo) {
                System.out.println("Es palíndromo");
            } else {
                System.out.println("No es palíndromo");
            }
        }
    }
}
