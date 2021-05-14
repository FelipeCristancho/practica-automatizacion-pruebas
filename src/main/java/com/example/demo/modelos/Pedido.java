package com.example.demo.modelos;

public class Pedido {

    private String tipoCliente;
    private Integer cantidad;
    private String producto;

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void agregar(Integer cantidad, String producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int calcularCostoEnvio() {
        if (!this.tipoCliente.equals("VIP") || this.cantidad < 5)
            return 100;
        return 0;
    }
}
