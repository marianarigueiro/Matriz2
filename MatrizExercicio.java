/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizexercicio;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class MatrizExercicio {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        HashSet<Integer> elementos = new HashSet<>();
        boolean possuiRepetidos = false;
        int pares = 0;
        int impares = 0;
        
        System.out.println("Digite os elementos da matriz 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Verifica se o número é repetido
                if (elementos.contains(matriz[i][j])) {
                    possuiRepetidos = true;
                } else {
                    elementos.add(matriz[i][j]);
                }

                // Conta pares e ímpares
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        // a) Verifica se há elementos repetidos
        if (possuiRepetidos) {
            System.out.println("A matriz possui elementos repetidos.");
        } else {
            System.out.println("A matriz não possui elementos repetidos.");
        }

        // b) Quantidade de números pares
        System.out.println("Quantidade de números pares: " + pares);

        // c) Quantidade de números ímpares
        System.out.println("Quantidade de números ímpares: " + impares);
        
    }
}
