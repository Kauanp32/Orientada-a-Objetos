// Importa as classes necessárias do pacote Java
package OrientacaoObejto;

// Importa as classes Product do pacote entities
import java.util.Locale;

import java.util.Scanner;
import entities.Produtos;

// Classe principal do programa
public class Tv {

    // Método principal
    public static void main(String[] args) {

        // Configura o Locale para US (ponto como separador decimal)
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Cria um objeto da classe Product
        Produtos Produtos = new Produtos();

        // Solicita ao usuário para inserir dados do produto
        System.out.println("Enter product data: ");

        // Solicita e lê o nome do produto
        System.out.print("Name: ");
        Produtos.name = sc.nextLine();

        // Solicita e lê o preço do produto
        System.out.print("Price: ");
        Produtos.price = sc.nextDouble();

        // Solicita e lê a quantidade em estoque do produto
        System.out.print("Quantity in stock: ");
        Produtos.quantity = sc.nextInt();

        // Exibe os dados do produto
        System.out.println();
        System.out.println("Product data: " + Produtos);

        // Solicita ao usuário para adicionar produtos ao estoque
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");

        // Lê a quantidade de produtos a serem adicionados e chama o método addProducts
        int quantity = sc.nextInt();
        Produtos.addProducts(quantity);

        // Exibe os dados atualizados do produto após a adição
        System.out.println();
        System.out.println("Updated data: " + Produtos);

        // Solicita ao usuário para remover produtos do estoque
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");

        // Lê a quantidade de produtos a serem removidos e chama o método removeProducts
        quantity = sc.nextInt();
        Produtos.removeProducts(quantity);

        // Exibe os dados atualizados do produto após a remoção
        System.out.println();
        System.out.println("Updated data: " + Produtos);

        // Fecha o objeto Scanner
        sc.close();
    }
}