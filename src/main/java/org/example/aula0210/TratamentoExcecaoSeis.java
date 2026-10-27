package org.example.aula0210;

public class TratamentoExcecaoSeis {
    static void main(String[] args) {
        String[] nomes = {"Maria", "Agata", "Magali"};

        try {
            System.out.println("O nome na posição " + 5 + " é: " + nomes[5]);
        }catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Essa posição não existe.");
        }finally {
            System.out.println("O programa continua funcionando.");
        }
    }
}

//6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."