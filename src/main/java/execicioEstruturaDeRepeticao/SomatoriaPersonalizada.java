package execicioEstruturaDeRepeticao;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class SomatoriaPersonalizada {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        int numeroLimite ,contador,soma;
        contador = 0; numeroLimite = 0;soma = 0;
        String entrada,textoSaida;

        ArrayList somas1 = new ArrayList(0);

        entrada = JOptionPane.showInputDialog("Digite o numero da limite: ");
        numeroLimite = Integer.parseInt(entrada);

        while(contador < numeroLimite){
            contador++;
            soma += contador;
            somas1.add(""+soma);
        }

        textoSaida = ("todas as somas:"+somas1+"\n numero limite do contador :"+numeroLimite+"\n somatoria final :"+soma);

    JOptionPane.showMessageDialog(frame,""+textoSaida,"resutado",JOptionPane.INFORMATION_MESSAGE);
    frame.dispose();
    }
}
