package lista_9_For;

public class _19_ContagemRegressiva {
    public static void main(String[] args) {
        int contagem = 10;
        System.out.println("Preparando para o lancamento");
        for (int i = contagem; i > 0; i--) {
            System.out.println(i);
            if (i <= 1) {
                System.out.println("Lançamento autorizado!");
            }
        }
    }
}
