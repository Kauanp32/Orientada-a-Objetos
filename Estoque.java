// Importa as classes necessárias do pacote Java
package OrientacaoObejto;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

// Classe principal do programa
public class Estoque {

    // Método principal
    public static void main(String[] args) {

        // Configura o local para US para entrada de dados com ponto decimal
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Solicita dados do produto ao usuário
        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        // Cria um novo objeto Product com os dados fornecidos
        Product product = new Product(name, price);

        // Atualiza o nome do produto e exibe
        product.setName("Computer");        
        System.out.println("Updated name: " + product.getName());
        
        // Atualiza o preço do produto e exibe
        product.setPrice(1200.00);
        System.out.println("Updated price : "  + product.getPrice ());

        System.out.println();
        System.out.println("Product data: " + product);

        // Solicita a quantidade de produtos a serem adicionados ao estoque e exibe
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        // Solicita a quantidade de produtos a serem removidos do estoque e exibe
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        // Fecha o Scanner
        sc.close();
    }
} // fim da classe