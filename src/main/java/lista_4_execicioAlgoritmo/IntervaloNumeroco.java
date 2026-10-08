package lista_4_execicioAlgoritmo;

import javax.swing.*;

public class IntervaloNumeroco {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setAlwaysOnTop(true);

        int numeroMax,numeroMin,numeroEnt;
        numeroMin = 100;
        numeroMax = 200;
        String textoSaida ="";
        String ent = JOptionPane.showInputDialog(frame,"Digite um numero?");
        numeroEnt = Integer.parseInt(ent);

        if (numeroEnt >= numeroMin && numeroEnt <= numeroMax) {
        textoSaida = String.format("Seu numero esta detro do escopo (%d) A (%d e seu numero e (%d))",numeroMin,numeroMax,numeroEnt);
        } else if (numeroEnt < numeroMin) {
            textoSaida = String.format("Seu numero e menor que o numero Minimo seu numero e (%d)",numeroEnt);
        } else if (numeroEnt > numeroMax) {
            textoSaida = String.format("Seu numero e Maior que o numero Maximo seu numero e (%d)", numeroEnt);
        }
            JOptionPane.showMessageDialog(frame,""+textoSaida,"resultado",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();


    }
}
