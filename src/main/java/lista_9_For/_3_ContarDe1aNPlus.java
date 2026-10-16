package lista_9_For;

import javax.swing.*;

public class _3_ContarDe1aNPlus {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        String entrada;
        int numero =1,limite=0,loop5=0,loop2=0,loop1=0;
        entrada = JOptionPane.showInputDialog(frame,"Digite o limite de contagem");
        limite = Integer.parseInt(entrada);
        while (numero <= limite) {
            if ((numero+4) <= limite) {
                numero+=4;loop5++;
            } else if ((numero+2) <= limite) {
                numero+=2;loop2++;
            }else{numero++;loop1++;}

        }
        JOptionPane.showMessageDialog(frame,"numero de loop para contar de 1 a"+limite+" forâo usados\n 4+ :"+loop5+"\n 2+ :"+loop2+"\n 1+ :"+loop1);
        frame.dispose();
    }
}
