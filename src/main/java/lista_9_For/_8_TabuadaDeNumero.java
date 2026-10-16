package lista_9_For;

import java.util.Scanner;

public class _8_TabuadaDeNumero {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int calculo=0;
        System.out.println("Digiteum numero para obiter um tabuada");
        int numero = sc.nextInt();
        sc.close();
        for (int i = 1; i < 10+1; i++) {
            calculo = numero*i;
            System.out.println(""+numero+"*"+i+"="+calculo);

        }
    }
}
