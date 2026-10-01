package org.example.aula2409;

public class Idade {
    static void main() {
    //1 — Crie uma variável idade e mostre a categoria de uma pessoa: menos de 13 anos é "Criança", de 13 a 17 é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".
    int idade = 100;

    if (idade < 13){
        System.out.println("É criança");

    } else if (idade <= 17) {
        System.out.println("É Adolescente");

    } else if (idade <= 59){
        System.out.println("É adulto");

    }else {
        System.out.println("É idoso");
    }
    }
}