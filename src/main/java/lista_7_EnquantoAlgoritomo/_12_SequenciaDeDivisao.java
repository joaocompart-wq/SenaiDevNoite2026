package lista_7_EnquantoAlgoritomo;

import java.util.Scanner;

public class _12_SequenciaDeDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor=2,numeroParaDividir=0,calculo=0,loop=0;
do{
    System.out.println("Digite um numero:");
    numeroParaDividir = sc.nextInt();
    if (numeroParaDividir <= -1 || numeroParaDividir ==1) {
        System.out.println("!Erro! \n numero invalido");
    }
}while (numeroParaDividir <= -1 || numeroParaDividir ==1);
        do {

            loop++;
            calculo = numeroParaDividir/divisor;
            System.out.println(""+numeroParaDividir+"/"+divisor+" = "+calculo);
            numeroParaDividir=calculo;

        }while(numeroParaDividir>1);

        System.out.printf("Numero de divisao foram de (%d)",loop);
        sc.close();
    }
}
