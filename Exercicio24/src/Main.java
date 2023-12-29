import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int a = input.nextInt();
        System.out.println("Insira outro número: ");
        int b = input.nextInt();

        System.out.println("O MDC de " + a + " e " + b + " é " + Conta.MDC(a, b));
    }
}