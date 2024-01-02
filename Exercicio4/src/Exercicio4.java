import java.util.Scanner;

//4) Implemente um programa que determine se uma string é um palíndromo, considerando apenas os dígitos numéricos.

public class Exercicio4 {
    //Formata a string para conter apenas dígitos numéricos
    public static String formataString(String str){
        return str.replaceAll("[^\\d]", "");
    }
    //Verifica se a string formatada é um palíndromo
    public static boolean ehPalindromo(String str){
        String strFormatada=formataString(str);
        String reversa="";
        //Percorre a string formatada de trás para frente e coloca o conteúdo de cada índice numa variável chamada reversa
        for(int i=strFormatada.length()-1;i>=0;i--){
            reversa+=strFormatada.charAt(i);
        }
        //a função equals retorna um valor boolean, então aqui ela está retornando o resultado da comparação entre a string formatada e o conteúdo da variável reversa
        return strFormatada.equals(reversa);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("String a ser analizada:");
        String str=sc.nextLine();
        boolean res=ehPalindromo(str);
        if(res==true){
            System.out.println("É palíndromo");
        }else{
            System.out.println("Não é palíndromo");
        }
    }
}
