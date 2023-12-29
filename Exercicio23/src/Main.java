import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(); // cria uma lista de números inteiros

        do{ // enquanto o usuário quiser digitar mais números
            lista.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"))); // adiciona o número à lista
        }while (JOptionPane.showConfirmDialog(null, "Deseja digitar mais um número?") == JOptionPane.YES_OPTION);

            //JOptionPane.showConfirmDialog retorna 0 se o usuário clicar em "Sim" e 1 se clicar em "Não"
        JOptionPane.showMessageDialog(null, "A média dos números pares é: " + Conta.mediaPares(lista));
        // exibe a média dos números pares
    }
}