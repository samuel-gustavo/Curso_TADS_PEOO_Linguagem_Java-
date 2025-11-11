package com.heranca.q5;

public class Moto extends Veiculo{

    private int cilindradas;

    public Moto(String marca, int ano, int cilindradas) {
        super(marca, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void mostrarInfo() {
        // TODO Auto-generated method stub
        super.mostrarInfo();
        System.out.println("Quantidade de Cilindradas: " + cilindradas);
    }
}
