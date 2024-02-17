package OrientacaoObejto;

//Importação da classe Scanner do pacote java.util
import java.util.Scanner;

//Declaração da classe pública "Matrizes"
public class MatrizesPart1 {

 // Declaração do método principal "main" com argumentos do tipo array de strings
 public static void main(String[] args) {

     // Criação de um objeto Scanner para leitura de entrada do teclado
     Scanner sc = new Scanner(System.in);
     
     // Leitura do tamanho da matriz quadrada "n" a partir da entrada do usuário
     int n = sc.nextInt();
     
     // Declaração e inicialização de uma matriz de inteiros "mat" com tamanho n x n
     int[][] mat = new int[n][n];
     
     // Laço para percorrer as linhas da matriz
     for (int i = 0; i < mat.length; i++) {
         // Laço para percorrer as colunas da matriz
         for (int j = 0; j < mat[i].length; j++) {
             // Leitura dos elementos da matriz a partir da entrada do usuário
             mat[i][j] = sc.nextInt();
         }
     }
     
     // Impressão da mensagem "Main diagonal:" para indicar que a diagonal principal será impressa
     System.out.println("Main diagonal:");
     
     // Laço para percorrer a diagonal principal da matriz e imprimir seus elementos
     for (int i = 0; i < mat.length; i++) {
         System.out.print(mat[i][i] + " ");
     }
     // Impressão de uma nova linha após imprimir os elementos da diagonal principal
     System.out.println();
     
     // Contagem dos números negativos na matriz
     int count = 0;
     // Laço para percorrer todas as células da matriz
     for (int i = 0; i < mat.length; i++) {
         for (int j = 0; j < mat[i].length; j++) {
             // Verificação se o elemento é negativo
             if (mat[i][j] < 0) {
                 // Incremento do contador de números negativos
                 count++;
             }
         }
     }
     
     // Impressão da contagem de números negativos na matriz
     System.out.println("Negative numbers = " + count);
     
     // Fechamento do objeto Scanner para liberar os recursos
     sc.close();
  }
}