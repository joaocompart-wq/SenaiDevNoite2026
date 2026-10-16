package lista_9_For;


import javax.swing.*;


public class _1_ContadorDe1a10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        int limite =0;
       String entrada;

       entrada = JOptionPane.showInputDialog(frame,"Digite o limite da contagem");
       limite = Integer.parseInt(entrada);

       for (int i =0;i <= limite;i++) {
        JOptionPane.showMessageDialog(frame,i);
        }
       frame.dispose();

    }
}
