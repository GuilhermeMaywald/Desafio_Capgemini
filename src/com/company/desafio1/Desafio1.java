package com.company.desafio1;


public class Desafio1 {

    public static void main(String[] args) {

        int n = 6;
        int espacos;

        String asteriscos = "*";

        String espaco = " ";

        for (int i = 1; i <= n; i++) {
            espacos = n - i;
            System.out.println(espaco.repeat(espacos) + asteriscos.repeat(i));
        }

    }
}