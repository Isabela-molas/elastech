package org.example.aula2409;

public class Desafio {
    static void main() {
        //Desafio: Crie variáveis para três notas de uma aluna. Calcule a média e mostre: "Aprovada" se for 7 ou mais, "Recuperação" entre 5 e 6.9, e "Reprovada" abaixo de 5. Mostre também a média na tela. Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.

        double n1 = 5.3, n2 = 7.8, n3 = 4.5;
        double media = ((n1 + n2 + n3) / 3);

        if (media >= 7){
            System.out.printf("Aprovada! Sua média é: %.2f\n", media);

        }else if (media >= 5 && media <= 6.9){
            System.out.printf("Recuperaçao! Sua média é: %.2f\n", media);

        }else{
            System.out.printf("Reprovada! Sua média é: %.2f\n", media);
        }
    }
}