package com.udc.estructuradatos.arreglos;

public class MultiplicarPorIndice {

    public static void main(String[] args) {

        int[] valores = {2, 4, 6, 8, 10};

        System.out.println("Valores originales:");

        for (int valor : valores) {
            System.out.print(valor + " ");
        }

        for (int i = 0; i < valores.length; i++) {
            valores[i] = valores[i] * i;
        }

        System.out.println(
            "\n\nValores multiplicados por su índice:"
        );

        for (int i = 0; i < valores.length; i++) {
            System.out.println(
                "Índice " + i + ": " + valores[i]
            );
        }
    }
}
