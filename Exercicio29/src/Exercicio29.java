/*
29. Implemente um programa que calcule a média ponderada
de uma lista de notas com pesos distintos para cada nota.

A fórmula da média ponderada é conforme o exemplo abaixo:
((N1 * P1) + (N2 * P2) + (N3 * P3)) / (P1 + P2 + P3)
*/


//Importação que permite usar a classe Scanner do pacote java.util
import java.util.Scanner;

//Declara a classe que se chama Exercicio30, na verdade
public class Exercicio29 {
    //Declara o método main. É o ponto de entrada principal para a execução de um programa Java.
    public static void main(String[] args) {
        //Cria uma instância da classe Scanner que é usada para obter entrada do usuário através do console.
        Scanner entrada = new Scanner(System.in);

        /*Estabelece o número de notas que será lido*/
        System.out.print("Digite o número de notas: ");
        int n = entrada.nextInt();

        int controle = 0; /*controle para o loop*/
        double notaPonderada = 0;
        double somaPesos = 0;

        /*Pede nota e peso, usa a fórmula, n vezes*/
        while (controle < n) {
            System.out.print("Digite a nota: ");
            double nota = entrada.nextDouble();

            System.out.print("Digite o peso: ");
            double peso = entrada.nextDouble();

            notaPonderada += nota * peso; /*Multiplica cada nota por seu peso*/
            somaPesos += peso; /*Soma os pesos*/

            controle++;
        }
        /*
        Condição: Se a soma dos pesos zerar, não será possível executar a fórmula da média ponderada.
        Senão, as notas multiplicadas por seus pesos será dividido pela soma dos pesos.
        E mostrará uma mensagem com a média ponderada.
         */
        if (somaPesos == 0) {
            System.out.println("Não é possível calcular a média ponderada, pois a soma dos pesos é zero.");
        }
        else {
            double mediaPonderada = notaPonderada / somaPesos;
            System.out.printf("A média ponderada é: %.1f", mediaPonderada);
        }
    }
}
