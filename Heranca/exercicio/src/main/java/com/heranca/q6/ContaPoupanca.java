package com.heranca.q6;

public class ContaPoupanca extends ContaBancaria{
    
    private double saldoPoupanca = 0;

    public void setSaldoPoupanca(double saldoPoupanca){
        this.saldoPoupanca = saldoPoupanca;
    }
    public double getSaldoPoupanca(){
        return saldoPoupanca;
    }

    public boolean verificarSaldoPoupancaSuficiente(double valor) {
        if(valor > getSaldo()) {
            System.out.println("Saldo insuficiente!");
            return false;
        } else {
            return true; 
        }
    }

}
