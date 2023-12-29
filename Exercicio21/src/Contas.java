public class Contas {
    public static int Combinacoes(int n, int k) {
        /*Desenvolva um programa que calcule o número de combinações possíveis de um conjunto de elementos.*/
        /*a fórmula de combinação é
         *                n!
         * C(n,k) =  ______________
         *           (k! * (n-k)!)
         * */
        int dividendo = fatorial(n); //parte de cima da fórmula
        int divisor = fatorial(k) * fatorial(n - k);   //parte de baixo da fórmula
        int combinacoes = dividendo / divisor;

        return combinacoes;
    }

    public static int fatorial(int n){
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }
}
