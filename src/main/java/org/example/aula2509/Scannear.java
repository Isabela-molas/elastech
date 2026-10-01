package org.example.aula2509;

import java.util.Scanner;

public class Scannear {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Escreva seu nome: ");
        nome = sc.nextLine();
        System.out.println("Seu nome é: " + nome);

        System.out.println("Escreva sua idade: ");
        idade = sc.nextInt();
        System.out.println("Sua idade é: " + idade);

   }
}