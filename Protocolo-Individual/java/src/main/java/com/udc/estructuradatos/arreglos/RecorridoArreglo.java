package com.udc.estructuradatos.arreglos;

public class RecorridoArreglo {

    public static void main(String[] args) {

        int[] valores = {10, 20, 30, 40, 50};

        System.out.println("Recorrido del arreglo:");

        for (int i = 0; i < valores.length; i++) {
            System.out.println(
                "Índice " + i + ": " + valores[i]
            );
        }
    }
}
