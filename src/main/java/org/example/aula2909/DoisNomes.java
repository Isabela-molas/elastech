package org.example.aula2909;

import java.util.Scanner;

public class DoisNomes {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String nomeMaisculo;
        String nomeMinusculo;

        System.out.println("Digite seu nome em minusculo: ");
        nomeMinusculo = sc.nextLine();
        System.out.println("Digite seu nome em maiusculo: ");
        nomeMaisculo = sc.nextLine();

        System.out.println(nomeMinusculo.equalsIgnoreCase(nomeMaisculo)); //verifica se os caracteres são iguais, ignorando maiusculas e minusculas

        System.out.println(nomeMinusculo.equalsIgnoreCase(nomeMaisculo)); //verifica se contém, ignorando maiusculas e minusculas


        String myStr = "Hello";
        System.out.println(myStr.contains("Hel"));   // true
        System.out.println(myStr.contains("e"));     // true
        System.out.println(myStr.contains("Hi"));
    }
}

//5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
//Digite seu nome: Ana
//Digite de novo: ANA
//Os nomes são iguais? true