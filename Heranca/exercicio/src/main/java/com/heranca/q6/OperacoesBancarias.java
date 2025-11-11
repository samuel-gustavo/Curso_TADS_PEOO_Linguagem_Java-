package com.heranca.q6;

public class OperacoesBancarias {
    public void creditarContaCorrente(ContaCorretente contaCorretente, double valor) {
        contaCorretente.creditar(valor);
    }

    public void creditarContaPoupanca(ContaPoupanca contaPoupanca, double valor) {
        contaPoupanca.creditar(valor);
    }
    
    public void creditarEmPoupanca(ContaPoupanca contaPoupanca, double valor) {
        if(contaPoupanca.verificarSaldoPoupancaSuficiente(valor)) {
            contaPoupanca.creditar(valor);
        }
    }

    public void debitarContaCorrente(ContaCorretente contaCorretente, double valor) {
        contaCorretente.debitar(valor);
    }

    public void debitarContaPoupanca(ContaPoupanca contaPoupanca, double valor) {
        if(contaPoupanca.verificarSaldoPoupancaSuficiente(valor)) {
            contaPoupanca.debitar(valor);
        }
    }

    public void debitarDaPoupanca(ContaPoupanca contaPoupanca, double valor){
        if(contaPoupanca.verificarSaldoPoupancaSuficiente(valor)) {
            contaPoupanca.creditar(valor);
        }
    }
    public void transferenciaBancaria(ContaCorretente corrente1, ContaCorretente corrente2, double valor){
        if(corrente1.verificarSaldoSuficiente(valor)) {
            corrente2.creditar(valor);
        } else {
            System.out.println("Saldo insuficiente!!!");
        }
    }
}
