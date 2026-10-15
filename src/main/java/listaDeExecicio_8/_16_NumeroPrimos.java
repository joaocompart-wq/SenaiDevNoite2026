package listaDeExecicio_8;

import java.util.Scanner;

public class _16_NumeroPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;

        do {
            System.out.println("Digite um numero para ver se ele e primo");
            numero= sc.nextInt();
            if (numero > -1){
                if (numero%numero==0 && numero%1==0){
                    System.out.printf("Esse numero (%d) e Primo%n",numero);
                }
            }
        }while(numero > -1);

    }
}
