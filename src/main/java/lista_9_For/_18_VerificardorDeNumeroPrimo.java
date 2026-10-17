package lista_9_For;

import java.util.Scanner;

public class _18_VerificardorDeNumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("digite um numero para verificar um numero primo");
            numero = sc.nextInt();
        }while (numero <= -1);
        for (int i = 1; i < numero; i++) {

            if (i%i==0 && (i == 2 || !(i%2==0))&& !(i==1)) {
                System.out.println("Esse numero ("+i+") e Primo");
            }
        }
        sc.close();
    }
}
