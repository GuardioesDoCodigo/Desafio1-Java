import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v1[] = new int[3];
        int v2[] = new int[3];

        System.out.printf("Digite os valores do primeiro vetor: ");
        for (int i = 0; i < 3; i++) {
            v1[i] = input.nextInt();
        }
        System.out.println("Digite os valores do segundo vetor: ");
        for (int i = 0; i < 3; i++) {
            v2[i] = input.nextInt();
        }
        System.out.println("O produto escalar é: " + Conta.Escalar(v1, v2));

    }
}