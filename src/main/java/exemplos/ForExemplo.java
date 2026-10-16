package exemplos;

import java.util.Scanner;

public class ForExemplo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite 5 numeros");
        System.out.println("1° Número:");
        int entradaMenor = sc.nextInt();
        for (int i=2;i<=5;i++) {
            System.out.println(i+"Número:");
            int entradaAtual = sc.nextInt();
            if (entradaAtual < entradaMenor){
                entradaMenor =entradaAtual;
            }
        }
        System.out.println("O menor número é: "+entradaMenor);
        sc.close();
    }
}
