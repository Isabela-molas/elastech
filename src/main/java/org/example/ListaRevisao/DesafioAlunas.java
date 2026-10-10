package org.example.ListaRevisao;
import java.util.Scanner;

public class DesafioAlunas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while (op != 2) {
            System.out.println("Deseja iniciar?");
            System.out.println("Pressione 1 para continuar");
            System.out.println("Pressione 2 para sair");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    Aluna aluna = new Aluna();
                    System.out.println("Nota 1:");
                    aluna.nota = sc.nextDouble();

                    System.out.println("Nota 2:");
                    aluna.nota2 = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Nome da Aluna:");
                    aluna.nome = sc.nextLine();

                    aluna.media = (aluna.nota + aluna.nota2) / 2;

                    if (aluna.media >= 6) {
                        aluna.passou = true;
                    } else {
                        aluna.passou = false;
                    }

                    System.out.printf("O nome da aluna é %s, sua primeira nota foi %.1f, " +
                                    "sua segunda nota foi %.1f, e sua média final foi %.1f. " +
                                    "Aluna aprovada: %b%n",
                            aluna.nome,
                            aluna.nota,
                            aluna.nota2,
                            aluna.media,
                            aluna.passou
                    );
                    break;

                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}