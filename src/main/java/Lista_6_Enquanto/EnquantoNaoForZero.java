package Lista_6_Enquanto;
//Peça números ao usuário continuamente. A repetição
//só deve parar quando ele digitar o número 0.
import javax.swing.*;

public class EnquantoNaoForZero {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        int numero,loop;
        numero=1;loop=0;
        String entrada,saida;

        while(numero != 0) {
            loop++;
            entrada = JOptionPane.showInputDialog("Digite um numero: \n Digite zero para terminar o programa");
            numero = Integer.parseInt(entrada);
        }
        saida =String.format("Quantidade de numeros que forão digitados :"+loop);
        JOptionPane.showMessageDialog(frame,saida);
frame.dispose();
    }
}
