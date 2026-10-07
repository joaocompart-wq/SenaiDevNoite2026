package listaExecicio_3._2_execicio_if_else;

import javax.swing.*;

public class Execicio_2 {
    public static void main(String[] args) {
        // faz o codigo JOptionPane
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        String resultado = "";
        //Aqui fica a janela de entrada
        String texto = JOptionPane.showInputDialog(frame, "digite a temperatura do ambiente");
        int temp =Integer.parseInt(texto);
        // abaixo fica a logica de decisão
        if (temp <= 18) {
            resultado = "Açâo recomentado:Ligar o aquecedor";
        } else if (temp > 18 && temp <= 25)  {
            resultado = "Açâo recomentado:matenha a temperatura";
        }else if (temp >= 26) {
            resultado = "Açâo recomentado: ligar o Ar-Condicionado";
        }
        javax.swing.JOptionPane.showMessageDialog(frame ,
        ""+resultado,
        "Respota do sistema",
        JOptionPane.QUESTION_MESSAGE);
        System.exit(1);
    }
}
