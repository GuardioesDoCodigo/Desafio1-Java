/*
26.
Desenvolva um programa que inverta a ordem dos elementos em uma
lista encadeada.
 */

//As classes LinkedList e Scanner para usar listas encadeadas e obter entrada do usuário.
import java.util.LinkedList;
import java.util.Scanner;

//Declarei uma classe chamada ex26.
public class Exercicio26 {
    //método principal do programa
    public static void main(String[] args) {
        /*
         uma instância de Scanner para receber entrada do usuário e uma instância
         de LinkedList para representar a lista encadeada de inteiros.
         */
        Scanner entrada = new Scanner(System.in);
        LinkedList<Integer> lista = new LinkedList<>();

        /*
        Solicita ao usuário inserir valores para a lista
        O programa entra em um loop while que continua a receber
        valores até que um número negativo seja inserido,
        indicando o final da entrada. Os valores fornecidos pelo usuário
        são adicionados à lista
         */
        System.out.println("Digite os valores da lista (digite um número negativo para encerrar):");
        int valor;
        while ((valor = entrada.nextInt()) >= 0) {
            lista.add(valor);
        }

        System.out.println("Lista original:");
        imprimirLista(lista);
        //método inverterLista para inverter a ordem dos elementos na lista.
        inverterLista(lista);

        System.out.println("Lista invertida:");
        imprimirLista(lista);
    }
    //Este método inverte a ordem dos elementos na lista.
    public static void inverterLista(LinkedList<Integer> lista) {
        int tamanho = lista.size();

        if (tamanho <= 1) {
            return;
        }
        /*
        Inicia um loop que percorre metade da lista (até tamanho / 2).
        Isso é feito para evitar inverter os elementos duas vezes
        e manter a lista no estado original.
        */
        for (int i = 0; i < tamanho / 2; i++) {

            //Armazena temporariamente o valor do elemento na posição i em uma variável temporária temp
            Integer temp = lista.get(i);
            /*
            Substitui o elemento na posição i com o elemento na posição correspondente
            ao final da lista (tamanho - 1 - i).
            Ou seja, troca o primeiro elemento com o último, o segundo com o penúltimo,
            e assim por diante.
             */
            lista.set(i, lista.get(tamanho - 1 - i));
            /*
            Substitui o elemento na posição correspondente ao final da lista (tamanho - 1 - i)
            com o valor armazenado temporariamente em temp.
            Isso completa a troca, efetivamente invertendo os dois elementos.
             */
            lista.set(tamanho - 1 - i, temp);
        }
    }
    //Este método imprime os elementos da lista.
    public static void imprimirLista(LinkedList<Integer> lista) {
        for (Integer elemento : lista) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
