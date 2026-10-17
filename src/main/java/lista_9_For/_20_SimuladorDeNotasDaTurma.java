package lista_9_For;


import java.util.Scanner;

public class _20_SimuladorDeNotasDaTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota,contadorPass=0,contadorNot=0;
        for (int i = 0; i < 10; i++) {
            do {
                System.out.print(i+": Aluno \n Digite uma nota para cada aluno %n");
                nota = sc.nextInt();
            }while(nota<0 || nota>10);
            if (nota>=7) {
                System.out.printf("O aluno %d passou com a nota: %d%n",i,nota);
                contadorPass++;
            }else {
                System.out.printf("O aluno %d nao passou com a nota: %d%n",i,nota);
                contadorNot++;
            }
        }
        System.out.println("==========Resultado=========");
        System.out.printf("""
                quantidades de alunos que passarao :%d
                Quantidade de alunos que nao passarao :%d
                """, contadorPass, contadorNot);
    }
}
