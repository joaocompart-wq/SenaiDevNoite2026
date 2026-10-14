package lista_7_EnquantoAlgoritomo;

import javax.swing.*;
import java.util.ArrayList;

public class DobroDoValor_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        ArrayList<String> lista = new ArrayList<>();
        int numero=1,dobro=2;
        String entrada , saida;


        while (numero != 0) {
            do {
                entrada = JOptionPane.showInputDialog(frame,"digite um valor numerico positivo");
                numero = Integer.parseInt(entrada);
            } while (numero < 0);

            int resultado = numero*dobro;
            lista.add(""+numero+"×"+dobro+"="+resultado+"\n");
            System.out.println(""+numero+"×"+dobro+"="+resultado);

        }
        JOptionPane.showMessageDialog(frame,lista,"lista dos dobros de um numero",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();
    }
}
