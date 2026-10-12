package Lista_6_Enquanto;

import javax.swing.*;

public class MediaDeIdadesIndeterminadas {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        int loop=0, idade=1 ,soma=0,divisao=0;
        String entrada, saida;

        while (idade != 0) {
            loop++;
            entrada=JOptionPane.showInputDialog(frame,"Digite sua idade: ");
            idade = Integer.parseInt(entrada);

            soma += idade;
        }
        divisao = soma/loop;
        saida = String.format("O total de idade e (%d)Anos \n A media de idades e (%d)anos \n numero de vezes que a idade foi digitada: %d" ,soma,divisao,loop);

        JOptionPane.showMessageDialog(frame,saida);


        frame.dispose();
    }
}
