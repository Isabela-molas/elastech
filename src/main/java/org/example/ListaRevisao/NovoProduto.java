package org.example.ListaRevisao;
import java.util.Scanner;

public class NovoProduto {
    static void main() {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            Produto novoProduto = new Produto();

            System.out.println("Digite o nome do produto: ");
            novoProduto.nome = sc.nextLine();
            System.out.println("Digite o valor do produto: ");
            novoProduto.preco = sc.nextDouble();
            sc.nextLine();
            if (novoProduto.preco > 100){
                System.out.printf("O produto tem o valor de %.2f - Produto caro!\n", novoProduto.preco);
            }else {
                System.out.printf("O valor é %.2f - Produto com preço acessível!\n", novoProduto.preco);
            }
        }
    }
}

/*5 - Crie uma classe chamada Produto com os atributos nome (String) e preco (double).
Na classe principal, faça um laço for que repita 3 vezes.
A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.
Instancie um novo Produto e guarde nele os valores digitados.
Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!". Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.*/