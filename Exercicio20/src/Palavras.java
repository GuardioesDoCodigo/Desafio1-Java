import java.util.List;

public class Palavras {
    public static int ContaPalavras(List<String> lista){
        /*.Escreva um programa que conte o número de palavras em uma lista de strings, excluindo palavras repetidas.*/
        int total = 0;
        String[] palavras = new String[lista.size()];
        lista.toArray(palavras);    // converte a lista para array
        for (int i = 0; i < palavras.length; i++) { // percorre o array

            boolean repetida = false;   // cria uma variável de controle e assume que não é repetida
            for (int j = 0; j < i; j++) { // percorre o array até o índice atual
                if (palavras[i].equals(palavras[j])) { // se a palavra atual for igual a alguma anterior
                    repetida = true;
                    break;
                }
            }
            if (!repetida) {    // se a variável de controle não foi alterada para true
                total++;    // incrementa o total
            }
        }
        return total;
    }
}
