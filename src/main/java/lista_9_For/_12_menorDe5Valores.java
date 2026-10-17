package lista_9_For;

import java.util.Scanner;

public class _12_menorDe5Valores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero=0,valorMenor=999;
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Digite 5 numero para ter o menor");
                numero = sc.nextInt();
            }while(numero <= -1);
            if(numero<valorMenor){
                valorMenor=numero;
            }
        }
        System.out.println("Esse e o menor numero "+valorMenor);
    }

}
