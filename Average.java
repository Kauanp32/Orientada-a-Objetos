package OrientacaoObejto;

import java.util.Locale;
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        // Configura o local para US (ponto como separador decimal)
        Locale.setDefault(Locale.US);

        // Cria um Scanner para entrada de dados do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário o número de elementos da lista
        int n = sc.nextInt();

        // Cria um array para armazenar os números fornecidos pelo usuário
        double[] vect = new double[n];

        // Loop para ler os números fornecidos pelo usuário e armazená-los no array
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        
        // Calcula a soma de todos os números na lista
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        
        // Calcula a média dos números na lista
        double avg = sum / n;
        
        // Exibe a média com duas casas decimais
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        
        // Fecha o Scanner
        sc.close();
    }
}