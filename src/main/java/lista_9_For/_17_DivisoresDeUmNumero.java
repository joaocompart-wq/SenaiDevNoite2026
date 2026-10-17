package lista_9_For;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _17_DivisoresDeUmNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        System.out.println("Digite um numero para ver o seus divisores");
        numero = sc.nextInt();
        System.out.println("======Resultado=====");
        for (int i = 1; i < 10; i++) {
            if(numero%i==0) {

                System.out.println("Esse sao o divisores desse numero ("+numero+") e :"+i);
            }

        }
        sc.close();
    }
}
