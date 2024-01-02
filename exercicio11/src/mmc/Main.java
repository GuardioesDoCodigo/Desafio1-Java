package mmc;
/*11.Desenvolva um programa que calcule o m�nimo m�ltiplo comum
(MMC) de dois n�meros.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int divisor = 2;
		double divide = 0;
		double mmc = 1;
		double vetor[] = new double[2];
		int i = 0;

		/*Esse for serve para inserir os elemento no vetor */
		System.out.println("Insira os numeros para valcular o MMC: ");
		for (i = 0; i < vetor.length; i++) {
			System.out.print("Numero " + (i + 1) + ": ");
			vetor[i] = sc.nextInt();
			/*Dentro desse while tem uma condi��o caso o usuario coloque numeros negativos. Ent�o enquanto o usu�rio nao colocar numero
			 * positivo nao vai sair do while  */
			while (vetor[i] < 0) {
				System.err.print("Somente numeros inteiros!");
				System.out.print("\nNumero " + (i + 1) + ": ");
				vetor[i] = sc.nextInt();
			}
		}
		System.out.print("O MMC do numero " + vetor[0] + " e do numero " + vetor[1] + " �: ");
		/*Dentro desse while o programa s� vai sair se o vetor for == 1  */
		while (vetor[0] != 1 && vetor[1] != 1) {		
			for (i = 0; i < vetor.length - 1; i++) {
				/*S� entra nesse IF se o vetor[0] e o vetor[1] tiver como 
				 * o resto da divis�o igual a 0(ZERO)*/
				if (vetor[i] % divisor == 0 && vetor[i + 1] % divisor == 0) {
					divide = vetor[i] / divisor;
					vetor[i] = divide;

					divide = vetor[i + 1] / divisor;
					vetor[i + 1] = divide;
					/*a variavel "mmc" pega todos os numeros que dividem com o vetor e multiplica pelo proximo mmc
					 * e no final da o resultado do MENOR MULTIPLO COMUM*/
					mmc = mmc * divisor;

				}
				/*S� entra nesse IF se o vetor[0] tiver como 
				 * o resto da divis�o igual a 0(ZERO)e o vetor[1] tiver como 
				 * o resto da divis�o diferente de 0(ZERO)*/
				if (vetor[i] % divisor == 0 && vetor[i + 1] % divisor != 0) {
					divide = vetor[i] / divisor;
					vetor[i] = divide;

					mmc = mmc * divisor;
				}
				
				/*S� entra nesse IF se o vetor[0] tiver como 
				 * o resto da divis�o diferente 0(ZERO) e o vetor[1] tiver como 
				 * o resto da divis�o igual a 0(ZERO)*/
				if (vetor[i] % divisor != 0 && vetor[i + 1] % divisor == 0) {
					divide = vetor[i + 1] / divisor;
					vetor[i + 1] = divide;

					mmc = mmc * divisor;
				}
				//incrementa o divisor
				divisor++;

			}

		}

		System.out.print(mmc * vetor[0] * vetor[1]);

		sc.close();
	}

}
