package listaDeExecicio_8;

import javax.swing.*;
import java.util.ArrayList;

public class _11_AtividadeModverificacao {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setAlwaysOnTop(true);
        String entrada,saida,verificacao;
        int numero;
        ArrayList<String> lista = new ArrayList<>();
        for (int loop =20;loop > 0;loop--){
            do {entrada = JOptionPane.showInputDialog(frame,"Digite um numero para verificar se e par o impar");
        numero = Integer.parseInt(entrada);}while(numero <= -1);
            if (numero%2==0){verificacao ="par";
            }else{verificacao="Impar";}
            saida=String.format("Esse numero (%d) e (%s)\n",numero,verificacao);
            lista.add(saida);
        }
        JOptionPane.showMessageDialog(frame,lista,"resultado",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();
    }
}
