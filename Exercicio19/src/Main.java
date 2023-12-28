import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = ler.nextInt();
        if (Cubo.perfeito(n)) {
            System.out.println("O número " + n + " é um cubo perfeito.");
        } else {
            System.out.println("O número " + n + " não é um cubo perfeito.");
        }
    }
}
