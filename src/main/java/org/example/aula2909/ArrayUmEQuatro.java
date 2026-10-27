package org.example.aula2909;

import java.util.Scanner;

public class ArrayUmEQuatro {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.
        String[] nomes = {"Maria", "Eduarda", "Joana", "Felicia", "Flora"};
        System.out.println("Primeiro nome: " + nomes[0]);
        System.out.println("Terceiro nome: " + nomes[2]);
        System.out.println("Último nome: " + nomes[4]);


        //4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.

        int[] n = new int[5];
        for (int i = 0; i < n.length; i++) {
            System.out.println("\nDigite o " + (i+1) + "° número: ");
            n[i] = sc.nextInt();
        }
        System.out.println("\nValores guardados no array de trás para frente:");
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + ",");
        }
    }
}