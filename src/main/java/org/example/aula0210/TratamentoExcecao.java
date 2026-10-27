package org.example.aula0210;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecao {
    static void main() {
        Scanner sc = new Scanner(System.in);
        try {
            int res = 10 / 0;
            System.out.println(res);
        }catch (ArithmeticException ae) {
            System.out.println("Não da para dividir por 0");
        }finally {
            System.out.println("Isso sempre acontece");
        }
        System.out.println("O programa continua");

        try {
            System.out.println("Escreva um número: ");
            int n = sc.nextInt();
            System.out.println("O número digitado é: " + n);
        }catch (InputMismatchException ime){
            System.out.println("O valor digitado não foi um número, favor digite um número válido: ");
            sc.nextLine();
        }
    }
}
