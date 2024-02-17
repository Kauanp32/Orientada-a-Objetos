package OrientacaoObejto;

import java.util.Scanner;
import entities.Rent;

public class Rentds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Cria um array para armazenar os objetos Rent
        Rent[] vect = new Rent[10];
        
        // Solicita ao usuário o número de quartos a serem alugados
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        
        // Loop para cada quarto a ser alugado
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Rent #" + (i + 1) + ":");
            
            // Solicita ao usuário o nome e o e-mail do locatário
            System.out.print("Name: ");
            sc.nextLine(); // Consumir a quebra de linha pendente
            String name = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.nextLine();
            
            // Solicita ao usuário o número do quarto a ser alugado
            System.out.print("Room: ");
            int room = sc.nextInt();
            
            // Cria um objeto Rent com os dados fornecidos e armazena no array
            vect[room] = new Rent(name, email);
        }
        
        // Exibe os quartos ocupados
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        
        // Fecha o Scanner
        sc.close();
    }
}