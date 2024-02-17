package OrientacaoObejto; // Pacote do programa

import java.util.Locale; // Importando a classe Locale para formatação
import java.util.Scanner; // Importando a classe Scanner para entrada de dados
import entities.Product; // Importando a classe Product do pacote entities

public class VetorPart1 { // Declaração da classe VetorPart1

    public static void main(String[] args) { // Método principal

        Locale.setDefault(Locale.US); // Configurando o local para formatação como US (ponto como separador decimal)
        Scanner sc = new Scanner(System.in); // Criando um objeto Scanner para entrada de dados

        int n = sc.nextInt(); // Lendo a quantidade de produtos a serem registrados
        Product[] vect = new Product[n]; // Criando um vetor (array) de produtos com tamanho n

        for (int i = 0; i < vect.length; i++) { // Loop para preencher o vetor com informações dos produtos
            sc.nextLine(); // Consumindo a quebra de linha pendente
            String name = sc.nextLine(); // Lendo o nome do produto
            double price = sc.nextDouble(); // Lendo o preço do produto
            vect[i] = new Product(name, price); // Criando um objeto Product com os dados lidos e armazenando no vetor
        }

        double sum = 0.0; // Inicializando a variável para armazenar a soma dos preços dos produtos

        for (int i = 0; i < vect.length; i++) { // Loop para calcular a soma dos preços dos produtos
            sum += vect[i].getPrice(); // Adicionando o preço do produto atual à soma
        }

        double avg = sum / vect.length; // Calculando a média dos preços dos produtos

        System.out.printf("AVERAGE PRICE = %.2f%n", avg); // Exibindo a média dos preços formatada com duas casas decimais

        sc.close(); // Fechando o Scanner
    }
}