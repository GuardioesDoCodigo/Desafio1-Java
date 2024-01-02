import java.util.Scanner;

//5) Escreva um programa que conte o número de subtrings palíndromas em uma string.

public class Exercicio5 {
    //Verifica palíndromos na string
    public static boolean ehPalindromo(String str, int inicio, int fim){
        boolean confirma=true;
        while(inicio<fim){
            //Se os caracteres forem diferentes e não coincidirem, não é palíndromo
            if(str.charAt(inicio)!=str.charAt(fim)){
                confirma=false;
            }
            inicio++;
            fim--;
        }
        return confirma;    //O resultado será verdadeiro se o loop terminar
    }
    public static int contaPalindromas(String str){
        int count=0;
        //Percorre a string
        for(int i=0;i<str.length();i++){
            //Percorre cada substring dentro da string
            for(int j=i;j<str.length();j++){
                //Chama o método acima; se o resultado for verdadeiro, o contador recebe um incremento
                if(ehPalindromo(str, i, j)==true){
                    //Aqui ele conta cada letra como substring palíndroma+qualquer outra substring que seja palíndroma+a própria palavra caso ela seja palíndroma
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("String a ser analizada:");
        String str=sc.nextLine();
        int res=contaPalindromas(str);
        System.out.println("Quantidade de substrings palíndromas: "+res);
    }
}
