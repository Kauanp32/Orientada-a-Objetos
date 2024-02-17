// Importa as classes necessárias do pacote Java
package OrientacaoObejto;

import java.util.Locale;
import java.util.Scanner;

// Importa a classe Rectangle do pacote entities
import entities.RectanglePart2;

// Classe principal do programa
public class RectanglePart1 {

    // Método principal
    public static void main(String[] args) {

        // Configura o Locale para US (ponto como separador decimal)
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Cria um objeto da classe Rectangle
        RectanglePart2 rect = new RectanglePart2();

        // Solicita ao usuário para inserir largura e altura do retângulo
        System.out.println("Enter rectangle width and height:");

        // Lê a largura e altura do retângulo
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        // Calcula e exibe a área do retângulo com 2 casas decimais
        System.out.printf("AREA = %.2f%n", rect.area());

        // Calcula e exibe o perímetro do retângulo com 2 casas decimais
        System.out.printf("PERIMETER = %.2f%n", rect.perimeter());

        // Calcula e exibe a diagonal do retângulo com 2 casas decimais
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());

        // Fecha o objeto Scanner
        sc.close();
    }
}