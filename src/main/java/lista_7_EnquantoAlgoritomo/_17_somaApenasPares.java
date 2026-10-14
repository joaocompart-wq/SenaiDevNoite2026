package lista_7_EnquantoAlgoritomo;

import java.util.Scanner;

public class _17_somaApenasPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma=0,numero;

        do {
            System.out.println("Digite  um numero");
            numero = sc.nextInt();

            if (numero%2==0){
                soma+=numero;
            }
        } while (numero !=0);
        System.out.println("total da soma: "+soma);
        sc.close();
    }

}
