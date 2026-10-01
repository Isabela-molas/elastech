package org.example.aula2309;

public class OperadoresRelacionais {
    static void main() {
        /*1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de: são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
        - a = 10, b = 3
        - a = 3, b = 10
        - a = 5, b = 5 */
        //1
        int a = 10;
        int b = 3;
        System.out.println("Para quando: a = " + a + ", b = " + b);
        if (a == b) {
            System.out.println("São iguais");
        } else if (a > b) {
            System.out.println("A primeira é maior");
        } else {
            System.out.println("A primeira é menor");
        }

        //2
        a = 3;
        b = 10;
        System.out.println("Para quando: a = " + a + ", b = " + b);
        if (a == b) {
            System.out.println("São iguais");
        } else if (a > b) {
            System.out.println("A primeira é maior");
        } else {
            System.out.println("A primeira é menor");
        }

        a = 5;
        b = 5;
        System.out.println("Para quando: a = " + a + ", b = " + b);
        if (a == b) {
            System.out.println("São iguais");
        } else if (a > b) {
            System.out.println("A primeira é maior");
        } else {
            System.out.println("A primeira é menor");
        }

        a = 10;
        b = 3;
        System.out.println("Para quando: a = " + a + ", b = " + b);
        if (a == b) {
            System.out.println("São iguais");
        } else if (a != b && a > b) {
            System.out.println("São diferentes");
        } else if (a > b) {
            System.out.println("A primeira é maior");
        } else {
            System.out.println("A primeira é menor");
        }
    }
}

