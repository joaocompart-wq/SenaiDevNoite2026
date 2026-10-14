package lista_7_EnquantoAlgoritomo;

import java.util.Scanner;

public class VerificadorDeInterval_9_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=1,contador=0,intervaloMenor=20,intervaloMaior=80;

        do {
            do {
                System.out.print("Digite um numero:");
                numero = sc.nextInt();
            }while(numero <= -1);
            if(numero>intervaloMenor && numero<intervaloMaior) {
                contador++;
            }

        } while (numero != 0);

        System.out.printf("quantidade de numero dentro do itervalo %d a %d e de (%d)",intervaloMenor,intervaloMaior,contador);
        sc.close();
    }
}
