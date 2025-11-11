package com.heranca.q5;

public class Carro extends Veiculo{

    private int porta;

    public Carro(String marca, int ano, int porta) {
        super(marca, ano);
        this.porta = porta;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    @Override
    public void mostrarInfo() {
        // TODO Auto-generated method stub
        super.mostrarInfo();
        System.out.println("Quantidade de Portas: " + porta);
    }
}
