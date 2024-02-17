// Importa as classes necessárias do pacote Java
package OrientacaoObejto;

// Importa as classes Triangle do pacote entities
import java.util.Locale;
import java.util.Scanner;
import entities.TrianglePart2;

// Classe principal do programa
public class TrianglePart1 {

    // Método principal
    public static void main(String[] args) {

        // Configura o Locale para US (ponto como separador decimal)
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Cria dois objetos da classe Triangle
        TrianglePart2 x, y;
        x = new TrianglePart2();
        y = new TrianglePart2();

        // Solicita ao usuário para inserir medidas do triângulo X
        System.out.println("Enter the measures of triangle X: ");

        // Lê as medidas do triângulo X
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        // Solicita ao usuário para inserir medidas do triângulo Y
        System.out.println("Enter the measures of triangle Y: ");

        // Lê as medidas do triângulo Y
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // Calcula as áreas dos triângulos X e Y
        double areaX = x.area();
        double areaY = y.area();

        // Exibe as áreas dos triângulos com 4 casas decimais
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        // Compara as áreas e exibe qual triângulo tem a maior área
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } 
        else {
            System.out.println("Larger area: Y");
        }

        // Fecha o objeto Scanner
        sc.close();
    }
}