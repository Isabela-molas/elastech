package org.example.aula2909;

import java.util.Scanner;

public class StringDois {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Nome em maiúsculo: " + nome.toUpperCase());
        System.out.println("Nome em minúsculo: " + nome.toLowerCase());

        sc.close();
    }
}

//2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.