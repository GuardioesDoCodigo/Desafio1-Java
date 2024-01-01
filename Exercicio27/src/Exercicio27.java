/*
27. Crie um programa que verifique se uma string é um palíndromo
perfeito
Exemplos: aia, arara, asa, Hannah, ama, anilina, mamam, matam, esse.
 */
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine();

        if (palindromoPerfeito(frase)) {
            System.out.println("É um palíndromo perfeito.");
        } else {
            System.out.println("NÃO é um palíndromo perfeito.");
        }
    }

    public static boolean palindromoPerfeito(String frase) {
        // Remover espaços e converter para minúsculas
        String fraseFormatada = semEspaco(frase);

        int inicio = 0;
        int fim = fraseFormatada.length() - 1;

        while (inicio < fim) {
            if (fraseFormatada.charAt(inicio) != fraseFormatada.charAt(fim)) {
                return false; // Se os caracteres não coincidem, não é um palíndromo
            }
            inicio++;
            fim--;
        }

        return true; // Se o loop terminou, é um palíndromo
    }

    public static String semEspaco(String frase) {
        // Remove espaços e converte para minúsculas
        return frase.replaceAll("\\s", "").toLowerCase();
    }
}
