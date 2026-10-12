package Lista_6_Enquanto;

import javax.swing.*;

//Validação de Nota: Peça uma nota entre 0 e 10. Enquanto o usuário digitar um
//valor inválido (fora dessa faixa), continue pedindo a nota.
public class ValidazaoDeNota {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        int nota; nota = 99;
        String entrada,saida;

        while(nota < 0 || nota > 10) {
            entrada = JOptionPane.showInputDialog("Digite a nota da prova:");
            nota = Integer.parseInt(entrada);
        }

        JOptionPane.showMessageDialog(frame,"Essa e anota da prova :"+nota,"Resultado da nota",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();

    }
}
