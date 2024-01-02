//10.Escreva um programa que ordene uma lista de strings por tamanho.

package ordenacaoString_Uol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String maior = "";

		System.out.println("Quantas palavras você quer inserir? ");
		int n = sc.nextInt();
		String[] vetor = new String[n];

		System.out.println("insira os palavras: ");

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.next();
		}
		
		/*Dentro desse for contem a ordenação bubble sort que fica responsavel por ordenar as strings por tamanho*/
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length - 1; ++j) {
				/*dentro desse if se o vetor[j] for menor que o vetor[j+1]
				 * então eles trocam de lugar */
				if (vetor[j].length() < vetor[j + 1].length()) {
					maior = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = maior;
				}
			}
		}
		System.out.println();
		System.out.println(">>>>> ORDENADO >>>>>");
		/*nesse FOR só serve para mostrar as palavras que estão dentro do vetor*/
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
