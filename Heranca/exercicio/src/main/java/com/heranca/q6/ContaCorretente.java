package com.heranca.q6;

public class ContaCorretente extends ContaBancaria{

    private double limiteCredito = 100.00;

    @Override
    public void debitar(double valor) {
        if((getSaldo() + limiteCredito) >= valor) {
            super.debitar(valor);
        } else {
            System.out.println("O valor de retirada supera o limite de Crédito!!!");
        }
    }

    @Override
    public boolean verificarSaldoSuficiente(double valor) {
        if((getSaldo() + limiteCredito) >= valor) {
            debitar(valor);
            return true;
        } else {
            return false;   
        }
    }

    @Override
    public String show() {
        return "Olá " + getNome() + ", seu saldo é: " + (getSaldo() + limiteCredito) +" reais já incluso os 100 reais de crédito";
    }
    
    public double mostrarSaldoTotal(){
        return getSaldo() + limiteCredito;
    }
}
