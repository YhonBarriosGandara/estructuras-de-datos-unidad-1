package com.udc.estructuradatos.arreglos;

import java.util.Random;

public class ArregloValoresAleatorios {

    public static void main(String[] args) {

        int[] valores = new int[10];
        Random random = new Random();

        for (int i = 0; i < valores.length; i++) {
            valores[i] = random.nextInt(100);
        }

        System.out.println("Valores del arreglo:");

        for (int valor : valores) {
            System.out.println(valor);
        }
    }
}
