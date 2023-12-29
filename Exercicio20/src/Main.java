import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a lista de palavras separadas por espaço:");
        String[] palavras = input.nextLine().split(" ");
        List<String> lista = Arrays.asList(palavras);
        System.out.println("Total de palavras: " + Palavras.ContaPalavras(lista));
    }
}
