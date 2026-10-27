package org.example.aula2909;

import java.util.Scanner;

public class ScannerTres {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.
        System.out.println("Digite sua nota: ");
        double nota = sc.nextDouble();

        if (nota >= 7){
            System.out.println(" Você está aprovada");
        } else if (nota >=5 && nota <= 6.9){
            System.out.println("Você está de recuperação");
        }else {
            System.out.println("Você está reprovada");
        }
        sc.close();
    }
}
