package com.heranca.q5;

public class Main {

    public static void exibirVeiculo(Veiculo v) {
        System.out.printf("======================\n");
        v.mostrarInfo();
        System.out.println("======================\n");
    }

    public static void main(String[] args) {
        
        Carro carro =  new Carro("Volkswagen", 2019, 4);
        exibirVeiculo(carro);

        Moto moto = new Moto("Honda", 2001, 125);
        exibirVeiculo(moto);
    }
}
