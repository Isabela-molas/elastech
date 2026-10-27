package org.example.aula2909;

import java.util.Scanner;

public class StringCinco {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome1 = sc.nextLine();

        System.out.println("Digite seu nome novamente: ");
        String nome2 = sc.nextLine();

        if (nome1.toLowerCase().contains(nome2.toLowerCase())) {
            System.out.println("Os dois nomes são iguais.");
        } else {
            System.out.println("Os dois nomes não são iguais.");
        }
        sc.close();
    }
}

//5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.