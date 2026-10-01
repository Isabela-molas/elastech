package org.example.aula2909;

public class Arrays {
    static void main() {
        int[] notas= {3,4,5,6,7,8,9};
        int[] outrasNotas = new int[3]; //qnd não tem ainda os valores, somente o tamanho do array, as posições

        System.out.println(notas.length); //número total de caracteres no array;

        for (int i = 0; i <= notas.length; i++) {
            System.out.println("A nota é: " + notas[i]);
        }
    }
}
