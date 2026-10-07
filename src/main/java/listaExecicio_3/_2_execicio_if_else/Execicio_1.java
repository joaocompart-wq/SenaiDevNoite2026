package listaExecicio_3._2_execicio_if_else;

import javax.swing.*;
import java.util.Locale;

public class Execicio_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double ValorParaDesconto1 = 5;
        double ValorParaDesconto2 = 10;
        double ValorParaDesconto3 = 15;
        double calculo = 0;
        double descA = 0 ;

        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
       String texto = JOptionPane.showInputDialog(frame,"digite o valor da compra");
       int entB = Integer.parseInt(texto);
        double ent = (double) entB;
       if (ent <= 199) {
            calculo = ent*(ValorParaDesconto1/100);
           descA = ValorParaDesconto1;
       }else if (ent >=200 && ent <= 499) {
           calculo = ent*(ValorParaDesconto2/100);
           descA = ValorParaDesconto2;
       }else if (ent >= 500 ) {
           calculo = ent*(ValorParaDesconto3/100);
           descA = ValorParaDesconto3;
       }


       double entA = ent-calculo;

        javax.swing.JOptionPane.showMessageDialog(frame,
                "O valor da compra foi \n R$:"+ent+"\n A porcentagem do desconto e\n:%"+descA+"\n O valor do desconto foi \n R$:"+calculo,
                "Resposta do execicio",
                JOptionPane.QUESTION_MESSAGE);
        System.exit(1);
    }
}
