package com.example.ejerciciotema5;

import com.example.ejerciciotema5.ejercicio10.Empleado;

import java.util.Scanner;

public class Ejercicio9 {
    static Scanner sc = new Scanner(System.in);

    //Crear un algoritmo para jugar a tres en raya: en una cuadrícula de tres celdas por tres, los jugadores se turnan para escribir su símbolo (X y O) en una celda vacía. El primer jugador que logre alinear (en fila, columna o diagonal) tres de sus símbolos, gana.
    private char[][] tablero;
    private char jugadorActual;
    private char ganadorjuego;

    public static void main(String[] args) {
        Ejercicio9 juego = new Ejercicio9();
        juego.jugar();
    }

    public Ejercicio9() {
        tablero = new char[3][3];
        jugadorActual = 'X';
        inicializarTablero();
    }

    public void jugar() {
        boolean ganador = false;
        int fila, columna;
        Scanner scanner = new Scanner(System.in);

        while (!ganador) {
            imprimirTablero();
            System.out.println("Turno del jugador " + jugadorActual);
            System.out.print("Introduzca la fila (1-3): ");
            fila = scanner.nextInt() - 1;
            System.out.print("Introduzca la columna (1-3): ");
            columna = scanner.nextInt() - 1;

            if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
                System.out.println("Posición inválida. Inténtelo de nuevo.");
            } else if (tablero[fila][columna] != '-') {
                System.out.println("Esa casilla ya está ocupada. Inténtelo de nuevo.");
            } else {
                tablero[fila][columna] = jugadorActual;
                ganador = hayGanador(fila, columna);
                ganadorjuego = jugadorActual;
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            }
        }

        imprimirTablero();
        System.out.println("¡El jugador " + ganadorjuego+ " ha ganado!");
    }

    private void inicializarTablero() {
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                tablero[fila][columna] = '-';
            }
        }
    }

    private void imprimirTablero() {
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
    }

    private boolean hayGanador(int fila, int columna) {
        boolean gandor=false;
        if (tablero[fila][0] == jugadorActual         // fila completa
                && tablero[fila][1] == jugadorActual
                && tablero[fila][2] == jugadorActual
                || tablero[0][columna] == jugadorActual    // columna completa
                && tablero[1][columna] == jugadorActual
                && tablero[2][columna] == jugadorActual
                || fila == columna                          // diagonal principal
                && tablero[0][0] == jugadorActual
                && tablero[1][1] == jugadorActual
                && tablero[2][2] == jugadorActual
                || fila + columna == 2                      // diagonal secundaria
                && tablero[0][2] == jugadorActual
                && tablero[1][1] == jugadorActual
                && tablero[2][0] == jugadorActual) {
            gandor = true;
        }
        return gandor;
    }

}


