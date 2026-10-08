package lista_4_execicioAlgoritmo;

import javax.swing.*;

public class CalculadorSimples {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        //variaveis
        double numero1,numero2,conta;
        String ent ;
        conta = 0;
        // entrada dos numero
        ent = JOptionPane.showInputDialog(frame,"Digite um numero para calcular");
        numero1= Double.parseDouble(ent);
        ent = JOptionPane.showInputDialog(frame,"Digite um numero para calcular");
        numero2= Double.parseDouble(ent);
        ent = JOptionPane.showInputDialog(frame,"Qual tipo de calculo voce quer fazer");

        if (ent.equals("*")) {
            conta = numero1*numero2;
         } else if (ent.equals("+")) {
            conta = numero1+numero2;
         } else if (ent.equals("-")) {
            conta = numero1-numero2;
         } else if (ent.equals("/")) {
            conta = numero1/numero2;
         }






        JOptionPane.showMessageDialog(frame,
                "O resultado da conta e :"+conta,
                "resposta",
                JOptionPane.QUESTION_MESSAGE);
    frame.dispose();
    }
}
