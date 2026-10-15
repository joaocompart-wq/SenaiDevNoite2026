package listaDeExecicio_8;

import java.util.Scanner;

public class _19_JogoDeAdivinhacao {
    public static void main(String[] args) {
        int numeroSecreto = 33;
        int numero =0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("Digite um numero para adivinhar o numero escodido");
            numero = sc.nextInt();
            if (numero == numeroSecreto) {
                System.out.println("Voce acertou");
            } else if (numero < numeroSecreto) {
                System.out.println("E maior que :"+numero);
            } else if (numero > numeroSecreto) {
                System.out.println("E menor que :"+numero);
            }

        }while (numero != numeroSecreto);
        sc.close();



    }
}
