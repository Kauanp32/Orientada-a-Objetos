// Importa as classes necessárias do pacote Java
package OrientacaoObejto;

import java.util.Locale;
import java.util.Scanner;
import entities.EmployeePart2;// Importa a classe Employee do pacote entities  

// Classe principal do programa
public class EmployeePart1 {
	
    // Método principal
    public static void main(String[] args) {
        
        // Configura o Locale para US (ponto como separador decimal)
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);
        
        // Cria um objeto da classe Employee
        EmployeePart2 emp = new EmployeePart2();
        
        // Solicita ao usuário para inserir dados do funcionário
        System.out.print("Name: ");
        emp.name = sc.nextLine();
        
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();
        
        // Exibe os dados do funcionário
        System.out.println();
        System.out.println("Employee: " + emp);
        
        // Solicita ao usuário para aumentar o salário do funcionário
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        
        // Exibe os dados atualizados do funcionário após o aumento
        System.out.println();
        System.out.println("Updated data: " + emp);
        
        // Fecha o objeto Scanner
        sc.close();
    }
}