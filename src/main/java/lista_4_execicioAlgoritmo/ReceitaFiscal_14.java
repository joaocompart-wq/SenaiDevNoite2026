package lista_4_execicioAlgoritmo;

import javax.swing.*;

public class ReceitaFiscal_14 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setAlwaysOnTop(true);
        String numeroEnt,textoSaida;
        numeroEnt="";
        double imposto,salario,multImpost,subImpost;
        imposto =0;
        salario =0;
        numeroEnt = JOptionPane.showInputDialog(frame,"digite seu salario");
        salario = Double.parseDouble(numeroEnt);

        if (salario <= 2000) {imposto = 0;
        } else if (salario <= 5000) { imposto=0.10;
        } else if (salario > 500) {imposto = 0.20;
        }
        multImpost = salario*imposto;
        subImpost = salario-multImpost;

        textoSaida = String.format(" Esse e seu salario (%.2f) \n Esse e valor do imposto (%.2f) \n Esse e o seu salario com desconto (%.2f)",salario,multImpost,subImpost);

        JOptionPane.showMessageDialog(frame,""+textoSaida,"saida",JOptionPane.QUESTION_MESSAGE);

        frame.dispose();
    }
}
