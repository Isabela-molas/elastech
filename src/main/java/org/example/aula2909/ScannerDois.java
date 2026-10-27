package org.example.aula2909;

import java.util.Scanner;

public class ScannerDois {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.
        System.out.println("\nDigite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("Soma dos números digitados: " + (n1+n2));
        System.out.println("Subtração dos números digitados: " + (n1-n2));
        System.out.println("Multiplicação dos números digitados: " + (n1*n2));
        System.out.println("Divisão dos números digitados: " + (n1/n2));
        System.out.println("Resto dos números digitados: " + (n1%n2));
    }
}
