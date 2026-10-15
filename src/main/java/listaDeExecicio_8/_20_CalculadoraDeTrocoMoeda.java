package listaDeExecicio_8;

import java.util.Scanner;

public class _20_CalculadoraDeTrocoMoeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  dinheiro,m25=0,m10=0,m5=0,m1=0;
        System.out.print("O valor do troco");
        dinheiro = sc.nextInt();
        do {
            if (dinheiro >= 25){
                m25 = dinheiro/25;
                dinheiro = dinheiro%25;
            } else if (dinheiro >= 10) {
                m10 = dinheiro/10;
                dinheiro = dinheiro%10;
            } else if (dinheiro >= 5) {
                m5 = dinheiro/5;
                dinheiro = dinheiro%5;
            }else if (dinheiro >= 1) {
                m1=dinheiro/1;
                dinheiro = dinheiro%1;
            }
        }while(dinheiro > 0);
        System.out.println("quantidade de moedas necessarias para o troco");
        System.out.println("moedas de 25 :("+m25+")");
        System.out.println("moedas de 10 :("+m10+")");
        System.out.println("moedas de 5 :("+m5+")");
        System.out.println("moedas de 1 :("+m1+")");
        sc.close();

    }
}
