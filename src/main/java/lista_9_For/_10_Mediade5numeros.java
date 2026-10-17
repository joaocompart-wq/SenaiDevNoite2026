package lista_9_For;

import javax.swing.*;

public class _10_Mediade5numeros {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        String entrada,saida;
        int numero=0,soma=0,calculo=0,i;
        for (i = 0; i < 5; i++) {
            do {
                entrada=JOptionPane.showInputDialog("Digite um numero: ");
                numero=Integer.parseInt(entrada);
            }while(numero <= -1);

            calculo=soma+numero;
            System.out.printf("%d+%d=%d%n",numero,soma,calculo);
            soma = calculo;
        }
        int media =soma/i;
        saida=String.format("A media dos (%d) e de >:(%d)",i,media);
        JOptionPane.showMessageDialog(frame,saida,"A media de :"+i,JOptionPane.PLAIN_MESSAGE);
        frame.dispose();
    }


}
