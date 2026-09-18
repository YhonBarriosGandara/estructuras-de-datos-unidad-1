package com.udc.estructuradatos.inventario;

import java.util.Scanner;

public class Inventario {

    private static final int MAX_PRODUCTOS = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Producto[] productos =
            new Producto[MAX_PRODUCTOS];

        int cantidadProductos = 0;

        int opcion;

        do {

            mostrarMenu();

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    cantidadProductos =
                        registrarProducto(
                            productos,
                            cantidadProductos,
                            scanner
                        );
                    break;

                case 2:
                    buscarProducto(productos, scanner);
                    break;

                case 3:
                    registrarEntrada(productos, scanner);
                    break;

                case 4:
                    registrarSalida(productos, scanner);
                    break;

                case 5:
                    consultarStock(productos, scanner);
                    break;

                case 6:
                    mostrarHistorial(productos, scanner);
                    break;

                case 7:
                    mostrarInventario(
                        productos,
                        cantidadProductos
                    );
                    break;

                case 0:
                    System.out.println(
                        "Programa finalizado."
                    );
                    break;

                default:
                    System.out.println(
                        "Opción no válida."
                    );
            }

            System.out.println();

        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {

        System.out.println("===== SISTEMA DE INVENTARIO =====");
        System.out.println("1. Registrar producto");
        System.out.println("2. Buscar producto");
        System.out.println("3. Registrar entrada");
        System.out.println("4. Registrar salida");
        System.out.println("5. Consultar stock");
        System.out.println("6. Mostrar historial");
        System.out.println("7. Mostrar inventario completo");
        System.out.println("0. Salir");
    }

    private static int registrarProducto(
        Producto[] productos,
        int cantidadProductos,
        Scanner scanner
    ) {

        if (cantidadProductos >= productos.length) {

            System.out.println(
                "No hay espacio para más productos."
            );

            return cantidadProductos;
        }

        System.out.print("Código: ");
        String codigo = scanner.nextLine();

        if (buscarPorCodigo(productos, codigo) != -1) {

            System.out.println(
                "Ya existe un producto con ese código."
            );

            return cantidadProductos;
        }

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        productos[cantidadProductos] =
            new Producto(codigo, nombre, precio);

        cantidadProductos++;

        System.out.println(
            "Producto registrado correctamente."
        );

        return cantidadProductos;
    }

    private static void buscarProducto(
        Producto[] productos,
        Scanner scanner
    ) {

        System.out.print("Ingrese el código: ");
        String codigo = scanner.nextLine();

        int posicion =
            buscarPorCodigo(productos, codigo);

        if (posicion == -1) {

            System.out.println(
                "Producto no encontrado."
            );

        } else {

            productos[posicion].mostrarInformacion();
        }
    }

    private static void registrarEntrada(
        Producto[] productos,
        Scanner scanner
    ) {

        System.out.print("Código del producto: ");
        String codigo = scanner.nextLine();

        int posicion =
            buscarPorCodigo(productos, codigo);

        if (posicion == -1) {

            System.out.println(
                "Producto no encontrado."
            );

            return;
        }

        System.out.print("Cantidad de entrada: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        if (
            productos[posicion]
                .registrarEntrada(cantidad)
        ) {

            System.out.println(
                "Entrada registrada correctamente."
            );

        } else {

            System.out.println(
                "No fue posible registrar la entrada."
            );
        }
    }

    private static void registrarSalida(
        Producto[] productos,
        Scanner scanner
    ) {

        System.out.print("Código del producto: ");
        String codigo = scanner.nextLine();

        int posicion =
            buscarPorCodigo(productos, codigo);

        if (posicion == -1) {

            System.out.println(
                "Producto no encontrado."
            );

        } else {

            System.out.println(
                "No fue posible registrar la salida."
            );
        }
    }

    private static void consultarStock(
        Producto[] productos,
        Scanner scanner
    ) {

        System.out.print("Código del producto: ");
        String codigo = scanner.nextLine();

        int posicion =
            buscarPorCodigo(productos, codigo);

        if (posicion == -1) {

            System.out.println(
                "Producto no encontrado."
            );

        } else {

            System.out.println(
                "Stock disponible: " +
                productos[posicion].getStock()
            );
        }
    }

    private static void mostrarHistorial(
        Producto[] productos,
        Scanner scanner
    ) {

        System.out.print("Código del producto: ");
        String codigo = scanner.nextLine();

        int posicion =
            buscarPorCodigo(productos, codigo);

        if (posicion == -1) {

            System.out.println(
                "Producto no encontrado."
            );

        } else {

            productos[posicion].mostrarHistorial();
        }
    }

    private static void mostrarInventario(
        Producto[] productos,
        int cantidadProductos
    ) {

        System.out.println(
            "===== INVENTARIO COMPLETO ====="
        );

        if (cantidadProductos == 0) {

            System.out.println(
                "No hay productos registrados."
            );

            return;
        }

        for (int i = 0; i < cantidadProductos; i++) {

            productos[i].mostrarInformacion();
        }
    }

    private static int buscarPorCodigo(
        Producto[] productos,
        String codigo
    ) {

        for (int i = 0; i < productos.length; i++) {

            if (
                productos[i] != null &&
                productos[i].getCodigo().equals(codigo)
            ) {

                return i;
            }
        }

        return -1;
    }
}
