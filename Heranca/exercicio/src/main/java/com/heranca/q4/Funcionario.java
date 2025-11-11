package com.heranca.q4;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario() {};

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularBonus() {
        return salario * 0.1;
    }

    public void mostrarInformacoes() {
        System.out.println("=== Funcionário ===");
        System.out.printf("""
            Nome: %s
            Salário: R$%.2f
                """, nome, calcularBonus());
        System.out.println();
    }
}
