public class Cubo {
    public static boolean perfeito(int n){
        /*Implemente um programa que determine se um número é um cubo perfeito.*/

        boolean cuboPerfeito = false;   // cria uma variável de controle e assume que não é cubo perfeito

        for (int i = 1; i <= n; i++) {  // percorre todos os números até n
            if (i * i * i == n) {    // se o número atual elevado ao cubo for igual a n é um cubo perfeito
                cuboPerfeito = true;
                break;
            }
        }      //se não for cubo perfeito, a variável de controle continua com o valor inicial (false)

        return cuboPerfeito;
    }
}
