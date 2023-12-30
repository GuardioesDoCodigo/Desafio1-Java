import java.util.Scanner;

public class App {
    private static int somarDigitos(int numero) {
        if (numero < 10) // Se o número for menor que dez ele só tem um dígito logo, não é preciso somar.
            return numero;

        return (numero % 10) + somarDigitos(numero / 10); // Numero % 10 resulta no dígito da direita do número, Numero / 10 resulta no(s) digitos da esquerda.
                                                          // Sempre leva em consideração somente a parte inteira do numeros
    }

    public static void main(String[] args) {
        /*
         * 18.Elabore um programa que calcule a soma dos dígitos de um número
         * usando recursividade.
         */

        Scanner in = new Scanner(System.in);

        System.out.printf("Informe um numero: ");
        int numero = in.nextInt();
        int soma = somarDigitos(numero);

        System.out.printf("A soma dos digitos eh: %d", soma);

        in.close();
    }
}
