package lista_7_EnquantoAlgoritomo;

import javax.swing.*;

public class SomaDeNumeroComLimite_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        int soma=0,numero=0,limite=0;

        String saida,entrada;

        entrada = JOptionPane.showInputDialog(frame,"Digite um limite para a somatoria");
        limite=Integer.parseInt(entrada);

        while(soma <=  limite){
            entrada =JOptionPane.showInputDialog(frame,"Digite a quantidade de valores a ser somado");
            numero=Integer.parseInt(entrada);
            soma=soma+numero;
        }
JOptionPane.showMessageDialog(frame,"total da soma : "+soma ,"resultado",JOptionPane.INFORMATION_MESSAGE);
        frame.dispose();
    }
}
