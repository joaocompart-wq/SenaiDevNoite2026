package Lista_6_Enquanto;

import javax.swing.*;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        double cidadeA,cidadeB,cidadeC;
        cidadeA= 1000; cidadeB= 1500;
        double aumentoDePopulacao;
        aumentoDePopulacao=0;
        int anos=0;
        String saida;

        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        while(cidadeA <= cidadeB){

            aumentoDePopulacao= cidadeA*0.02;
            cidadeA= cidadeA+aumentoDePopulacao;

            aumentoDePopulacao= cidadeB*0.01;
            cidadeB= cidadeB+aumentoDePopulacao;

            anos++;


        }
        saida = String.format("Numero de anos para a cidadeA chegar perto da cidadeB :%d Anos \n populacao da cidadeA %.0f \n populacao da cidadeB %.0f",anos,cidadeA,cidadeB);
        JOptionPane.showMessageDialog(frame,saida);
        frame.dispose();
    }
}
