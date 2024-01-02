import java.util.Scanner;

//1) Desenvolva um programa que calcule o fatorial duplo de um número.

//Fatorial duplo: ao invés de ir de 1 em 1 como no fatorial normal, o fatorial duplo vai de 2 em 2.

//Exemplo fatorial normal: 5!=5x4x3x2x1  
//Exemplo fatorial duplo: 5!!=5x3x1

public class Exercicio1{

    public static void main(String[] args){

        //usando o scanner para o usuário digitar um valor do teclado
        Scanner sc=new Scanner(System.in); 
        System.out.println("Digite um numero inteiro");
        int n=sc.nextInt();

        //inicializei a variavel que vai calcular/mostrar o fatorial com 1 por descargo de consciência; não sei se era necessário
        //por se tratar de multiplicação, se inicializasse com zero o resultado seria zerado

        int fatorial=1;         

        //o laço de repetição vai de trás para frente (começa com o valor digitado pelo usuário e para antes de chegar em zero) e decresce de 2 em 2

        for(int i=n;i>0;i-=2){

            //Ex n=6: fatorial=1*6*4*2
            fatorial*=i;           

        }
        System.out.println("Resultado: "+fatorial);
    }
}