package org.example.aula2909;
import java.util.Scanner;

public class StringQuatro {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        if (frase.toLowerCase().contains(palavra.toLowerCase())) {
            System.out.println("A palavra " + palavra + " aparece dentro da frase.");
        } else {
            System.out.println("A palavra " + palavra + " não aparece dentro da frase.");
        }
        sc.close();
    }
}

//4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.
