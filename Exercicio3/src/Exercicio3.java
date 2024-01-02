import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//3) Elabore um programa que leia uma lista de palavras e retorne a palavra que aparece com mais frequência.

public class Exercicio3 {
    public static String achaPalavraFrequente(List<String> lista){ //define que tu quer uma lista (<String> diz que a lista vai aceitar somente string)
        int max_c=0; //quantidade de vezes que a string mais frequente apareceu
        String maisFrequente="";

        //percorre o array
        for(int i=0;i<lista.size();i++){ //lista.size() retorna o tamanho da lista
            //quantidade de vezes que uma determinada string apareceu
            int c=0;
            //percorre cada palavra do array
            for(int j=i+1;j<lista.size();j++){
                //confere se são iguais
                if(lista.get(j).equals(lista.get(i))){//lista.get(j) retorna o elemento da posição j da lista
                    c++;
                }
            }
            //se uma string apareceu mais de uma vez no array, a variável que grava a quantidade de vezes que a string mais frequente atualiza com o conteúdo da variável c 
            //(que conta tantas vezes uma string apareceu)
            if(c>max_c){
                max_c=c;
                maisFrequente=lista.get(i);
            }else{
                maisFrequente="Não houve uma palavra que tenha aparecido mais frequente que outra";
            }
        }
        return maisFrequente;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<String> lista = new ArrayList<String>(); //cria uma lista vazia
        System.out.println("Quantidade de palavras da lista:");
        int n=sc.nextInt();
        System.out.println("Palavras da lista: ");
        for(int i=0;i<n;i++){
            lista.add(sc.next()); //adiciona uma string na lista
        }
        String res=achaPalavraFrequente(lista);
        System.out.println("Palavra mais frequente da lista: "+res);
    }
}
