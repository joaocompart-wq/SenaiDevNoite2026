package Lista_6_Enquanto;

import javax.swing.*;

public class TotalizadorDeCompras {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        String entrada,textoDeSaida;
        int somas,numeroEnt,loop;
        somas=0;numeroEnt=1;loop=0;

        while (numeroEnt != 0){
            entrada = JOptionPane.showInputDialog(frame,"Digite um valor numerico para ser somado \n Digite 0 para finalizar");
            numeroEnt = Integer.parseInt(entrada);
            somas += numeroEnt;
            loop++;
        }
        textoDeSaida = String.format("total da soma (%d) \n quantidade de valor somados (%d)",somas,loop);

        JOptionPane.showMessageDialog(frame,textoDeSaida);

        frame.dispose();


    }
}
