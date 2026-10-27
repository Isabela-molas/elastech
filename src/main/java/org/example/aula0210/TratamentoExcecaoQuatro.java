package org.example.aula0210;

public class TratamentoExcecaoQuatro {
    static void main(String[] args) {

        try {
            String nome = null;
            System.out.println(nome.length());
        }catch (NullPointerException npe){
            System.out.println("O nome não foi preenchido.");
        }
    }
}

//4 — Crie uma variável String nome = null; e tente imprimir nome.length(). Trate a NullPointerException e mostre "O nome não foi preenchido."