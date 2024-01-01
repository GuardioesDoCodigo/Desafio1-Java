/*
30. Escreva um programa que determine se um número é um número de
Lucas.

A sequência de Lucas é uma sucessão semelhante a sequência Fibonacci.
Os dois primeiros termos são 1 e 3, sendo os seguintes obtidos
pela soma dos dois termos anteriores.
 */
//Importação que permite usar a classe Scanner do pacote java.util
import java.util.Scanner;

//Declara a classe que se chama Exercicio30, na verdade
public class Exercicio30 {
    //Declara o método main. É o ponto de entrada principal para a execução de um programa Java.
    public static void main(String[] args) {
        //Cria uma instância da classe Scanner que é usada para obter entrada do usuário através do console.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = entrada.nextInt();

        int a = 1;
        int b = 3;
        int c = 0;

        if (n == 0) {
            System.out.println("Inválido");
        } else {
            if (n == 1 || n == 3) {
                System.out.println(n + " é um número que pertence a Sequência de Lucas");
                System.exit(0);
            } else {
                while (c < n) {
                    c = b + a;
                    a = b;
                    b = c;
                }
                if (c == n) {
                    System.out.println(n + " é um número que pertence a Sequência de Lucas");
                } else {
                    System.out.println(n + " NÃO é um número que pertence a Sequência de Lucas");
                }
            }
        }
    }
}
