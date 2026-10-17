package lista_9_For;

import java.util.Scanner;

public class _14_SomarApenasNumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0,soma=0;
        for (int i = 1; i < 6; i++) {
            do {
            System.out.println("digite um valor numerico positivo");
            numero = sc.nextInt();}while(numero>=-1);
            if(numero>= -1){
                System.out.println("Tente movamente");
            }
            if(numero < -1){
                soma+=numero;
            }

            
        }
        System.out.println("resultado da soma de numeros positivos :"+soma);
        sc.close();
    }
}
