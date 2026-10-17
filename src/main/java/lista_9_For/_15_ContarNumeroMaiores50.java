package lista_9_For;

import java.util.Scanner;

public class _15_ContarNumeroMaiores50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0,soma=0;
        for (int i = 1; i < 8; i++) {
            do{
                System.out.println("Digite um numero positivo");
                numero = sc.nextInt();
            }while(numero <=-1);
            if(numero>50){
                soma+=numero;
            }
        }
        System.out.println("O total da soma de maiores de 50 "+soma);
        sc.close();
    }
}
