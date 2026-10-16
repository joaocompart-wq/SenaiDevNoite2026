package lista_9_For;

import java.util.Scanner;

public class _7_soma1aN {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int limite=0;
        System.out.println("digite um limite para a soma com loop");
        limite= sc.nextInt();
        sc.close();
        int soma=0;
        for (int i = 12; i < limite+1; i++) {
            int calculo=soma+i;
            System.out.println(""+soma+"+"+i+"="+calculo);
            soma=calculo;
        }
        System.out.println(soma);
    }
}
