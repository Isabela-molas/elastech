package org.example.aula3009;
import java.util.Scanner;

public class AtividadesMetodos {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println(mostrarBoasVindas());
        System.out.println(Utilidades.saudar("Julia"));
        System.out.println(Utilidades.saudar("Gabi"));
        System.out.println(Utilidades.saudar("Maria"));
        System.out.println(Utilidades.dobro(5));
        System.out.println("Escreva o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.println("Escreva o segundo número: ");
        double n2 = sc.nextDouble();
        System.out.printf("A média vai ser: %.2f", Utilidades.calcularMedia(n1, n2));
        System.out.println("\nDigite sua idade: ");
        int idadeInformada = sc.nextInt();
        if (Utilidades.ehMaiorDeIdade(idadeInformada)) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }
        System.out.println(Utilidades.somar(1,5));
        System.out.println(Utilidades.somar(10,10,10));
        System.out.println(Utilidades.somar(1,5.5));

        System.out.println(Utilidades.saudacao());
        System.out.println(Utilidades.saudacao("Luana"));
    }

    static String mostrarBoasVindas(){
        return "Bem-vinda ao curso de Java!";
    }
}
//1 — Na mesma classe do main, crie um método chamado
// mostrarBoasVindas() que imprime "Bem-vinda ao curso de Java!". Chame ele no main.