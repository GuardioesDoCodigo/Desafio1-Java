//25. Escreva um programa que determine se uma string é um pangrama perfeito

//Importação que permite usar a classe Scanner do pacote java.util
import java.util.Scanner;

// Declara a classe que se chama Exercicio30, na verdade
public class Exercicio25 {
    // Declara o método main. É o ponto de entrada principal para a execução de um programa Java.
    public static void main(String[] args) {
        // Cria uma instância da classe Scanner que é usada para obter entrada do usuário através do console.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase para saber se é um pangrama perfeito: ");
        String frase = entrada.nextLine();
        // Sugestão: Marta Wiky foi à cozinha pois queria ver belo jogo de xícaras

        if (pangramaPerfeito(frase)) {
            System.out.println("É um pangrama perfeito.");
        } else {
            System.out.println("NÃO é um pangrama perfeito.");
        }
    }

    public static boolean pangramaPerfeito(String frase) {
        // Converte a string para minúsculas e remove espaços
        String semEspaco = frase.toLowerCase().replaceAll("\\s", "");

        // Verifica se cada letra do alfabeto está presente na frase
        for (char letra = 'a'; letra <= 'z'; letra++) {
            if (semEspaco.indexOf(letra) == -1) {
                // Se uma letra estiver ausente, não é um pangrama perfeito
                return false;
            }
        }

        // Se todas as letras estão presentes, é um pangrama perfeito
        return true;
    }
}