import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[];
        int tamanho;

            System.out.println("Digite o tamanho do vetor: ");
            tamanho = entrada.nextInt();
            numeros = new int[tamanho];

            for(int contador = 0; contador < tamanho; contador++){
                System.out.println("Digite o valor da posição " + contador + ": ");
                numeros[contador] = entrada.nextInt();
            }

            int temporario;
            int tam = tamanho;

            for(int contador = 0; contador < tamanho/2; contador++){
                temporario = numeros[contador];
                numeros[contador] = numeros[tam-1];
                numeros[tam-1] = temporario;
                tam--;
            }

            System.out.println("\n\nVetor invertido: ");
            for(int contador = 0; contador < tamanho; contador++){
                System.out.println("Valor da posição " + contador + ": " + numeros[contador]);
            }
    }
}