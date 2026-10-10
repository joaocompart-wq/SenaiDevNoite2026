package execicioEstruturaDeRepeticao;

import javax.swing.*;
import java.util.ArrayList;

public class NumerosImpares {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setAlwaysOnTop(true);

        ArrayList<String> impares = new ArrayList<>();
        String entrada;
        int limite;
        entrada = JOptionPane.showInputDialog("Digite um numero limite para saber os impares ");
        limite = Integer.parseInt(entrada);

        for (int loop=0;loop < limite;loop++){
            if (loop%2!=0){
                impares.add(""+loop);}

        }

        JOptionPane.showMessageDialog(frame,"Essse sao os impares \n"+impares,"resultado dos impares",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();
    }
}
