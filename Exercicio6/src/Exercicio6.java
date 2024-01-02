import java.util.Scanner;

//6) Desenvolva um programa que determine se um número é um número feliz.

//Número feliz: operação envolvendo números positivos maiores que zero, onde se soma os resultados dos algarismos ao quadrado consecutivamente até que a soma final seja 1.

//Exemplo: 23 é um número feliz
//2²+3²=4+9
//4+9=13
//1²+3²=1+9
//1+9=10
//1²+0²=1+0
//1+0=1

public class Exercicio6 {
    public static int numeroFeliz(int n){
        int soma=0;
        int resto=0;
        while (n>0) {
            resto=n%10;     //Calcular o resto por 10 para dividir os algarismos em 2 números diferentes
            soma+=(resto*resto);    //Somar o quadrado do resultado da operação acima com o conteúdo da variável soma
            n/=10;      //Dividir o número original por zero
        }
        return soma;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo:");
        int n=sc.nextInt();
        int res=n;

        // repetir a operação até que ela dê como resultado 1 ou 4
        
        while (res!=1 && res!=4) {
            res=numeroFeliz(res);
            if (res==1) {      //Se o resultado final for 1, significa que ele é um número feliz
                System.out.println("É um número feliz :)");
                break;
            }else if(res==4){       //Se o resultado final for 4, significa que ele não é um número feliz
                System.out.println("Não é um número feliz :(");
                break;
            }
        }
    }
}
