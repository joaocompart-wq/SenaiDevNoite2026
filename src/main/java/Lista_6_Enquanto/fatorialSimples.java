package Lista_6_Enquanto;

import javax.swing.*;
import java.util.ArrayList;

public class fatorialSimples {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        int numero;
        long fatorial;
        fatorial=1;
        String entrada,textoSaida;
        ArrayList<String> listafatorial =  new ArrayList<>();

        entrada = JOptionPane.showInputDialog(frame,"Digite um numero para saber seu fatorial");
        numero = Integer.parseInt(entrada);

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
            System.out.println(fatorial);
            listafatorial.add(""+fatorial+"\n");
        }

        JOptionPane.showMessageDialog(frame,"Fatorial de \n"+listafatorial);
        frame.dispose();
    }
}
