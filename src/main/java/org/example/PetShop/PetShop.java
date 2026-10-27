package org.example.PetShop; //> maior
import java.util.Scanner;    //< menor

public class PetShop {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Pet animalPet = new Pet();

        System.out.print("Nome do pet: ");
        animalPet.nome = sc.nextLine();

        System.out.print("Espécie: ");
        animalPet.especie = sc.nextLine();

        System.out.print("Peso (Kg): ");
        animalPet.peso = sc.nextDouble();

        animalPet.porte = animalPet.definirPorte();

        System.out.println("\n=== FICHA DO PET ===");
        System.out.printf("Nome: %s\nEspécie: %s\nPeso: %.1f\nPorte: %s", animalPet.nome,animalPet.especie, animalPet.peso, animalPet.porte);
    }
}

//
//Nome do pet: Mel
//Espécie: Cachorro
//Peso (kg): 8.5
//
//        === FICHA DO PET ===
//Nome: Mel
//Espécie: Cachorro
//Peso: 8.5 kg


