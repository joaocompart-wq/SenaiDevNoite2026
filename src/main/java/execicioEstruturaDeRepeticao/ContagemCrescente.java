package execicioEstruturaDeRepeticao;

import javax.swing.*;

/*
Crie um algoritmo que exiba todos os números de 1
até 50.
 */
public class ContagemCrescente {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        String entrada,saidaTextol;
        int contagemNumero,numeroLimite,loop;
        contagemNumero = 0;
        numeroLimite=0; loop=0;

        entrada = JOptionPane.showInputDialog(frame,"Digite o numero da limite:");
        numeroLimite = Integer.parseInt(entrada);

        while (contagemNumero <= numeroLimite) {
            if((contagemNumero+5) < numeroLimite){contagemNumero +=5;
            } else if ((contagemNumero+2) > numeroLimite){contagemNumero +=2;
            }else {contagemNumero +=1;}

            loop++;
        }

        saidaTextol = String.format("""
                o numero limiti do contador e:%d 
                A quantidade de lacos de repeticao necessario foral :%d
                """,numeroLimite,loop);

        JOptionPane.showMessageDialog(frame,""+saidaTextol,"SSaida do programa",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();
    }
}
