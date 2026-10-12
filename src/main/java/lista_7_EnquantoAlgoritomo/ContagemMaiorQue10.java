package lista_7_EnquantoAlgoritomo;

import javax.swing.*;

public class ContagemMaiorQue10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        int numeroDeVerificacao=10 , numero=1 ,contadorPositivo=0,contadorNegativo=0;
        String entrada,saida;

        while(numero != 0){
            entrada = JOptionPane.showInputDialog(frame,"Digite um valor numerico para verificar se e maior que 10");
            numero = Integer.parseInt(entrada);
            if (numero > 10) {contadorPositivo++;}else{contadorNegativo++;}

        }
JOptionPane.showMessageDialog(frame,"total de numero contados :"+(contadorPositivo+contadorNegativo)+"\n valores numericos maiores que 10 :"+contadorPositivo+"\n valores numericos abaixo de 10 :"+contadorNegativo);
        frame.dispose();
    }
}
