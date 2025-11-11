package com.heranca.q4;

public class Gerente extends Funcionario{

    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularBonus() {
        // TODO Auto-generated method stub
        return super.getSalario() * 0.2;
    }

    @Override
    public void mostrarInformacoes() {
        // TODO Auto-generated method stub
        System.out.println("=== Gerente ===");
        System.out.printf("""
                Nome Gerente: %s
                Departamento: %s
                Salário: R$%.2f
                """, getNome(), departamento, calcularBonus());
        System.out.println();
    }
}
