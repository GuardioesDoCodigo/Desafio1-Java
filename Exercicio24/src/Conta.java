public class Conta {

    public static int MDC(int n1, int n2) {
        /*.Implemente um programa que calcule o máximo divisor comum (MDC) de dois números.*/

        int mdc = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {  // percorre todos os números até o menor dos dois números
            if (n1 % i == 0 && n2 % i == 0) {  // se o número atual for divisor de ambos os números
                mdc = i;   // atualiza o mdc para o número atual (o último número que for divisor de ambos será o mdc)
            }
        }
        return mdc; // retorna o mdc
    }
}
