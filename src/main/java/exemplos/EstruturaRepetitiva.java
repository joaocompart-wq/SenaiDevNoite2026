package exemplos;

import java.util.Scanner;

public class EstruturaRepetitiva {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();// estrutura de repeticao
        int soma = 0;
        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }
        System.out.print(soma);
        sc.close();
    }
}
