package Lista_6_Enquanto;

import javax.swing.*;

public class ContagemDeNegativo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contagem de Negativo");
        frame.setAlwaysOnTop(true);
        int valorLoop,numero,contadorPositivo,contadorNegativo;
        valorLoop=10;numero=0;contadorPositivo=0;contadorNegativo=0;
        String entrada,saida;
        while( valorLoop > 0){
            entrada= JOptionPane.showInputDialog(frame,"Digite um valor ate o contador chegar a zero (:"+valorLoop+")");
            numero = Integer.parseInt(entrada);
            valorLoop--;
            if( numero > 0){
                contadorPositivo++;
            }else{
                contadorNegativo++;
            }

        }

        JOptionPane.showMessageDialog(frame,"A quantidade de numero positivos :"+contadorPositivo+"\n A qauntidade de numeros negativos :"+contadorNegativo,"resultado",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();
    }
}
