package lista_4_execicioAlgoritmo;

import javax.swing.*;

public class Multiplos7e11 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        int entNumero,multiplicador1,multiplicador2;
        multiplicador2 = 11;
        multiplicador1 = 7;
        entNumero = 0;
        String textoSaida , ent;
        textoSaida ="";
        ent = "";

        ent = JOptionPane.showInputDialog(frame,"Digite um numero para verificar se e mutiplo "+multiplicador1+" ou "+multiplicador2);
        entNumero = Integer.parseInt(ent);

        int calculo1 = entNumero%multiplicador1;
        int calculo2 = entNumero%multiplicador2;

        if (calculo1 == 0){
            textoSaida = String.format("Esse numero (%d) e multiplo de (%d) ",entNumero,multiplicador1);
        } else if (calculo2 == 0) {
            textoSaida = String.format("Esse numero (%d) e multiplo de (%d) ",entNumero,multiplicador2);
        }else {
            textoSaida = String.format("Esse numero (%d) nao e multiplo de (%d) e (%d)",entNumero,multiplicador1,multiplicador2);
        }
    JOptionPane.showMessageDialog(frame,
            ""+textoSaida,
            "resultado",
            JOptionPane.QUESTION_MESSAGE);
        frame.dispose();

    }
}
