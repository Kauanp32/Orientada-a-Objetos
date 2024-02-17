package OrientacaoObejto;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Fixacao {

    public static void main(String[] args) {

        // Configura o local para US (ponto como separador decimal)
        Locale.setDefault(Locale.US);

        // Cria um Scanner para entrada de dados do usuário
        Scanner sc = new Scanner(System.in);
        Account account; // Declaração da variável para armazenar a conta

        // Solicita ao usuário informações sobre a conta
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit); // Cria a conta com depósito inicial
        } else {
            account = new Account(number, holder); // Cria a conta sem depósito inicial
        }

        // Exibe os dados da conta
        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        // Realiza um depósito na conta
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        // Realiza um saque na conta
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        // Fecha o Scanner
        sc.close();
    }
} 