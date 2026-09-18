package com.udc.estructuradatos.inventario;

public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    private Movimiento[] movimientos;
    private int cantidadMovimientos;

    public Producto(
        String codigo,
        String nombre,
        double precio
    ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 0;

        this.movimientos = new Movimiento[20];
        this.cantidadMovimientos = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public boolean registrarEntrada(int cantidad) {

        if (cantidad <= 0) {
            return false;
        }

        if (cantidadMovimientos >= movimientos.length) {
            return false;
        }

        stock += cantidad;

        movimientos[cantidadMovimientos] =
            new Movimiento("ENTRADA", cantidad);

        cantidadMovimientos++;

        return true;
    }

    public boolean registrarSalida(int cantidad) {

        if (cantidad <= 0 || cantidad > stock) {
            return false;
        }

        if (cantidadMovimientos >= movimientos.length) {
            return false;
        }

        stock -= cantidad;

        movimientos[cantidadMovimientos] =
            new Movimiento("SALIDA", cantidad);

        cantidadMovimientos++;

        return true;
    }

    public void mostrarHistorial() {

        System.out.println(
            "Historial del producto: " + nombre
        );

        if (cantidadMovimientos == 0) {
            System.out.println(
                "No hay movimientos registrados."
            );
            return;
        }

        for (int i = 0; i < cantidadMovimientos; i++) {

            System.out.println(
                (i + 1) + ". " + movimientos[i]
            );
        }
    }

    public void mostrarInformacion() {

        System.out.println(
            "Código: " + codigo +
            " | Nombre: " + nombre +
            " | Precio: " + precio +
            " | Stock: " + stock
        );
    }
}
