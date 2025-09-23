package com.heranca.q2;

public class CamaroteSuperior extends VIP{

    private double valorAdicional = 100.00;

    public double valorDoCamaroteSuperior() {
        return super.valorIngressoVIP() + valorAdicional;
    }

    @Override
    public String tipoIgresso() {
        // TODO Auto-generated method stub
        return "VIP Camarote Superior";
    }
}
