package execicioEstruturaDeRepeticao;

import javax.swing.*;
import java.util.ArrayList;

public class TabuadaFixa {
    public static void main(String[] args) {

        JFrame frame = new JFrame("TabuadaFixa");
        frame.setAlwaysOnTop(true);

        int tabuada,numero,contador;
        tabuada=0;numero=0;
        ArrayList<String> toboadaA = new ArrayList<String>(0);
        String textoSaida,entrada;

        entrada= JOptionPane.showInputDialog(frame,"Digite multiplicador para a tabuada de 1 a 10");
        numero=Integer.parseInt(entrada);

        for (contador = 1; contador <= 10; contador++) {
            tabuada = numero*contador;
            toboadaA.add(""+numero+"*"+contador+"="+tabuada+"\n");
        }
        JOptionPane.showMessageDialog(frame,toboadaA,"Resultado da tabuada",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();
    }
}
