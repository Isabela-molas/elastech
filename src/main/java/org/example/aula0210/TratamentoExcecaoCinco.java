package org.example.aula0210;
import java.util.Scanner;

public class TratamentoExcecaoCinco {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");

        try {
            int n = sc.nextInt();
            System.out.println("O resto da divisão de 100 por " + n + " é igual a " + (100%n));
        }catch (ArithmeticException ae){
            System.out.println("Não é possivel dividir por 0");
        }finally {
            sc.close();
        }
    }
}





//5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número. Trate a ArithmeticException para o caso de ela digitar 0