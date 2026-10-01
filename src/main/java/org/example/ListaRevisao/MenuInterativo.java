package org.example.ListaRevisao;
import java.util.Scanner;

public class MenuInterativo {
    static void main() {
        //3 - Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
        //1 - Ver camisas
        //2 - Ver calças
        //3 - Sair. Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.
        Scanner sc = new Scanner(System.in);
        int op = 0;

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Ver camisa");
            System.out.println("2 - Ver calça");
            System.out.println("3 - Sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Você escolheu a opção - Ver camisas -\n");
                    break;
                case 2:
                    System.out.println("Você escolheu a opção - Ver calças -\n");
                    break;
                case 3:
                    System.out.println("Saindo do menu...\n");
                break;
                default:
                    System.out.println("Opção inválida\n");
            }
        } while (op != 3);{

        }
    }
}