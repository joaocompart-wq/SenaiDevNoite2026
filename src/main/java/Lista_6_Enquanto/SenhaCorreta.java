package Lista_6_Enquanto;

import javax.swing.*;

public class SenhaCorreta {
    public static void main(String[] args) {
       JFrame frame = new JFrame("Senha Correta");
       frame.setAlwaysOnTop(true);

       int senhaPadrao,senhaEnt;
       senhaPadrao = 1234; senhaEnt=0;
       String entrada,saida;

       while(senhaPadrao != senhaEnt){
           entrada=JOptionPane.showInputDialog("Digite sua Senha:");
           senhaEnt=Integer.parseInt(entrada);
       }

       if(senhaEnt==senhaPadrao){
           JOptionPane.showMessageDialog(frame,"Senha Correta!");
       }else {
           JOptionPane.showMessageDialog(frame,"Senha incorreta!");
       }
    }
}
