// Declaração do pacote "OrientacaoObejto"
package OrientacaoObejto;

// Declaração da classe pública "BoxingUnboxig"
public class BoxingUnboxig {

    // Declaração do método principal "main" com argumentos do tipo array de strings
    public static void main(String[] args) {

        // Declaração e inicialização da variável inteira "x" com o valor 20
        int x = 20;

        // Autoboxing: "x" é automaticamente convertido para um objeto "Integer" e atribuído a "obj"
        Object obj = x;

        // Impressão do valor de "obj", que é um objeto "Integer" representando o valor 20
        System.out.println(obj);

        // Unboxing: "obj" é explicitamente convertido de volta para o tipo primitivo "int" e atribuído a "y"
        int y = (int)obj;

        // Impressão do valor de "y", que deve ser 20, pois foi unboxed de "obj"
        System.out.println(y);
    }
} // Fim da classe "BoxingUnboxig"