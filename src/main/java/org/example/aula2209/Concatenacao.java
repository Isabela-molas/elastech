package org.example.aula2209;

public class Concatenacao {
    public static void main() {
        System.out.println("\n --- Concatenação ---\n");
        //1
        String nome = "João";
        String cidade = "Campo Grande";
        int idade = 20;

        System.out.println("1- Meu nome é " + nome + ", moro em " + cidade + " e tenho " + idade + " anos.");

        //2
        String produto = "Pratos";
        double preco = 20.50;
        int qtd = 5;

        System.out.println("2- Comprei " + qtd + " unidades de " + produto + " por R$ " + preco + " cada. " + "Total: R$ " + preco * qtd);

        //3
        int n1 = 15;
        int n2 = 30;
        int soma = n1 + n2;

        System.out.println("3- A soma de " + n1 + " e " + n2 + " é igual a " + soma + ".");

    }
}