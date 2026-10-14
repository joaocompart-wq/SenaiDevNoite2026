package lista_7_EnquantoAlgoritomo;

import java.util.Scanner;

public class _13_SomaAcumuladaComContador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=1,contador=0,soma=0,media=0;
        do {
            do{
                System.out.println("digite um numero: \n Digite zero para finalizar");
                numero = sc.nextInt();
            }while(numero <= -1);
            if (numero != 0){
                soma = soma + numero;
                contador++;
            }
        } while (numero !=0);
        media = soma/contador;
        System.out.printf("Quantidade de leitura de numeros validos (%d) \n total da soma (%d) \n media (%d)", contador, soma, media);
        sc.close();
    }
}
