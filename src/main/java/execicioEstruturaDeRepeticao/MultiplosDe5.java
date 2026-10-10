package execicioEstruturaDeRepeticao;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Locale;

public class MultiplosDe5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        ArrayList<String> mult = new ArrayList<>();
        String entrada;
        int multiplicador , numeroLimite ,saida;

        entrada = JOptionPane.showInputDialog(frame,"Digite um multiplicador");
        multiplicador = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog(frame,"Digite um numero limite");
        numeroLimite = Integer.parseInt(entrada);

        for (int loop=0; loop < numeroLimite;loop++) {
            if (loop%multiplicador==0){
                mult.add(""" 
                        """+loop);
            }
        }
        JOptionPane.showMessageDialog(frame, """
                """+mult , "todos os multiplos",JOptionPane.INFORMATION_MESSAGE);
        frame.dispose();
    }
}
