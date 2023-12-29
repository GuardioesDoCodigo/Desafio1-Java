public class Conta {
    public static int Escalar(int[] v1, int[] v2) {
        /*Desenvolva um programa que calcule o produto escalar de dois vetores tridimensionais.*/
        //vetor tridimensional é um vetor com 3 números
        int total = 0;
        for (int i = 0; i < 3; i++) {  // percorre todos os números até n (ambos os vetores devem ter o mesmo tamanho, nesse caso 3
            total += v1[i] * v2[i]; // multiplica os números de mesmo índice e soma ao total
        }
        return total;   // retorna o total

    }


}
