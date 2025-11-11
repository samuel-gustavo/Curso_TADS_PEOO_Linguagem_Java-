/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancocentral;

/**
 *
 * @author samuel
 */
public class Cliente {
    
    private int id;
    private String cpf;
    private String usuario;
    private String dataNascimento;
    private String email;
    private String telefone;
    private String senha;
    private String confirmacaoSenha;

    public Cliente(int id, String cpf, String usuario, String dataNascimento, String email, String telefone, String senha, String confirmacaoSenha) {
        this.id = id;
        this.cpf = cpf;
        this.usuario = usuario;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.confirmacaoSenha = confirmacaoSenha;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmacaoSenha() {
        return confirmacaoSenha;
    }

    public void setConfirmacaoSenha(String confirmacaoSenha) {
        this.confirmacaoSenha = confirmacaoSenha;
    }
}
