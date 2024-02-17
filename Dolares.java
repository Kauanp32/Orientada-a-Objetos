// Importa as classes necessárias do pacote Java
package OrientacaoObejto;

import java.util.Locale;

import java.util.Scanner;

// Importa a classe CurrencyConverter do pacote entities
import entities.CurrencyConverter;

// Classe principal do programa
public class Dolares {
    
    // Método principal
    public static void main (String[] args) {

        // Configura o Locale para US (ponto como separador decimal)
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);
        
        // Solicita ao usuário para inserir o preço do dólar
        System.out.print("Qual é o preço do dólar? ");
        double dollarPrice = sc.nextDouble();
        
        // Solicita ao usuário para inserir a quantidade de dólares a serem comprados
        System.out.print("Quantos dólares serão comprados? ");
        double amount = sc.nextDouble();
        
        // Calcula o valor a ser pago em reais usando o método da classe CurrencyConverter
        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
        
        // Exibe o resultado formatado com 2 casas decimais
        System.out.printf("Valor a ser pago em reais = %.2f%n", result);
        
        // Fecha o objeto Scanner
        sc.close();
    }
}