package com.heranca.q6;

public class ContaBancaria {

    private String nome;
    private double saldo;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void creditar(double valor) {
        this.saldo += valor;
    }

    public void debitar(double valor) {
        this.saldo -= valor;
    }

    public String show() {
        return "Olá " + nome + ", seu saldo é: " + saldo + " reais";
    }

    public boolean verificarSaldoSuficiente(double valor) {
        if(valor > getSaldo()) {
            System.out.println("Saldo insuficiente!");
            return false;
        } else {
            debitar(valor);
            return true;
        }
    }
}
