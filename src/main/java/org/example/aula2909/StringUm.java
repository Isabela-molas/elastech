package org.example.aula2909;
import java.util.Scanner;

public class StringUm {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();

        sc.close();
    }
}

//Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços)