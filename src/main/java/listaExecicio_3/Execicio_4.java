package listaExecicio_3;

import javax.swing.*;

public class Execicio_4 {
    public static void main(String[] args) {
        //variaveis
        double valorCombudtivel=6.39;
        int comsumoCubustivel=12;
        int distaciaKM = 0;

        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        String textoKm = JOptionPane.showInputDialog(frame,"digite a distacia a ser pecorida");
        distaciaKM = Integer.parseInt(textoKm);

        int combustivelNecessaria = distaciaKM/comsumoCubustivel;
        double preco = combustivelNecessaria*valorCombudtivel;

        javax.swing.JOptionPane.showMessageDialog(frame,
                " combustivel para viagem L:"+combustivelNecessaria+"\n Distacia a pecorre KM:"+distaciaKM+"\n Valor Gasto messa viagem R$:"+preco,"resultado do execicio"
                ,JOptionPane.QUESTION_MESSAGE);
System.exit(1);
    }
}
