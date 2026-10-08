package lista_4_execicioAlgoritmo;

import javax.swing.*;

public class ImcClassificacao {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setAlwaysOnTop(true);

        double palito,magro,gordo,ifood1,ifood2,altura,peso,imc;
        palito= 18.5;
        magro= 24.9;
        gordo=29.9;
        ifood1=34.9;
        ifood2=40;
        altura=0;
        peso=0;

        String ent,textoSaida;
        textoSaida = "";

        ent = JOptionPane.showInputDialog(frame,"digite seu peso");
        peso = Double.parseDouble(ent);
        ent = JOptionPane.showInputDialog(frame,"digite sua altura");
        altura=Double.parseDouble(ent);

        imc = peso/(altura*altura);

        if (imc <= palito) {
            textoSaida = "voce tem magresa Extrema";
        } else if (imc <= magro && imc > palito) {
            textoSaida = "voce tem peso padrao";
        } else if (imc <= gordo && imc > magro) {
            textoSaida = "voce tem peso gordo";
        } else if (imc <= ifood1 && imc > gordo) {
            textoSaida = "voce tem peso  muito gordo";
        } else{
            textoSaida = "voce tem peso  extra gordo";
        }

        JOptionPane.showMessageDialog(frame,
                ""+textoSaida,
                "resultado",
                JOptionPane.QUESTION_MESSAGE);
        frame.dispose();
    }
}
