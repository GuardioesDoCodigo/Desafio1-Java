import java.util.Scanner;

//2) Elabore um programa que converta um número octal para decimal.

public class Exercicio2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um número octal");

        int n=sc.nextInt();
        String octal=Integer.toString(n);       //Converte para string para utilizar no laço de repetição
        int decimal=0;
        String octalRev="";

        //Aqui ele reverte a string, para depois calcular certo usando os índices
        //Ex: 167 vira 761
        //Se eu não fizesse esse laço de repetição para reverter a string/numero digitado, o último número (no exemplo 7) seria multiplicado por 8 elevado ao indice dele (no caso 2), o que resultaria num valor errado

        for(int i=octal.length()-1;i>=0;i--){
            octalRev+=octal.charAt(i);
        }

        //Aqui ele percorre a string revertida
        for(int i=0;i<octalRev.length();i++){

            //Aqui o programa soma, na variável decimal, a o resultado da multiplicação entre o conteúdo de cada índice da string - convertida para int usando o Character.getNumericValue - e a potência de 8 elevada ao índice em que o caractere se encontra
            decimal+=(Character.getNumericValue(octalRev.charAt(i))*Math.pow(8,i));

        }
        System.out.println("Resultado: "+decimal);
    }
}
