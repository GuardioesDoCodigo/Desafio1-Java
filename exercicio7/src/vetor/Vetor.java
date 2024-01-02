
//7. Crie um programa que remova os elementos duplicados de um vetor


package vetor;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros você quer inserir? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		Set<Integer> set = new HashSet<>(); //API de Collections ==> foi usada essa classe, pois nao aceita valores repetidos 
		
		System.out.println("insira os numeros: ");
		int i=0;
		for(int v:vetor) { //for each para percorrer o vetor 
			v = sc.nextInt();
			set.add(v);
			i++;
			
		}
		System.out.println(set); //mostra os numeros do vetor

	}

}
