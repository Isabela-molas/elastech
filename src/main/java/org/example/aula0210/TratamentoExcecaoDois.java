package org.example.aula0210;
import java.util.Scanner;

public class TratamentoExcecaoDois {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] notas = {8, 6, 10, 7, 9};
        System.out.print("Digite a posição: ");

        try {
            int posicao = sc.nextInt();
            System.out.println("A nota na posição " + posicao + " é: " + notas[posicao]);

        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("O array só vai de 0 a 4.");
        }catch (Exception e){
            System.out.println("Entrada inválida.");
        }finally {
            sc.close();
        }
    }
}

//2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.