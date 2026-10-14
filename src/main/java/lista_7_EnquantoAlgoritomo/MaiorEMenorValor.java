package lista_7_EnquantoAlgoritomo;

import javax.swing.*;

public class MaiorEMenorValor {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        int maior=0,menor=999,numero = 0;
        String entrada , saida;

        do {
            entrada =JOptionPane.showInputDialog(frame,"Digite um valor numerico");
            numero = Integer.parseInt(entrada);

            if (numero <= -1) {

            }else if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }else{}


        } while (numero >= 0);

        saida = String.format("O maior numero (%d) \n O menor numero (%d)",maior,menor);

        JOptionPane.showMessageDialog(frame,saida,"Saida do programa",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();
    }
}
