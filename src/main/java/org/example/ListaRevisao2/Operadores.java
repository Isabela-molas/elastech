package org.example.ListaRevisao2;

public class Operadores {
    static void main() {
        int a = 15, b = 4;
        System.out.println("Soma: " + (a+b));
        System.out.println("Subtração: " + (a-b));
        System.out.println("Multiplicação: " + (a*b));
        System.out.println("Divisão: " + (a/b));
        System.out.println("Resto: " + (a%b));

        double saldo = 1000;
        saldo += 250;
        saldo -= 380;
        System.out.println("Saldo final: R$" + saldo);

        int x = 10, y = 10;
        System.out.println("Resultado de x == y: " + (x == y));
        System.out.println("Resultado de x != y: " + (x != y));
        System.out.println("Resultado de x > y: " + (x > y));
        System.out.println("Resultado de x >= y: " + (x >= y));


        int idade = 20; boolean temCarteira = true;
        System.out.println(idade >= 18 && temCarteira);

        int n = 10;
        System.out.println("Resto da divisão dele por 2: " + (n%2));

        double arroz = 5.50;
        double compra = (3*arroz);
        System.out.println("A compra de 3 arroz ficou em R$" + compra);

        int num = 15;
        System.out.println((num % 3 == 0) && (num % 5 == 0));

    }
}


//Crie a = 15 e b = 4. Imprima a soma, a subtração, a multiplicação, a divisão e o resto.
//
//Crie saldo = 1000. Use += para somar 250 e -= para tirar 380. Imprima o saldo final.
//
//Crie a = 10 e b = 10. Imprima o resultado de a == b, a != b, a > b e a >= b.
//
//Crie idade = 20 e temCarteira = true. Imprima o resultado de idade >= 18 && temCarteira.
//
//Crie um número e imprima o resto da divisão dele por 2.
//
//Calcule e imprima o total de uma compra: 3 pacotes de arroz a R$ 5.50 cada.
//
//Mini-desafio — Crie uma variável com um número qualquer e, sem usar if, imprima true ou false para a pergunta: esse número é divisível por 3 e por 5 ao mesmo tempo?
//
//Uma comparação já produz true ou false sozinha — não precisa de if pra isso. E um número é divisível por outro quando o resto da divisão é zero.