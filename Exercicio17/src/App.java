public class App {
    public static void main(String[] args) {
        /*
         * 17.Crie um programa que encontre a posição da última ocorrência de um
         * elemento em um vetor.
         */

        int[] vetor = { 1, 2, 5, 4, 9, 8, 7, 1, 0, 3, 2 }; // Inicializando o vetor.
        int elemento = 2; // Elemento a ser encontrado.
        int ultimaPosicao = -1; // Inicializando a variável ultimaPosição com o valor -1, uma vez que é necessário
                          // atribuir um valor para utilizá-la como condição no bloco if/else. O valor não
                          // pode ser igual a 0, pois 0 representa a posição inicial do vetor.

        for (int i = 0; i < vetor.length; i++) { // Loop que percorre todo o vetor procurando o elemento.
            if (vetor[i] == elemento) // Se a posição atual do vetor for igual ao elemento procurado
                ultimaPosicao = i; // Adiciona na variável ultimaPosição, o número da posição atual do vetor que está sendo verificada.
        }

        if (ultimaPosicao == -1) // Se ultimaPosição for igual a -1 (valor inicial dela).
            System.out.printf("O elemento: %d, não tem nenhuma ocorrencia no vetor", elemento);
        else
            System.out.printf("A ultima ocorrencia do elemento %d eh na posicao: %d do vetor", elemento, ultimaPosicao);
    }
}
