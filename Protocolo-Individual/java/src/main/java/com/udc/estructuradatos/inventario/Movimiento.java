package com.udc.estructuradatos.inventario;

public class Movimiento {

    private String tipo;
    private int cantidad;

    public Movimiento(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Tipo: " + getTipo() +
               " | Cantidad: " + getCantidad();
    }
}
