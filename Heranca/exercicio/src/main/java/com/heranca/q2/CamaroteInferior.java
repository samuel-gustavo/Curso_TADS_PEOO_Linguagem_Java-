package com.heranca.q2;

public class CamaroteInferior extends VIP{

    private String localizacao;

    public double valorDoCamaroteInferior() {
        return valorIngressoVIP();
    }
    
    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String tipoIgresso() {
        // TODO Auto-generated method stub
        return "VIP Camarote Inferior";
    }
}
