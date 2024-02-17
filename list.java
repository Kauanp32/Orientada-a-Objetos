package OrientacaoObejto; // Pacote do programa

import java.util.ArrayList; // Importando a classe ArrayList para usar listas dinâmicas
import java.util.List; // Importando a classe List para manipulação de listas
import java.util.stream.Collectors; // Importando a classe Collectors para operações de stream

public class list { // Declaração da classe list

    public static void main(String[] args) { // Método principal

        List<String> list = new ArrayList<>(); // Criando uma lista de strings usando ArrayList

        // Adicionando elementos à lista
        list.add("Kauan");
        list.add("Vitoria");
        list.add("Mike");
        list.add("Boris");
        list.add(2, "Mel"); // Adicionando "Mel" na posição 2

        System.out.println(list.size()); // Imprimindo o tamanho da lista
        for (String x : list) { // Iterando sobre os elementos da lista e imprimindo-os
            System.out.println(x);
        }

        System.out.println("---------------------");

        // Removendo elementos da lista que começam com 'M'
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) { // Iterando novamente e imprimindo os elementos restantes
            System.out.println(x);
        }

        System.out.println("---------------------");

        // Obtendo o índice de um elemento na lista
        System.out.println("Index of Boris: " + list.indexOf("Boris"));
        System.out.println("Index of Mel: " + list.indexOf("Mel"));

        System.out.println("---------------------");

        // Filtrando elementos que começam com 'A' e coletando-os em uma nova lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) { // Iterando sobre os elementos filtrados e imprimindo-os
            System.out.println(x);
        }

        System.out.println("---------------------");

        // Encontrando o primeiro elemento que começa com 'J' ou retornando null se não houver
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name); // Imprimindo o resultado
    }
}