package lista_4_execicioAlgoritmo;

import javax.swing.*;

public class NumeroMagico_13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        String numeroEnt,textosaida;
        numeroEnt="";textosaida = "";
        int numero ,quantDeNumero,parte1,part2,soma,mult;
        quantDeNumero=0; soma = 0;
        numero=0;

    while (quantDeNumero != 4) {
        numeroEnt = JOptionPane.showInputDialog(frame,"digite um numero com 4 digitos");
        quantDeNumero = numeroEnt.length();}

        numero = Integer.parseInt(numeroEnt);
        parte1 = numero/100;
        part2 = numero%100;

        soma = (parte1+part2);
        mult = (soma * soma);

        if (mult == numero) {
            textosaida = String.format("Esse numero e magico (%d)",numero);
        }else {
            textosaida = String.format("Esse numero nao e magico (%d)",numero);
        }

        JOptionPane.showMessageDialog(frame,""+textosaida,"saida",JOptionPane.QUESTION_MESSAGE);
frame.dispose();




        ;




    }
}
