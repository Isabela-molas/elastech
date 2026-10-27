package org.example.aula0210;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecaoTres {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");

        try {
            int idade = sc.nextInt();
            System.out.println("Sua idade é de "+ idade + " anos");
        }catch (InputMismatchException ime){
            System.out.println("Digite apenas números.");
        }finally {
            sc.close();
        }
    }
}

//3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número