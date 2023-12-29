import java.util.List;

public class Conta {

    public static double mediaPares(List<Integer> lista) { //List só aceita objetos, por isso Integer ao invés de int
        /*Elabore um programa que leia uma lista de números e retorne a média dos números pares*/
        double total = 0;
        int pares = 0;
        for (int i = 0; i < lista.size(); i++) {  // percorre a lista
            if (lista.get(i) % 2 == 0) { // se o número atual for par (se o resto da divisão por 2 for 0)
                total += lista.get(i); // soma o número ao total
                pares++;   // incrementa o total de pares
            }
        }
        return total / pares; // retorna a média
    }
}
