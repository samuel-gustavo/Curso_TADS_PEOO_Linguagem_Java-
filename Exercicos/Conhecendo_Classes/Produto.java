/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.



    Faça um software para uma loja de venda de carros
    para tanto é necessário guardar as informações placa,
    modelo, tipo e valor do carro. É necessário mostrar
    todas as informações do carro através de um único método


 */
package exercicos.Conhecendo_Classes;

/**
 *
 * @author 1037100
 */
public class Produto {
    
    private int codigo;
    private double valor;
    private String descricao;
    private String validade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
    
    public void show() {     
        System.out.println("\n=========== Detalhes do Produto ===========");
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Validade: " + this.getValidade());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("=============================================");
    }

    public void deletar() {
        setCodigo(0);
        setValor(0.0);
        setDescricao("");
        setValidade("");
        System.out.println("\nTodos os dados do Produto foram limpos...");
    }
}
