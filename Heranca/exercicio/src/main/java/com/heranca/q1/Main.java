package com.heranca.q1;

public class Main {

    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro();
        System.out.println(cachorro.late());

        Gato gato = new Gato();
        System.out.println(gato.mia());

        System.out.println(cachorro.caminha());
        System.out.println(gato.caminha());
    }
}
