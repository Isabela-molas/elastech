package org.example.ListaRevisao;
import  java.util.Scanner;

public class CadastroUsuario {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int anoNascimento; String nome;

        System.out.println("Digite seu ano de nascimento: ");
        anoNascimento = sc.nextInt();
        System.out.println("Digite seu nome completo: ");
        nome = sc.nextLine(); nome = sc.nextLine();
        System.out.println("O usuário " + nome + " nasceu em " + anoNascimento + ".");
    }
}
/*
6 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:
Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).
Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).
Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."*/