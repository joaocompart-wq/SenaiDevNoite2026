package lista_7_EnquantoAlgoritomo;

import java.util.Scanner;

public class _16_IntervaloNumerico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero= 1,loop=0;
        while (numero != 0) {
            do {
                System.out.println("digite um numero");
                numero = sc.nextInt();
            }while (numero <= -1);

            if (numero >= 10 && numero <= 50) {
                loop++;
            }
        }

        System.out.println("quantidade de numero dentro do intervalo ("+loop+")");
    }
}
