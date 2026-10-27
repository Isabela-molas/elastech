package org.example.PetShop;

public class Pet {
    String nome;
    String especie;
    double peso;
    String porte;

    String definirPorte() {
        if (peso < 10) {
            return porte = "Pequeno";
        } else if (peso < 25) {
            return porte = "Médio";
        } else {
            return porte = "Grande";
        }
    }
}