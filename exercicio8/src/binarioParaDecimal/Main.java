package binarioParaDecimal;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

/*8. Elabore um programa que converta um n�mero bin�rio para decimal*/

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<>();

		int transforma = 0;
		int transforma2 = 0;
		int elevacao = 0;
		int soma = 0;
		

		System.out.println("Insira um numero binario");
		Integer binarioInteger = sc.nextInt();
		if(binarioInteger < 0) {
			System.err.println("Somente numeros positivos ");
		}
		String binario = String.valueOf(binarioInteger);
		

		for (int i = 0; i < binario.length(); i++) {
			/* Usei a fun��o Integer.parseInt para transformar a Srting em um inteiro
			a fun��o valeof serve para transformar cada char(caracteres da minha String) em um inteiro* === exemplo: 123 � uma String com 3 caracteres 
			a fun��o charAt serve para pegar somente o caractere de uma string. Ent�o foi por isso que coloquei essa parte em um for, para poder percorrer toda a String*/
			transforma2 = Integer.parseInt(binario.valueOf(binario.charAt(i))); 
			/*o ArrayLIst lista serve para que eu possa armazenar*/
			lista.add(transforma2);

		}
		/*Dentro desse for ta o codigo responsavel por tratar a exce��o caso o usuario coloque um numero diferente de 1 ou 0 */
		for (int i = 0; i < lista.size(); i++) {
			/*transformei a string em um inteiro para que eu pudesse colocar dentro de um arrayList e depois pudesse manipular a lista*/
			if(!(lista.get(i).equals(1) || lista.get(i).equals(0))) {
				/*Se o usario digitar outro numero que n�o seja 1 ou 0 vai cair nesse if e usando a fun��o rmeoveAll vai remover todos os 
				 * elementos dentro do arraylist*/
				lista.removeAll(lista);
				System.out.println("Insira somente numero binario: (0 ou 1) ");
				binario = sc.next();
				/*Usei a fun��o Integer.parseInt para transformar a Srtring em um inteiro novamente */
				transforma2 = Integer.parseInt(binario.valueOf(binario.charAt(i)));
				//colocado todas os caracteres que viraram int dentro do array
				lista.add(transforma2);
				/*I  recebe -1 para que possamos entrar dentro do for novamente e verificar se o usuario continua colocando o numerro errado */
				i=-1;
			}
			
				

		}
		/*dentro desse for o int i come�a recendo o tamanho da string e vai diminuindo a cada itera��o
		 * exemplo se o usuario digitar 11101 o i vai receber 5 que � a quantidades de caracteres existentes dentro da string*/
		for (int i = binario.length() - 1; i >= 0; i--) {
			/*Usei a fun��o Integer.parseInt para transformar a Srtring em um inteiro novamente */
			transforma = Integer.parseInt(binario.valueOf(binario.charAt(i)));
			/*a varivel transforma recebe ela mesmo mutiplicado por 2 elevado � variavel elevacao que aumenta em cada itera��o*/
			transforma *= Math.pow(2, elevacao);
			/*a variavel soma recebe o resultado da variavel transforma + ela mesma*/
			soma += transforma;
			elevacao++;

			
		}
		System.out.println("Decimal: " + soma);

	}

}
