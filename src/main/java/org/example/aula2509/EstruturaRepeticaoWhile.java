package org.example.aula2509;
import java.util.Scanner;

public class EstruturaRepeticaoWhile {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        while (senha != 1234){
            System.out.println("Digite sua senha: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso liberado!");
    }
}
