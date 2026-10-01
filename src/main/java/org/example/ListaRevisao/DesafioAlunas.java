package org.example.ListaRevisao;
import java.util.Scanner;

public class DesafioAlunas {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite a primeira nota: ");
                    double n1 = sc.nextDouble();
                    System.out.println("Digite a segunda nota: ");
                    double n2 = sc.nextDouble();
                    double media = ((n1 + n2) / 2);
                    System.out.println("Digite seu nome: ");
                    String nome = sc.nextLine();
                    if (media >= 6) {
                        System.out.printf("Situação:\nNome: " + nome + "Nota 1: %.2f\n", n1 + "Nota 2: %.2f\n", n2 + "Média: %.2f\n", media + "Aprovada");
                    }else{
                        break;
                        }
                case 2:
                    System.out.println("Saindo do programa...\n");
                    break;
                default:
                    System.out.println("Opção inválida\n");
                    break;
            }
        }while (op != 2);
    }
}

/*Você vai construir um programa que cadastra alunas, calcula a média delas e diz se foram aprovadas. O programa fica rodando até a pessoa escolher sair.

System.out.println("Digite seu ano de nascimento: ");
        anoNascimento = sc.nextInt();

O que o programa faz
Pergunta se a pessoa quer iniciar: 1 para continuar, 2 para sair
Se escolher 1:
pede a primeira nota
pede a segunda nota
calcula a média
pede o nome da aluna
decide se ela foi aprovada (média 6 ou mais)
mostra uma frase com o nome, as duas notas, a média e se foi aprovada
volta pro menu
Se escolher 2: mostra uma mensagem de despedida e encerra
Se digitar qualquer outra coisa: avisa que a opção é inválida e volta pro menu*/