// Importa as classes necessárias do pacote Java
package OrientacaoObejto;

import java.util.Scanner;

// Importa a classe Calculetor do pacote entities
import entities.Calculetor;

// Classe principal do programa
public class Calculator {
    
    // Constante que representa o valor de PI
    public static final double PI = 3.14159;
    
    // Método principal
    public static void main(String[] args) {

        // Cria um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner (System.in);
        
        // Solicita ao usuário para inserir o raio
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        
        // Calcula a circunferência usando o método da classe Calculetor
        double c = Calculetor.circumference(radius);
        
        // Calcula o volume usando o método da classe Calculetor
        double v = Calculetor.volume(radius);
        
        // Exibe a circunferência com 2 casas decimais
        System.out.printf("Circumference: %.2f%n", c);
        
        // Exibe o volume com 2 casas decimais
        System.out.printf("Volume: %.2f%n", v);
        
        // Exibe o valor de PI
        System.out.printf("PI value: %.2f%n", PI);

        // Fecha o objeto Scanner
        sc.close();
    }
    
    // Método que calcula a circunferência
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }
    
    // Método que calcula o volume
    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}