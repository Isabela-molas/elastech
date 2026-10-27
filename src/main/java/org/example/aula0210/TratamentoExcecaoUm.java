package org.example.aula0210;
import java.util.Scanner;

public class TratamentoExcecaoUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número: ");
            int n1 = sc.nextInt();

            System.out.println("Digite o segundo número: ");
            int n2 = sc.nextInt();

            double res = n1 / n2;
            System.out.printf("A divisão do primeiro pelo segundo é: %.2f", res);

        } catch (ArithmeticException e) {
            System.out.println("Não se divide por zero.");
        }finally {
            sc.close();
        }
    }
}

//1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.
