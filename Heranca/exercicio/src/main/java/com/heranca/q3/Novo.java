package com.heranca.q3;

public class Novo extends Imovel{

    private double valorAdicional = 10000.00;

    public double getValorAdicional() {
        return super.getPreco() + valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
