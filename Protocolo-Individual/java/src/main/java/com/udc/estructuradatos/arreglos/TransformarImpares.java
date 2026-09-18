package com.udc.estructuradatos.arreglos;

public class TransformarImpares {

    public static void main(String[] args) {

        int[] valores = {
            4, 7, 10, 13, 16,
            21, 24, 31, 40, 45
        };

        System.out.println("Arreglo original:");

        for (int valor : valores) {
            System.out.print(valor + " ");
        }

        for (int i = 0; i < valores.length; i++) {

            if (valores[i] % 2 != 0) {
                valores[i] = 0;
            }
        }

        System.out.println(
            "\n\nArreglo después de transformar los impares:"
        );

        for (int valor : valores) {
            System.out.print(valor + " ");
        }

        System.out.println();
    }
}
