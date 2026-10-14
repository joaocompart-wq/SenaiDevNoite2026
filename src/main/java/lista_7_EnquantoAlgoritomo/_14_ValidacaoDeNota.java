package lista_7_EnquantoAlgoritomo;

import java.util.Scanner;

public class _14_ValidacaoDeNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota=0;
        do {
            System.out.println("Digite a nota de 0 a 10: ");
            nota = sc.nextInt();
        }while(nota <= -1 || nota >10);
        System.out.println("Essa e a nota do aluno: "+nota);
        sc.close();
    }
}
