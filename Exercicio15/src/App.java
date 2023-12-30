public class App {
    public static void main(String[] args) {
        /*
         * 15.Escreva um programa que inverta a ordem das palavras em uma
         * string.
         */

        String str = "Lorem ipsum dolor sit amet.";
        String[] split = str.split(" "); // Separa a String em todos os espaços em branco e armazena as palavras em um vetor.

        System.out.println("String original: " + str); // Mostra a String original.

        str = ""; // Sobrescreve a String original para uma String vazia.

        for (int i = split.length - 1; i >= 0; i--) { // Loop que percorre o vetor das palavras da String.
            str += split[i] + " "; // Concatena na String vazia cada palavra adicionando um espaço ao final da palavra.
        }

        System.out.println("String invertida: " + str.trim()); // Printa no terminal a String invertida, usando o método trim() para remover o espaço em branco no final da frase.
    }
}
