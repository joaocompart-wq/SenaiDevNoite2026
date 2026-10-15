package listaDeExecicio_8;

import javax.swing.*;
import java.util.ArrayList;

public class _12_MultiplosDe3e5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        int limite;
        String entrada;
        ArrayList<String> lista =new ArrayList<>();
        entrada = JOptionPane.showInputDialog(frame,"Digite o limite do contador");
        limite = Integer.parseInt(entrada);
        for ( int loop = 0; loop < limite; loop++){
            if (loop%3==0&&loop%5==0){
                lista.add(""+loop);

            }

        }
        JOptionPane.showMessageDialog(frame,lista,"resultado",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();

    }
}
