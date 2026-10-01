package org.example.aula2209;

public class OperadoresAritmeticos {
    public static void main() {
        System.out.println("\n--- Aritméticos ---\n");
        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));
        /* Por que deram resultados diferentes?
        Porque no primeiro println eram duas Strings (texto) e o + apenas concatenou os dois números da frente
        Já no segundo println, eram duas Strings para representar a soma
        e na frente era uma operação entre parênteses com números inteiros, resultando em sua soma.*/

        //1
        int a = 10;
        int b = 3;
        System.out.println("\nSoma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));

        //2
        double c = 20.5;
        double d = 15.5;
        System.out.println("\nSoma: " + (c + d));
        System.out.println("Subtração: " + (c - d));
        System.out.println("Multiplicação: " + (c * d));
        System.out.println("Divisão: " + (c / d));
        System.out.println("Resto: " + (c % d));

        //3
        double nota1 = 8.5;
        double nota2 = 6.5;
        double nota3 = 10;

        System.out.println("\nA soma das notas é igual a: " + (nota1 + nota2 + nota3));
        System.out.println("A média das notas é igual a: " + ((nota1 + nota2 + nota3) / 3));

        //4
        int e = 3;
        int f = 4;
        int g = 5;

        System.out.println("\nResultado da opreção de e + f * g = " + (e + f * g));

        //5
        System.out.println("Resultado da opreção de (e + f) * g = " + ((e + f) * g));

        //Desafio:
        int seg = 3785;
        System.out.println("\nDesafio:\nMinutos inteiros: " + (seg/60));
        System.out.println("Segundos sobram: " + (seg%60));
    }
    }