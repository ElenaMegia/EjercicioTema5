package com.example.ejerciciotema5;



import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.example.ejerciciotema5.Ejercicio1.Ejercicio1metodo;
import static com.example.ejerciciotema5.Ejercicio2.Ejercicio2metodo;
import static com.example.ejerciciotema5.Ejercicio3.Ejercicio3metodo;
import static com.example.ejerciciotema5.Ejercicio4.Ejercicio4metodo;
import static com.example.ejerciciotema5.Ejercicio5.Ejercicio5metodo;
import static com.example.ejerciciotema5.Ejercicio6.Ejercicio6metodo;
import static com.example.ejerciciotema5.Ejercicio6_2.Ejercicio62metodo;
import static com.example.ejerciciotema5.Ejercicio6_3.Ejercicio63metodo;
import static com.example.ejerciciotema5.Ejercicio7.Ejercicio7metodo;
import static com.example.ejerciciotema5.Ejercicio8.Ejercicio8metodo;
import static com.example.ejerciciotema5.Ejercicio9.Ejercicio9metodo;
import static com.example.ejerciciotema5.ejercicio10.Ejercicio10.Ejercicio10metodo;


public class Menu {
    static Scanner keyboard = new Scanner(System.in);


    public static void switchOptions() throws InputMismatchException {
        boolean repeat = false;
        do {
            try {

                repeat = false;

                System.out.println("\nMenu:\n"
                        + "1º Ejercicio 1, despegue inmediato .\n"
                        + "2º Ejercicio 2, Número de ocurrencias.\n"
                        + "3º Ejercicio 3, Nota media.\n"
                        + "4º Ejercicio 4, Máquina de votar.\n"
                        + "5º Ejercicio 5, Palíndromo.\n"
                        + "6º Ejercicio 6, ¿Qué hace?.\n"
                        + "7º Ejercicio 7, Matriz.\n"
                        + "8º Ejercicio 8, Micro guerra de barcos.\n"
                        + "9º Ejercicio 9, Tres en raya.\n"
                        + "10º Ejercicio 10, Registro de empleados.\n"
                        + "0º Salir\n"
                        + "Porfavor escriba la opción deseada: ");

                int choice = keyboard.nextInt();
                if (choice < 0 || choice > 10)
                    throw new OutofRangeException("Error. Tienes que introducir un número entre 0 y 10"); //Excepcion introducida para comprobar que los valores esten entre 0 y 5
                Menu(choice);
            } catch (OutofRangeException exc2) {
                System.out.println(exc2.getMessage());
                repeat = true;
            } catch (InputMismatchException exc3) {
                keyboard.nextLine();
                System.out.println("Error. Tienes que introducir un número."); //Excepcion introducida para comprobar que el valor introducido sea un numero, si no se volvera a pedir un valor
                repeat = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (repeat);
    }

    public static void Menu(int option) throws IOException { //Metodo donde se llaman a las funciones elegidas en el menu

        switch (option) {
            case 1:
                Ejercicio1metodo();
                switchOptions();
                break;
            case 2:
                Ejercicio2metodo();
                switchOptions();
                break;
            case 3:
                Ejercicio3metodo();
                switchOptions();
                break;
            case 4:
                Ejercicio4metodo();
                switchOptions();
                break;
            case 5:
                Ejercicio5metodo();
                switchOptions();
                break;
            case 6:
                    System.out.println("Ejercicio 6, porfavor elija la version que quiera ejecutar: \n"
                        + "1º Version 1.\n"
                        + "2º Version 2.\n"
                        + "3º Version 3.\n"
                        + "0º Salir\n"
                        + "Porfavor escriba la opción deseada: ");
                    int choice6 = keyboard.nextInt();
                        switch (choice6) {
                            case 1:
                                Ejercicio6metodo();
                                switchOptions();
                                break;
                            case 2:
                                Ejercicio62metodo();
                                switchOptions();
                                break;
                            case 3:
                                Ejercicio63metodo();
                                switchOptions();
                                break;
                            default:
                                System.out.println("Error. Tienes que introducir un número entre 0 y 3");
                                switchOptions();
                                break;
                        }
                 break;
            case 7:
                Ejercicio7metodo();
                switchOptions();
                break;
            case 8:
                Ejercicio8metodo();
                switchOptions();
                break;
            case 9:
                Ejercicio9metodo();
                switchOptions();
                break;
            case 10:
                Ejercicio10metodo();
                switchOptions();
                break;
            case 0:
                exit(); //Salida del programa
                break;
        }
    }


    public static void exit () { //Metodo para salir del programa
        System.out.println("Gracias por usar nuestro programa. ¡Hasta pronto!");
    }
}

