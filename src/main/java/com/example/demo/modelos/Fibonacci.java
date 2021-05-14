package com.example.demo.modelos;

public class Fibonacci {

    public  Integer obtenerValor(Integer valorIngresado){
        if(valorIngresado == 1 || valorIngresado == 2)
            return 1;
        return obtenerValor(valorIngresado - 1) + obtenerValor(valorIngresado-2);
    }
}
