package com.udc.estructuradatos.matrices;

public class OperacionesMatriz {

    public static void main(String[] args) {

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        System.out.println(
            "\nSuma de los elementos: " + suma
        );

        int[] temporal = matriz[0];

        matriz[0] = matriz[matriz.length - 1];

        matriz[matriz.length - 1] = temporal;

        System.out.println(
            "\nMatriz después de intercambiar " +
            "la primera y última fila:"
        );

        mostrarMatriz(matriz);
    }

    public static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
