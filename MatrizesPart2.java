package OrientacaoObejto;

// Importação da classe Scanner do pacote java.util
import java.util.Scanner;

// Declaração da classe pública "MatrizesPart2"
public class MatrizesPart2 {
	
    // Declaração do método principal "main" com argumentos do tipo array de strings
	public static void main(String[] args) {

        // Criação de um objeto Scanner para leitura de entrada do teclado
		Scanner sc = new Scanner(System.in);
		
        // Leitura do número de linhas (m) e colunas (n) da matriz a partir da entrada do usuário
		int m = sc.nextInt();
		int n = sc.nextInt();
        // Declaração e inicialização de uma matriz de inteiros "mat" com m linhas e n colunas
		int[][] mat = new int[m][n];
		
        // Laço para percorrer as linhas da matriz
		for (int i = 0; i < mat.length; i++) {
            // Laço para percorrer as colunas da matriz
			for (int j = 0; j < mat[i].length; j++) {
                // Leitura dos elementos da matriz a partir da entrada do usuário
				mat[i][j] = sc.nextInt();
			}
		}
		
        // Leitura do valor x a ser buscado na matriz a partir da entrada do usuário
		int x = sc.nextInt();
		
        // Laço para percorrer todas as células da matriz
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
                // Verificação se o elemento na posição atual é igual a x
				if (mat[i][j] == x) {
                    // Impressão da posição (linha,coluna) onde x foi encontrado
					System.out.println("Position " + i + "," + j + ":");
                    // Verificação e impressão do elemento à esquerda de x, se existir
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
                    // Verificação e impressão do elemento acima de x, se existir
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
                    // Verificação e impressão do elemento à direita de x, se existir
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
                    // Verificação e impressão do elemento abaixo de x, se existir
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
        // Fechamento do objeto Scanner para liberar os recursos
		sc.close();
	}
}