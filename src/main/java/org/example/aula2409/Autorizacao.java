package org.example.aula2409;

public class Autorizacao {
    static void main() {
        //4 — Crie variáveis idade (17) e temAutorizacao (true). Mostre se a pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização. Faça o mesmo para precisa ter 18 anos e ter autorização.

        int idade = 20;
        boolean temAutorizacao = false;

        if (idade >= 18 || temAutorizacao == true){
            System.out.println("Pode entrar na festa");
        } else {
            System.out.println("Precisa ter 18 anos e ter autorização");
        }

        if (idade >= 18 && temAutorizacao == true){
            System.out.println("Pode entrar na festa");
        } else {
            System.out.println("Precisa ter 18 anos e ter autorização");
        }
    }
}