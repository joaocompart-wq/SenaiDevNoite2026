package lista_9_For;

import java.util.Scanner;

public class _16_SequenciaDeFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primeiroTermo=0;
        int segundoTermo=1;
        for (int i = 0; i < 10; i++) {
            System.out.println(""+primeiroTermo);
            int ProximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = ProximoTermo;
        }
        sc.close();
    }
}
