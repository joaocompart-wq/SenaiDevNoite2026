package execicioEstruturaDeRepeticao;

import javax.swing.*;

public class MediaDeNotas {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        int media ,contadorParaDivisao , somatorias, numeroDeNotas ,numero ,notas;
        media=0;contadorParaDivisao=0;somatorias=0;numeroDeNotas=2;numero=0;
        boolean variaveX;
        variaveX=true;
        String textoSaida,entrada;
        entrada="";


       while (variaveX) {
           if (numeroDeNotas <= 0) {
               entrada = JOptionPane.showInputDialog(frame, "voce quer continuar com a somatoria das notas");
               // verificar se o usuario quer dar mais notas que o padrao
               if (entrada.equals("sim")) {
                   variaveX = true;
                   entrada = JOptionPane.showInputDialog(frame, "Digite a quantidade de notas que voce quer dar");
                   numero = Integer.parseInt(entrada);
                   numeroDeNotas += numero;
               } else  {
                   variaveX = false;
               }
           }else{
               // pede as notas ao usuario
            entrada = JOptionPane.showInputDialog(frame,"Digite e um nota ");
            numero = Integer.parseInt(entrada);
            somatorias += numero;
            contadorParaDivisao++;
            numeroDeNotas--;
           }

           }



        media=somatorias/contadorParaDivisao;
        textoSaida = String.format("A media das notas:%d \n As quantidades de notas:%d \n O total das notas :%d",media,contadorParaDivisao,somatorias);
       JOptionPane.showMessageDialog(frame,textoSaida,"resutado",JOptionPane.INFORMATION_MESSAGE);
        frame.dispose();
    }
}
