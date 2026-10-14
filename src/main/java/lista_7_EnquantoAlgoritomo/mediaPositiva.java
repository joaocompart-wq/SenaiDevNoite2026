package lista_7_EnquantoAlgoritomo;

import java.util.Scanner;

public class mediaPositiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero =0,soma=0 ,loop=0;
        String saidaTexto;

        do{
            System.out.println("digite um numero para somar positivos");
            numero = sc.nextInt();
            if (numero >= 0) {soma += numero;
                loop++;
            }else{}

        }while (numero >= 0);
        sc.close();
        int media = soma/loop;
        System.out.printf("Total da soma (%d) \n media da soma (%d)",soma,media);
    }
}
