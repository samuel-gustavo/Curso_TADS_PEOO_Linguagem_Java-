package com.heranca.q2;

public class VIP extends Ingresso{

    private double valorAdicional = 45;

    public double valorIngressoVIP() {
        return super.imprimirValor() + valorAdicional;
    }

    @Override
    public String tipoIgresso() {
        // TODO Auto-generated method stub
        return "Ingresso VIP";
    }
}
