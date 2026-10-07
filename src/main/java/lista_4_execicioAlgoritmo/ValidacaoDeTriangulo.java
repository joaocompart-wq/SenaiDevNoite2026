package lista_4_execicioAlgoritmo;

import javax.swing.*;

public class ValidacaoDeTriangulo {
    public static void main(String[] args) {
        javax.swing.JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
String texto ="";
        String ent = JOptionPane.showInputDialog(frame,"Digite os lados do triangulo");
        int lado1 = Integer.parseInt(ent);
         ent = JOptionPane.showInputDialog(frame,"Digite os lados do triangulo");
        int lado2 = Integer.parseInt(ent);
         ent = JOptionPane.showInputDialog(frame,"Digite os lados do triangulo");
        int lado3 = Integer.parseInt(ent);

        if (lado1 > (lado2+lado3) || lado2 > (lado3+lado3) || lado3 > (lado1+lado2)  ) {
            texto = "E triangulo";
        }else {
            texto = "nao e triangulo";
        }
        javax.swing.JOptionPane.showMessageDialog(frame,
                ""+texto,
                "resultado",
                JOptionPane.QUESTION_MESSAGE);
        System.exit(1);
    }
}
