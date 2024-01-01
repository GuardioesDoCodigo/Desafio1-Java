import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         * 14.Implemente um programa que calcule a média ponderada de uma
         * lista de números, onde os pesos são fornecidos pelo usuário.
         */

        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ArrayList<Double> numeros = new ArrayList<>(Arrays.asList(6.5, 7.9, 9.2));
        ArrayList<Double> pesos = new ArrayList<>();
        double somaNumeros = 0.0;
        double somaPesos = 0.0;

        for (int i = 0; i < numeros.size(); i++) {
            System.out.printf("Informe o peso da nota %d: ", i + 1);
            pesos.add(in.nextDouble());
            somaNumeros += numeros.get(i) * pesos.get(i);
            somaPesos += pesos.get(i);
        }
        
        in.close();

        double media = somaNumeros / somaPesos;
        System.out.printf("A media ponderada eh: %.2f", media);
    }
}
