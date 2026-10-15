package listaDeExecicio_8;

import java.util.Scanner;

public class _18_SeparadoDigitosEmCategoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        for (int i=10;i > 0;i--){
                do {
                    System.out.println("Digite um numero");
                    numero = sc.nextInt();
                }while (numero <= -1);
               int calulo = numero%10;
            System.out.printf("Esse numero (%d) tem o final (%d)",numero,calulo);
            }
        sc.close();
    }
}
