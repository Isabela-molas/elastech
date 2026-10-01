package org.example.ListaRevisao;
import java.util.Scanner;

public class Lanche {
    static void main() {
        //1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
        //Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
        Scanner sc = new Scanner(System.in);

        String lanche; double valor; double desconto = 5.00;

        System.out.println("Digite o nome do lanche desejado: ");
        lanche = sc.nextLine();
        System.out.println("Digite o valor do lanche: ");
        valor = sc.nextDouble();

        if (valor >= 30.00) {
            double total = (valor - desconto);
            System.out.printf("O lanche " + lanche + " com desconto custa R$  %.2f\n", total);
        }
        else{
            System.out.printf("O lanche " + lanche + " sem desconto custa R$  %.2f\n", valor);
        }
    }
}