package org.example.aula2409;

public class Saldo {
    static void main() {
        //2 — Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00). Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante. Se não for, mostre "Saldo insuficiente" e quanto está faltando.
        double saldo = 500.00;
        double valorCompra = 820.00;

        if (saldo >= valorCompra){
            System.out.println("Compra aprovada! Saldo restante: R$ " + (saldo - valorCompra));
        } else {
            System.out.println("Saldo insuficiente! " + "Está faltando: R$" + (valorCompra - saldo));
        }
    }
}