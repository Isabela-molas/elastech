package org.example.aula2909;
import java.util.Scanner;

public class AtividadeScanner {
    static void main() {
        //1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Oi " + nome + " você tem " + idade + " anos e vai fazer " + (idade + 1) + " no próximo aniversário.\"");
    }
}
