// Declaração do pacote "OrientacaoObejto"
package OrientacaoObejto;

// Declaração da classe pública "LacoForEach"
public class LacoForEach {

    // Declaração do método principal "main" com argumentos do tipo array de strings
    public static void main(String[] args) {

        // Declaração e inicialização de um array de strings "vect"
        String[] vect = new String[] {"Kauan", "Vitoria", "Mike"};
        
        // Laço "for" tradicional para percorrer o array e imprimir seus elementos
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        
        // Impressão de linha separadora
        System.out.println("----------------------");
        
        // Laço "for-each" para percorrer o array e imprimir seus elementos de forma mais simplificada
        for (String nomes : vect) {
            System.out.println(nomes);
        }
    }
}