package com.heranca.q3;

public class Velho extends Imovel{

    private double desconto;

    public double getValorDesconto() {
        return super.getPreco() - desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
