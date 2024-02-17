// Importa as classes necessárias do pacote Java
package OrientacaoObejto;

import java.util.Locale;
import java.util.Scanner;
import entities.StudentPart2;

// Classe principal do programa
public class StudentPart1 {

    // Método principal
    public static void main(String[] args) {

        // Configura o Locale para US (ponto como separador decimal)
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Cria um objeto da classe Student
        StudentPart2 student = new StudentPart2();

        // Solicita ao usuário para inserir dados do estudante
        System.out.print("Enter student name: ");
        student.name = sc.nextLine();

        System.out.print("Enter grade 1: ");
        student.grade1 = sc.nextDouble();

        System.out.print("Enter grade 2: ");
        student.grade2 = sc.nextDouble();

        System.out.print("Enter grade 3: ");
        student.grade3 = sc.nextDouble();

        // Calcula e exibe a nota final do estudante com 2 casas decimais
        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        // Verifica se o estudante passou ou falhou e exibe a mensagem correspondente
        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }

        // Fecha o objeto Scanner
        sc.close();
    }
}