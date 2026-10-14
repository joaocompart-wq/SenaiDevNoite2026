package lista_7_EnquantoAlgoritomo;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SomaComLimite50 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        Scanner sc = new Scanner(System.in);

        int limite=50,numero=0;
        String saida;
        int soma=0 ;
        do {

            System.out.println("Digite um valor numerico \n digite um numero negativo para finalizar");
            numero= sc.nextInt();
            if (numero <= -1){
            } else if (numero >= limite) {soma+=numero;
                System.out.println(soma);}

        }while(numero >= 0);

        saida = String.format("limite para a soma %d \n total da soma %d",limite,soma);
        JOptionPane.showMessageDialog(frame,saida,"Saida do programa",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();
        sc.close();
    }
}
