package lista_4_execicioAlgoritmo;

import javax.swing.*;

public class MaiorDeTres_1 {
    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        int loop = 1;
        int maior = 0;
        while (loop <= 3) {
            loop++;
            String ent = JOptionPane.showInputDialog(frame, "digite um numero para ver qual e maior");
            int numero = Integer.parseInt(ent);

            if (numero > maior) {
                maior = numero;
            }

        }

        javax.swing.JOptionPane.showMessageDialog(frame,
                "O maior numero e :"+maior,
                "Resultado",
                JOptionPane.QUESTION_MESSAGE);
    }
}
