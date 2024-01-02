/*9. Implemente um programa que encontre o número mais frequente em
um vetor.*/

package numeroFrequenteUol;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<>();
		int contador = 1;
		int maior = 0;
		int maiorNumRpeticao = 0;

		System.out.println("Quantos numeros você quer inserir? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];

		System.out.println("insira os numeros: ");

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
		}

		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length - 1; ++j) {
				if (vetor[j] > vetor[j + 1]) {
					maior = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = maior;
				}
			}
		}

		for (int i = 0; i < vetor.length - 1; i++) {
			if (vetor[i] == vetor[i + 1]) {
				contador++;
			} else {
				if (contador == maiorNumRpeticao) {
					lista.add(vetor[i]);
				} else if (contador > maiorNumRpeticao) {
					lista.clear();
					lista.add(vetor[i]);
					maiorNumRpeticao = contador;
				}
				contador = 1;
			}
		}

		// verifica separadamente o último elemento do vetor, para não dar erro.
		if (contador == maiorNumRpeticao) {
			lista.add(vetor[vetor.length - 1]);
		} else if (contador > maiorNumRpeticao) {
			lista.clear();
			lista.add(vetor[vetor.length - 1]);
		}

		System.out.print("numero mais frequente: " + lista.toString());

		sc.close();
	}

}


