package lista_7_EnquantoAlgoritomo;

import java.util.Scanner;

public class SomaMultiplos3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero=1 , multiplicador=3, soma=0,loop=0;

        while(numero != 0){
            System.out.println("digite um numero para ver se e multiplo de "+multiplicador);
            numero = sc.nextInt();
            if (numero%multiplicador == 0){soma+=numero;
                System.out.println(numero);
            }else{}
            loop++;
        }
        sc.close();
        System.out.printf("O numero de vezes que valores numericos foram digitado (%d) \n resultado da somatoria (%d)",loop,soma);

    }
}
