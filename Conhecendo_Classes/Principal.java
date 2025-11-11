/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicos.Conhecendo_Classes;

import java.util.Scanner;

/**
 *
 * @author 1037100
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.print("Informe o Código do Produto: ");
        produto.setCodigo(teclado.nextInt());

        System.out.print("Informe o Valor do Produto: ");
        produto.setValor(teclado.nextDouble());

        System.out.print("Informe a Validade do Produto: ");
        produto.setValidade(teclado.next());

        teclado.nextLine();

        System.out.println("Informe a Descrição do Produto: ");
        produto.setDescricao(teclado.nextLine());
        
        produto.show();
        produto.deletar();
        produto.show();

        teclado.close();
    }
    
}
