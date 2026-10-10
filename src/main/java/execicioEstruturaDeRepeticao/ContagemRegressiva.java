package execicioEstruturaDeRepeticao;

import javax.swing.*;

public class ContagemRegressiva {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        int numeroRegressivo ,zero,loop,a;
        numeroRegressivo = 0; zero = 0; loop=0;
        String textoSaida , entrada;

        entrada = JOptionPane.showInputDialog(frame,"Digite o numero do regressivo para o contador");
        numeroRegressivo = Integer.parseInt(entrada);
        a = numeroRegressivo;
        //diminuir a necessitade de loops
        while(zero<numeroRegressivo){
            if ((numeroRegressivo/2)  > zero){numeroRegressivo /= 2;}
            else if ((numeroRegressivo-2) > zero) {numeroRegressivo -= 2;
            }else if ((numeroRegressivo) > zero) {numeroRegressivo -= 1;}
            loop++;
        }
        textoSaida = String.format("O numero maximo da contagem regresiva e %d \n o numero de vezes que foi usado a laco de repeticao e :%d", a,loop);
        JOptionPane.showMessageDialog(frame,""+ textoSaida,"Resultadlo",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();
    }
}
