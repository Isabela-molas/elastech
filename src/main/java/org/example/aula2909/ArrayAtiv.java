package org.example.aula2909;
import org.example.ListaRevisao.Produto;

import java.util.Scanner;

public class ArrayAtiv {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.
        String[] nomes = {"Maria", "Eduarda", "Joana", "Felicia", "Flora"};
        System.out.println("Primeiro nome: " + nomes[1]);
        System.out.println("Terceiro nome: " + nomes[3]);
        System.out.println("Terceiro nome: " + nomes[4]);


        //2 — Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".
        int[] notas = {8,6,10,7,9};
        for(int i = 0; i <= notas.length; i++){
            System.out.println("Nota " + i + ": " + notas[i]);
        }

        //3 — Com o mesmo array de notas, calcule e mostre a soma e a média.
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = (double) soma / notas.length;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

    }
}