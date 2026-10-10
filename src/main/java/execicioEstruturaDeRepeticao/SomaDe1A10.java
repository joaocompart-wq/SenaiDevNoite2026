package execicioEstruturaDeRepeticao;

import javax.swing.*;
import java.util.ArrayList;

public class SomaDe1A10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        int contador, numeroLimite, soma;
        contador = 0; numeroLimite = 0; soma=0;
        ArrayList<String>somas = new ArrayList<>();

        while (contador < 10) {
            contador++;
            soma = soma + contador;
            somas.add(soma+"");
            }

        JOptionPane.showMessageDialog(frame,"todas as somas"+somas+"\n soma final:"+soma,"resultado",JOptionPane.INFORMATION_MESSAGE);
        frame.dispose();
    }
}
