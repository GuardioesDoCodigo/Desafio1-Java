import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k;

        System.out.println("Digite a quantidade de elementos: ");
        n = input.nextInt();
        System.out.println("Digite a quantidade posições: ");
        k = input.nextInt();
        System.out.println("O número de combinações possíveis é: " + Contas.Combinacoes(n, k));
    }
}
