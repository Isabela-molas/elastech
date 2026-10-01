package org.example.aula3009;

import java.util.Scanner;

public class Metodos {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //dentro do main chamo o metodo
        MetodosExemplo.saudacao();
        System.out.println(MetodosExemplo.soma(5,5));
        //System.out.println(somar());


    }
    //void > nao esta esperando nada do codigo
    //static > aquela coisa pertence a classe e nao a um objeto especifico
    static void saudar(){
        System.out.println("Olá");
    }

    static int somar(){
        int a = 5, b= 5;
        return a + b;
    }
}
