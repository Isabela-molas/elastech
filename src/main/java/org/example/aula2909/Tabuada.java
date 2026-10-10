package org.example.aula2909;

public class Tabuada {
    static void main() {
        //4 -  Crie uma variável com um número e mostre a tabuada dele de 1 a 10.
        int n = 5;
        System.out.println("Múltiplos de " + n);
        for (int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}