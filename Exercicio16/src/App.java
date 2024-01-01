import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        /*
         * 16.Escreva um programa que ordene uma lista de strings por ordem
         * lexicográfica, ignorando maiúsculas e minúsculas.
         */
        
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("f", "a", "d", "g", "e", "c", "h", "b")); // Inicialização da Lista utilizando o método Arrays.asList que cria uma lista apartir de um array de tamanho definido.
        System.out.println("Lista original: " + strings.toString()); 

        Collections.sort(strings); // Ordena a lista de acordo com a ordem natural dos objetos.

        System.out.println("Lista em ordem lexicográfica: " + strings);
    }
}
