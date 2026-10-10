package org.example.aula0510;
import java.util.ArrayList;
import java.util.List;


//coisas em posicoes espeficicas
public class AulaArrayList {
    static void main() {
        //ArrayList<String> lista = new ArrayList<>();
        /*
        .add()
        .get() para acessar o valor da lista
        .size() mostra quantos elementos tem na lista
        .contais() checa se tem o valor na lista
        .set() muda uma coisa por outra
        .indexOf() diz a posição do elemento que buscamos
        .isEmpty() diz se a lista está vazia
         */

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        lista.addAll(List.of(4,5,6,7,8)); //adicione varios valores ao mesmo tempo, para nao ter q escrever um monte de .add()
        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);
        System.out.println(lista.get(2));
        lista.set(1,45);
        System.out.println(lista);
        System.out.println(lista.size());
        System.out.println(lista.contains(45));
        lista.add(0,100);
        System.out.println(lista);
        System.out.println(lista.indexOf(100));
        System.out.println(lista.isEmpty());
    }
}
