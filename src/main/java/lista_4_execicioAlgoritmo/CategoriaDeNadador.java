package lista_4_execicioAlgoritmo;

import javax.swing.*;

public class CategoriaDeNadador {
    public static void main(String[] args) {
        int infantil,juvenil,senior,idade;
        infantil = 7;
        juvenil = 17;
        senior = 18;
        String ent,textoSaida;
        textoSaida = "";
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        ent = JOptionPane.showInputDialog(frame,"digite Sua idade");
        idade = Integer.parseInt(ent);
        if (idade <= infantil) {
            textoSaida = "voce vai entra na Liga infatil";
        } else if (idade > infantil && idade <= juvenil) {
            textoSaida = "voce vai entra na Liga juvenil";
        } else if (idade > senior) {
            textoSaida = "voce vai entra na Liga senior";
        }
        JOptionPane.showMessageDialog(frame,""+textoSaida,"resultado",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();
    }
}
