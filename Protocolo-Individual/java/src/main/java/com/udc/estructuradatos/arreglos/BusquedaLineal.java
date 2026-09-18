package com.udc.estructuradatos.arreglos;

import java.util.Scanner;

public class BusquedaLineal {

    public static void main(String[] args) {

        int[] valores = {
            12, 25, 7, 30, 18,
            42, 9, 15, 33, 21
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor que desea buscar: ");
        int buscado = scanner.nextInt();

        int posicion = -1;

        for (int i = 0; i < valores.length; i++) {

            if (valores[i] == buscado) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {

            System.out.println(
                "El valor " + buscado +
                " se encuentra en el índice " + posicion
            );

        } else {

            System.out.println(
                "El valor " + buscado +
                " no se encuentra en el arreglo."
            );
        }

        scanner.close();
    }
}
