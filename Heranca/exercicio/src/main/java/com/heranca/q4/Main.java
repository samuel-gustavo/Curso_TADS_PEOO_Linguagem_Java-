package com.heranca.q4;

public class Main {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("Samuel", 1800);
        funcionario.mostrarInformacoes();

        Gerente gerente = new Gerente("Flávio", 1800, "TADS");
        gerente.mostrarInformacoes();
    }
}
