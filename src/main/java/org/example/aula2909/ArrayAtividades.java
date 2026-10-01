package org.example.aula2909;

import java.util.Scanner;

public class ArrayAtividades {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.

        int[] n = new int[5];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Digite o " + i + "° número: ");
            n[i] = sc.nextInt();
        }
        System.out.println("\nValores guardados no array de trás para frente:");
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i]+",");
        }
    }
}
