package com.heranca.q2;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("================= Ingresso =================");
        System.out.println();
        System.out.println("Digite (1) para o Ingresso Normal");
        System.out.println("Digite (2) para o Ingresso VIP");
        System.out.print("Informe qual tipo de ingresso deseja: ");
        int decisao = leitor.nextInt();

        System.out.println('\n');
        
        switch (decisao) {
            case 1:
                Normal ingressoNormal = new Normal();
                System.out.println(ingressoNormal.tipoIgresso());
                break;
            case 2:
                VIP ingressoVIP = new VIP();
                ingressoVIP.setValor(300);
                System.out.println(ingressoVIP.tipoIgresso());
                
                System.out.println('\n');

                System.out.println("================= Camarote =================");
                System.out.println();
                System.out.println("Digite (1) para o Camarote Superior");
                System.out.println("Digite (2) para o Camarote Inferior");
                System.out.print("Informe qual tipo de Camarote deseja: ");
                int decisaoCamarote = leitor.nextInt();

                System.out.println('\n');

                if (decisaoCamarote == 1) {
                    CamaroteSuperior cs = new CamaroteSuperior();
                    System.out.println(cs.tipoIgresso());
                    cs.setValor(300);
                    System.out.printf("Valor: R$%.2f\n", cs.valorDoCamaroteSuperior());
                } else {
                    CamaroteInferior ci = new CamaroteInferior();
                    System.out.println(ci.tipoIgresso());
                    ci.setValor(300);
                    System.out.printf("Valor: R$%.2f\n", ci.valorDoCamaroteInferior());
                }
                break;
            default:
                System.err.println("Valor inválido");
                break;
        }

        leitor.close();
    }
}
