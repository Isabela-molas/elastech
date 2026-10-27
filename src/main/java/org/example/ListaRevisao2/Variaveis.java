package org.example.ListaRevisao2;

public class Variaveis {
    static void main() {
        String nome = "Joana";
        int idade = 40;
        double altura = 1.71;
        boolean jaProgramou = true;
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(jaProgramou);

        String cidade = "Salvador";
        System.out.println("Eu moro em " + cidade);

        String primeiroNome = "Maria";
        String sobrenome = "Eduarda";
        System.out.println(primeiroNome + " " + sobrenome );

        double preco = 29.90;
        System.out.println("O preço da carne está R$" + preco);

        boolean temCarteira = true;
        System.out.println(temCarteira);

        int a = 10, b = 20, aux = a;
        a = b;
        b = aux;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }
}

//Variáveis e tipos
//Crie variáveis com seu nome, sua idade, sua altura e se você já programou antes. Imprima cada uma.
//
//Crie uma variável cidade e imprima: "Eu moro em Salvador."
//
//Crie primeiroNome e sobrenome e imprima o nome completo numa linha só.
//
//Crie uma variável preco com 29.90 e imprima o valor dela numa frase.
//
//Crie uma variável temCarteira com true e imprima.

//Mini-desafio — Você tem a = 10 e b = 20. Faça a valer 20 e b valer 10, sem escrever os números 10 e 20 de novo.
//
//Se você fizer a = b, o valor antigo de a se perde. Você vai precisar de uma terceira variável pra guardar alguma coisa antes.