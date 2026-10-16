package lista_9_For;

import javax.swing.*;

public class _2_ContarDe10a1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        int valorInicial = 0;
        String entrada;
        entrada = JOptionPane.showInputDialog(frame, "Digite o valor inicial da contagem regresiva");
        valorInicial = Integer.parseInt(entrada);
        for (int i = valorInicial; i > 0; i--) {
            JOptionPane.showMessageDialog(frame, i);
        }
frame.dispose();
    }
}
