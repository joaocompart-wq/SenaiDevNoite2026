package Lista_6_Enquanto;

import javax.swing.*;
import java.util.ArrayList;

public class SequenciaDeQuadrados {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
double resultado;
        int elevado=2,numeroLimite=15;
        ArrayList<String> lista = new ArrayList<>();
        String saida;

        for (int i = 1; i <= numeroLimite; i++) {
            resultado = Math.pow(elevado,i);
            lista.add(""+elevado+"^"+i+"="+resultado+"\n");
        }

        JOptionPane.showMessageDialog(frame,lista,"Saida do resultados",JOptionPane.INFORMATION_MESSAGE);
        frame.dispose();
    }

}
