package lista_7_EnquantoAlgoritomo;

import java.util.Scanner;

public class ContadorDeMultiploDe5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador=0,numero=1,contadorResto=0;
        String saida;

        do {
            System.out.println("digite um numero");
            numero = sc.nextInt();
            if (numero == 0){//avança
            } else if (numero%5==0) {
                contador++;
            }
        } while (numero != 0);

        saida=String.format("numeros multiplos de 5 \n (%d)",contador);
        System.out.printf(saida);
    }
}
