package lista_4_execicioAlgoritmo;

import javax.swing.*;

/*
Signo Zodiacal: Leia o dia e o mês de nascimento e informe se a pessoa é
do signo de Áries (21/03 a 19/04).
 */
public class DivisibilidadeTripla {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        // variaveis para o programa
        int divisivel1, divisivel2, divisivel3,numeroEnt;
        divisivel1=0;divisivel2=0;divisivel3=0;
        numeroEnt=0;
        String entrada,textoSaida,verA,verB,verC;

        // entrada de informatics
        entrada = JOptionPane.showInputDialog("Digite (2) para automatico (1) para manual");
        if (entrada.equals("1")) {entrada = JOptionPane.showInputDialog("Digite o primeiro valor: ");
            numeroEnt = Integer.parseInt(entrada);
        }else{numeroEnt = (int) (Math.random() * 1000);}

        divisivel1=numeroEnt%2;
        divisivel2=numeroEnt%3;
        divisivel3=numeroEnt%5;

        verA = (divisivel1==0)? "verdadeiro":"Falso";
        verB = (divisivel2==0)? "verdadeiro":"Falso";
        verC = (divisivel3==0)? "verdadeiro":"Falso";

        textoSaida = String.format("Esse numero (%d) e divisivel por: \n 2 (%s) \n 3 (%s)\n 5 (%s)",numeroEnt,verA,verB,verC);

        JOptionPane.showMessageDialog(frame, ""+textoSaida ,"resultado",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();
    }
}
