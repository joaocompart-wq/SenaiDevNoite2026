package listaDeExecicio_8;

import java.util.Scanner;

public class _15_VerificadoDeDivisibilidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,divisor=0,contadorDivisiveis,contadorNaoDivisiveis;
        while(divisor > -1){
            contadorDivisiveis=0;
            contadorNaoDivisiveis=0;
            System.out.println("digite o divisor \n Digite um numero negativo para sair");
            divisor= sc.nextInt();
            do {
                System.out.println("Digite um numero para decidir se e divisivel por ("+divisor+")\n Digite um numero negativo para escolher outro divisor");
                numero= sc.nextInt();
                if (numero%divisor==0){
                    contadorDivisiveis++;
                    System.out.printf("O numero (%d) e divisivel por (%d)%n",numero,divisor);
                }else{contadorNaoDivisiveis++;
                    System.out.printf("O numero (%d) Não é divisivel por (%d)%n",numero,divisor);}

            } while(numero > -1);
            System.out.printf("""
               Quasntidade de numero divisiveis por (%d) e de: (%d)
               
               Quantidade de numero que nao sao divisiveis por(%d) e de: (%d)
                """,divisor,contadorDivisiveis,divisor,contadorNaoDivisiveis);
        }




        sc.close();
    }
}
