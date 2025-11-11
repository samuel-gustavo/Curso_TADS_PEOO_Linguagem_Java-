package exercicos.Criando_Classes;

import java.time.LocalDate;

public class Multa {

    private int codigo;
    private String nomeFiscal;
    private String descricao;
    private double valor;
    private LocalDate data;
    
    public Multa(int codigo, String nomeFiscal, String descricao, double valor, LocalDate data) {
        this.codigo = codigo;
        this.nomeFiscal = nomeFiscal;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeFiscal() {
        return nomeFiscal;
    }

    public void setNomeFiscal(String nomeFiscal) {
        this.nomeFiscal = nomeFiscal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void show() {
        System.out.println("============ Detalhes da Multa ============");
        System.out.println("Código: " + getCodigo());
        System.out.println("Valor: " + getValor());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Data de Expedição: " + getData());
        System.out.println("===========================================");
    }

    public void delete() {
        setCodigo(0);
        setValor(0.0);
        setDescricao("");
        setData(null);
    }
}
