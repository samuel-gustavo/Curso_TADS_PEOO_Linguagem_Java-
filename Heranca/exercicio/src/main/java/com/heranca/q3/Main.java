package com.heranca.q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite (1) para escolher um Imóvel Novo");
        System.out.println("Digite (2) para escolher um Imóvel Velho");
        System.out.print("Informe qual tipo de Imóvel deseja: ");
        int decisaoImovel = leitor.nextInt();

        if (decisaoImovel == 1) {
            Novo imovelNovo = new Novo();
            imovelNovo.setPreco(20000.00);
            System.out.println("Valor do Imóvel Novo: " + imovelNovo.getValorAdicional());
        } else {
            Velho imovelVelho = new Velho();
            imovelVelho.setPreco(20000.00);
            System.out.println("Valor do Imóvel Velho: " + imovelVelho.getValorDesconto());
        }

        leitor.close();
    }
}
