package execicioEstruturaDeRepeticao;

import javax.swing.*;
import java.util.ArrayList;

public class SomaDePares {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Soma de Pares");
        frame.setAlwaysOnTop(true);

        int somatoria,contador,limite,calculo;
        somatoria=0;limite=50;contador=0;
        String textoSaida,entrada;

        entrada=JOptionPane.showInputDialog(frame,"Digite o valor maximo do contador");
        limite=Integer.parseInt(entrada);

        ArrayList<String> soma = new ArrayList<String>();

    for (contador = 0; contador < limite; contador++){
        if (contador%2==0){
            somatoria += contador;
            calculo = somatoria + contador;
            soma.add(""+somatoria+"+"+contador+"="+calculo+"\n");
        }
    }
    textoSaida = String.format("total da somatoria de par (%d) \n todas as somadorias %s" ,somatoria,soma);

    JOptionPane.showMessageDialog(frame,textoSaida,"resutado",JOptionPane.INFORMATION_MESSAGE);
    frame.dispose();
    }
}
