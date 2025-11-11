package com.heranca.q1;

public class Animal {

    public String nome;
    public String raca;
    
    public Animal() {};

    public Animal(String nome) {
        this.nome = nome;
    }

    public String caminha() {
        return "Animal caminhando";
    }
}
