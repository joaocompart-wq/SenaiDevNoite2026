package lista_4_execicioAlgoritmo;

import javax.swing.*;

public class LogicaParImparVSMaginitude{
public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setAlwaysOnTop(true);

    String textoSaida ,ent;
    textoSaida = ""; ent = "";
    int numeroLimite,numeroEnt,loop,m,par;
    numeroLimite = 100; numeroEnt=0; loop = 0;m=0;
    while (loop < 1) {
        ent = JOptionPane.showInputDialog(frame, "digite um numero aleatorio");
        numeroEnt = Integer.parseInt(ent);
        m =(numeroEnt < 0)? loop -= 1: loop++;
    }
    par = numeroEnt%2;

    if (numeroEnt < 100 ) {
        if (par == 0) {textoSaida = String.format("O numero (%d) e  par menor que o numero limite",numeroEnt);
        }else{textoSaida = String.format("O numero (%d) e impar e menor que o numero limite",numeroEnt);}
    }else if (numeroEnt > 100) {
        if (par == 0) {textoSaida = String.format("Numero (%d) e maior e par que o numero limite",numeroEnt);
        } else {textoSaida = String.format("numero (%d) e maior e impar que o numero limite",numeroEnt);}
    }else {textoSaida = String.format("voce acertou o numero (%d)",numeroEnt);}

    JOptionPane.showMessageDialog(frame,""+textoSaida,"Saida do execicio",JOptionPane.QUESTION_MESSAGE);
    frame.dispose();

}
}
