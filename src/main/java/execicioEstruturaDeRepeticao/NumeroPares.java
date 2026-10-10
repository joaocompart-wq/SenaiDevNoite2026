package execicioEstruturaDeRepeticao;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class NumeroPares {
    public static void main(String[] args) {
    Frame frame = new Frame();
    frame.setAlwaysOnTop(true);
        ArrayList<String> pares = new ArrayList<String>();
        int numeroLimite ,loop;
    String saidaTexto,entrada;

    entrada = JOptionPane.showInputDialog(frame,"digite o numero limite para para  o programa");
    numeroLimite = Integer.parseInt(entrada);

    for (int i=0; i<numeroLimite; i++){
        if (i%2==0){
            pares.add(""+i);
        }
    }
    JOptionPane.showMessageDialog(frame,"Esse sao os numeros pares \n"+pares,"resultado",JOptionPane.QUESTION_MESSAGE);



    }
}
