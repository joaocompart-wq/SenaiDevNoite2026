package listaDeExecicio_8;

import java.util.Scanner;

public class _13_ContadorDeMultiplos {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int numero,loop=0;

        for (int i = 15; i > 0 ; i--) {
            System.out.println("Digite um numero");
            numero = sc.nextInt();

            if (numero%4==0){
                loop++;
                System.out.println("multiplo de 4 :"+numero);
            }

        }
        System.out.println("quantidade de numeros digitados mutiplos de 4 :"+loop);
    }
}
