package lista_9_For;

import java.util.Scanner;

public class _13_ContarNumerosPares {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int contadorPar=0,numero=0,soma=0;
        for (int i = 1; i < 10; i++) {

            do {
                System.out.println("digite um numero");
                numero = sc.nextInt();
            }while(numero <=-1);
            if(numero%2==0){soma+=numero;}
        }
        System.out.println("soma dos pares "+soma );
        sc.close();
    }
}
