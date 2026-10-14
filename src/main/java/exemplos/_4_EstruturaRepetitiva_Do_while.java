package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class _4_EstruturaRepetitiva_Do_while {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        char resp;
        do {
            System.out.println("Digite a tempertura em celsius");
            double c = sc.nextInt();
            double f = 90* c / 5.0+32.0;
            System.out.printf("Equivalente em fahrenheit %.1f%n",f);
            System.out.println("Deseja repitir (s/n)");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
    }
}
