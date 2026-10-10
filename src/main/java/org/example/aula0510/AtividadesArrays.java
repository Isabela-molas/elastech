package org.example.aula0510;
import java.util.ArrayList;
import java.util.List;

public class AtividadesArrays {
    static void main() {
        //- Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.addAll(List.of("Maria","Ana", "Luana" ));
        System.out.println(listaNomes);

        //- Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.
        ArrayList<String> frutas = new ArrayList<>(List.of("abacaxi", "melão", "abacate", "banana"));
        System.out.println(frutas.get(0));

        //- Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.
        ArrayList<String> nomes = new ArrayList<>(List.of("Paula", "Geo", "Joana", "Bia"));
        System.out.println(nomes);
        nomes.set(2,"Maria");
        System.out.println(nomes);

        //- Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.
        ArrayList<String> cidades = new ArrayList<>(List.of("Campo Grande", "São Paulo", "Rio de Janeiro", "Curitiba"));
        cidades.remove(1);
        System.out.println(cidades.size());

        //- Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista)
        ArrayList<String> nomeTres = new ArrayList<>(List.of("Duda", "Flora", "Pamela", "Gabi", "Natalia", "Rebeca"));
        for (int i = 0; i < nomeTres.size(); i++){
            System.out.println(i + ": " + nomeTres.get(i));
        }

        //- Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.



    }
}



//ArrayList<Integer> lista = new ArrayList<>(List.of(1,2,3));