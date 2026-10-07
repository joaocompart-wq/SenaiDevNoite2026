package lista_4_execicioAlgoritmo;

import javax.swing.*;

public class TiposTriangulos_3_ {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        //variaveis
        String textoSaida = "" ;
        String ent;
        //Entrada de informacao
        ent = JOptionPane.showInputDialog(frame,"Digite o lado1");
        int lado1 = Integer.parseInt(ent);
        ent = JOptionPane.showInputDialog(frame,"Digite o lado2");
        int lado2 = Integer.parseInt(ent);
        ent = JOptionPane.showInputDialog(frame,"Digite o lado3");
        int lado3 = Integer.parseInt(ent);
        //verificar se Equilátero
        if (lado1 == lado2 && lado1 == lado3) {
            textoSaida = "Esse trinangulo e Equilátero";
        }else if (lado2 == lado3 && lado2 == lado1) {
            textoSaida = "Esse trinangulo e Equilátero";
        } else if (lado3 == lado1 & lado3 == lado2) {
            textoSaida = "Esse trinangulo e Equilátero";
        }
//verificar se Isósceles
        if (lado1 == lado2 && lado1 != lado3) {
            textoSaida = "Esse trinangulo e Isósceles";
        } else if (lado2 == lado3 && lado3 != lado1) {
            textoSaida = "Esse trinangulo e Isósceles";
        } else if (lado3 == lado1 && lado1 != lado2) {
            textoSaida = "Esse trinangulo e Isósceles";
        }
//verificar se Escaleno
        if (lado3 != lado2 && lado2 != lado1) {
            textoSaida = "Esse trinangulo e Escaleno";
        }

        JOptionPane.showMessageDialog(frame,
                ""+textoSaida,
                "resultado",
                 JOptionPane.QUESTION_MESSAGE);
        frame.dispose();

    }
}
