import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static boolean isPrimo(int n) {
        /*
         * Os Números Primos são números naturais maiores do que 1 que possuem somente
         * dois divisores, ou seja, são divisíveis por 1 e por ele mesmo.
         */

        if (n == 1) // Se o número passado como parâmetro for igual a 1, retorna false pois 1 não é numero primo.
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) { // Loop que percorre do número 2 até a raiz quadrada do número passado como parâmetro.
            if (n % i == 0) // Se o número passado como parâmetro for divisível por qualquer número entre 2 e a raiz quadrada do número passado como parâmetro, ele não é primo.
                return false; // E retorna false.
        }

        return true; // Retorna true caso ele saia do loop acima, ou seja, o número é primo.
    }

    public static void main(String[] args) {
        /*
         * 13.Elabore um programa que leia uma lista de números e retorne a soma
         * dos números primos.
         */

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        int n = -1;
        int soma = 0;

        while (n != 0) { // Loop que lê todos os valores digitados pelo usuário a serem inseridos na lista.
            System.out.print("Informe um número ou digite 0 para encerrar e somar os nros primos: ");
            n = in.nextInt();

            if (n > 0)
                numeros.add(n);
        }

        in.close(); // Fechando o scanner.

        for (Integer integer : numeros) { // Loop que percorre todos os números digitados.
            if (isPrimo(integer)) // Chama a função estática que verifica se o número é primo, retornando um valor booleano.
                soma += integer; // Caso a condição for verdadeira, adiciona o número à variável soma.
        }

        System.out.printf("A soma dos numeros primos eh: %d", soma);
    }
}
