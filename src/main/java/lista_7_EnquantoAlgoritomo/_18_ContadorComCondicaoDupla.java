package lista_7_EnquantoAlgoritomo;

import java.util.Scanner;

public class _18_ContadorComCondicaoDupla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop20=0,loop50=0,loopV=0;

        for (int loop =10; loop > 0; loop--) {
            System.out.println("digite um numero ("+loop+"):");
            int numero = sc.nextInt();
            if (numero < 20) {
                loop20++;
            } else if (numero >50) {
                loop50 ++;
            }else {loopV++;}

        }
        System.out.printf("quantidade de numero menores de 20 (%d) \n numero maiores de 50 (%d) \n numero entre 20 a 50 (%d)", loop20, loop50, loopV);
        sc.close();

    }


}
