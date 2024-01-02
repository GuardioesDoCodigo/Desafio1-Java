/*12.Implemente um programa que encontre o elemento que mais se
repete em um vetor.
*/

package elementoMaisFrequente_Uol;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<>();
		int contador = 1;
		int pegaIndice = 0;
		int maiorNumRpeticao = 0;
		String maior = "";

		System.out.println("Quantas palavras você quer inserir? ");
		int n = sc.nextInt();
		String[] vetor = new String[n];

		System.out.println("insira os palavras: ");

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.next();
		}
		/*
		 * Dentro desse for contem a ordenação bubble sort que fica responsavel por
		 * ordenar as strings por tamanho
		 */
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length - 1; ++j) {
				/*
				 * dentro desse if se o vetor[j] for menor que o vetor[j+1] então eles trocam de
				 * lugar
				 */
				if (vetor[j].length() < vetor[j + 1].length()) {
					maior = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = maior;
				}
			}
		}

		for (int i = 0; i < vetor.length - 1; i++) {
			if (vetor[i].equalsIgnoreCase(vetor[i+1])) {
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

	}

}
//OBS: FALTA ARRUMAR A PARTE DE PRINTAR QUANDO 2 NUMEROS TEM A MESMA FREQUENCIA
