package lista_7_EnquantoAlgoritomo;

import java.util.Scanner;

public class _19_MediaCondiciona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada=0,soma=0,loop=0,media=0;

        do {
            System.out.println("Digite um numero");
            entrada = sc.nextInt();
            if (entrada >= 100){
                soma+=entrada;
                loop++;
            }
        }while(entrada != 0);
        media = soma/loop;
        System.out.printf("total da soma de maiores de 100 (%d) \n total de numeros digitados (%d) \n media (%d)",soma,loop,media);
        sc.close();
    }
}
