package com.heranca.q2;

public class Ingresso {

    private double valor;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double imprimirValor() {
        return valor;
    }

    public String tipoIgresso() {
        return "Ingresso Normal";
    }
}
