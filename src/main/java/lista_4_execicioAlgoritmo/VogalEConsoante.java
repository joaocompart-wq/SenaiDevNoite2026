package lista_4_execicioAlgoritmo;

import javax.swing.*;
import java.util.Locale;

public class VogalEConsoante {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        String texto,ent,letra;
        letra = "";
        texto = "";
        ent =  "";
        int total;

        ent = JOptionPane.showInputDialog(frame,"Digite um letra para ver se e um consoante");
        total = letra.length();
    //loop para digitacao correta de um so letra pode ser mehlorado
        for(int i=0;i<2;i++){
            if (total > 1) {
                ent = JOptionPane.showInputDialog(frame,"Digite um letra para ver se e um consoante");
                i -= 1;
            }
            total  = ent.length();
} // funcao de verificacao de letra
        letra = ent.toLowerCase(Locale.ROOT);
        if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("u")){
            texto = String.format("sua letra e (%s) um vogal",ent);
        } else if (letra.equals("h")) {
            texto = String.format("sua letra e (%s) nao e um vogal ou consoante",ent);
        }else {
            texto = String.format("sua letra e (%s) um consoante",ent);
        }
//saida
         JOptionPane.showMessageDialog(frame,
                 ""+texto,
                 "Saida do programa",
                 JOptionPane.QUESTION_MESSAGE);

        frame.dispose();
    }

}
