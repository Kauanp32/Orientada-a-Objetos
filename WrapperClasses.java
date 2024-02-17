// Declaração do pacote "OrientacaoObejto"
package OrientacaoObejto;

// Declaração da classe pública "WrapperClasses"
public class WrapperClasses {

    // Declaração do método principal "main" com argumentos do tipo array de strings
    public static void main(String[] args) {

        // Declaração e inicialização da variável inteira "x" com o valor 20
        int x = 20;
        
        // Autoboxing: "x" é automaticamente convertido para um objeto "Integer" e atribuído a "obj"
        Integer obj = x;
        
        // Impressão do valor de "obj", que é um objeto "Integer" representando o valor 20
        System.out.println(obj);
        
        // Realização de operação aritmética: "obj" é desempacotado automaticamente, multiplicado por 2 e atribuído a "y"
        int y = obj * 2;
        
        // Impressão do valor de "y", que é o resultado da operação, 20 multiplicado por 2
        System.out.println(y);

    }
}