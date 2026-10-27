package org.example.ListaRevisao2;

public class Concatenacao {
    static void main() {
        String nome = "Maria";
        int idade = 12;
        System.out.println(nome + " tem " + idade + " anos.");

        double nota1 = 8.0, nota2 = 7.0, media = (nota1+nota2)/2;
        System.out.printf("A média é %.2f", media);

        double produto = 100.50;
        System.out.printf("\nO preço do produto é %.2f", produto);

        String nome2 = "Joana";
        int idade2 = 40;
        double altura = 1.31;
        System.out.printf("\nMeu nome é %s tenho %d anos e %.2f de altura.", nome2, idade, altura);

        double total = 0;
        String produto1 = "Café";
        double preco1 = 15.90;
        total += preco1;

        String produto2 = "Arroz";
        double preco2 = 55.29;
        total += preco2;

        String produto3 = "Feijão";
        double preco3 = 5.99;
        total += preco3;

        System.out.println("\n========== RECIBO ==========");
        System.out.printf("%s: R$ %.2f%n", produto1, preco1);
        System.out.printf("%s: R$ %.2f%n", produto2, preco2);
        System.out.printf("%s: R$ %.2f%n", produto3, preco3);
        System.out.println("----------------------------");
        System.out.printf("Total: R$ %.2f%n", total);
        System.out.println("============================");
    }
}







//Concatenação e printf
//Com seu nome e sua idade em variáveis, imprima: "Ana tem 28 anos."
//
//Crie nota1 = 8.0 e nota2 = 7.0. Calcule a média e imprima com duas casas decimais.
//
//Crie uma variável com o preço de um produto e imprima com duas casas decimais.
//
//Usando printf, imprima numa linha só o nome, a idade e a altura.
//
//Mini-desafio — Crie variáveis para três produtos (nome e preço) e imprima um recibo. Cada linha deve ter o nome e o preço, e a última linha mostra o total, tudo com duas casas decimais.
//
//Crie uma variável total começando em zero, antes dos produtos, e vá somando cada preço nela.