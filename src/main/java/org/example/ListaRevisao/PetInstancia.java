package org.example.ListaRevisao;

public class PetInstancia {
    static void main() {
        Pet cachorro = new Pet();
        Pet gato = new Pet();

        cachorro.nome = "Rabito";
        cachorro.raca = "Golden";
        cachorro.peso = 5.0;
        gato.nome = "Mingau";
        gato.raca = "Siames";
        gato.peso = 3.75;

System.out.println("\nCachorro da raça " + cachorro.raca + " atende por nome " + cachorro.nome + " e pesa " + cachorro.peso + " kg \nGato da raça " + gato.raca +" atende por nome " + gato.nome +" e pesa " + gato.peso + " kg");

    }
}
