package lista_7_EnquantoAlgoritomo;

import javax.swing.*;

public class _10_SomaDeParesEImpares {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        int somaPar=0,somaImpar=0,numero=0;
        String entrada,saidaTexto;
        do {
            do{
                entrada = JOptionPane.showInputDialog(frame, "Digite um numero:");
                numero = Integer.parseInt(entrada);
            }while(numero <= -1);
            if(numero%2==0){somaPar+=numero;
            }else{somaImpar+=numero;}
        }while (numero != 0);
        saidaTexto = String.format("A soma total de pares e de (%d) \n A soma total impares e (%d)",somaPar,somaImpar);
        JOptionPane.showMessageDialog(frame,saidaTexto);
        frame.dispose();
    }
}
