/*
28. Elabore um programa que verifique se uma string é uma
subsequência de outra, ignorando espaços em branco.
 */
//Importação que permite usar a classe Scanner do pacote java.util
import java.util.Scanner;

//Declara a classe que se chama Exercicio30, na verdade
public class Exercicio28 {
    //Declara o método main. É o ponto de entrada principal para a execução de um programa Java.
    public static void main(String[] args) {
        //Cria uma instância da classe Scanner que é usada para obter entrada do usuário através do console.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String palavra1 = entrada.nextLine();

        System.out.println("Digite a segunda palavra: ");
        String palavra2 = entrada.nextLine();

        //Uma condição chamando o método ehSubsequencia
        //Criado um método subsequencia que verifica se uma string é uma subsequência de outra string
        if (subsequencia(palavra1, palavra2)) {
            System.out.println(palavra2 + " é uma subsequência de " + palavra1);
        } else {
            System.out.println(palavra2 + " NÃO é uma subsequência de " + palavra1);
        }
    }

    /*
    Verifica se palavra2 é uma subsequência de palavra1,
    ignorando espaços em branco
    */
    private static boolean subsequencia(String palavra1, String palavra2) {
        // Remover espaços em branco das duas strings
        palavra1 = palavra1.replaceAll("\\s", "");
        palavra2 = palavra2.replaceAll("\\s", "");

        int indexStr1 = 0;
        int indexStr2 = 0;

        /*
        Verificar caractere por caractere
        While ve se indexStr1 é menor que o comprimento da primeira palavra (palavra1.length())
        e se indexStr2 é menor que o comprimento da segunda palavra (palavra2.length()).
        O if compara os caracteres nas posições indexStr1 e indexStr2 das duas palavras.
        Se os caracteres são iguais, indexStr2 é incrementado.
        Isso significa que um caractere correspondente foi encontrado nas duas palavras,
        e agora o próximo caractere da segunda palavra será comparado.
        Independentemente de os caracteres serem iguais ou não, indexStr1 é sempre incrementado.
        Isso permite avançar para o próximo caractere na primeira palavra.
         */
        while (indexStr1 < palavra1.length() && indexStr2 < palavra2.length()) {
            if (palavra1.charAt(indexStr1) == palavra2.charAt(indexStr2)) {
                indexStr2++;
            }
            indexStr1++;
        }

        /*
        Essa linha de código retorna um valor booleano indicando se a segunda palavra (palavra2)
        é uma subsequência da primeira palavra (palavra1).
         */
        return indexStr2 == palavra2.length();
    }
}