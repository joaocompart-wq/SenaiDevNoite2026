package lista_4_execicioAlgoritmo;

import javax.swing.*;

public class SignoZodiacal {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setAlwaysOnTop(true);

        String ent,textoSaida;
        int mes,dia;
        mes = 0;dia =0;

        ent = JOptionPane.showInputDialog(frame,"Digite seu dia de nacimento");
        dia = Integer.parseInt(ent);
        ent = JOptionPane.showInputDialog(frame,"Digite seu mes de nacimento");
        mes = Integer.parseInt(ent);

        if (mes == 03 && dia <= 21) { textoSaida =String.format("voce e de Ares (%d|%d)",mes,dia);
        } else if (mes == 04 && dia <= 19) {textoSaida =String.format("voce e de Ares (%d|%d)",mes,dia);
        }else {textoSaida =String.format("voce nao e de Ares (%d|%d)",mes,dia);
        }

        JOptionPane.showMessageDialog(frame,
                ""+textoSaida,
                "Saida final",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();





    }
}
