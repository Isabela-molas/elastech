package org.example.aula2909;

import java.util.Scanner;

public class StringTres {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Primeira letra do nome: " + nome.charAt(0));

        sc.close();
    }
}

//3 — Peça o nome da pessoa e mostre a primeira letra dele.