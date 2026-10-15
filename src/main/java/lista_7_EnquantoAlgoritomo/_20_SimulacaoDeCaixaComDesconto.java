package lista_7_EnquantoAlgoritomo;

import javax.swing.*;

public class _20_SimulacaoDeCaixaComDesconto {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setAlwaysOnTop(true);
        double saidaDesc=0,compraComDesconto=0;
        double numero=0,desconto=0.1,somaDinheiro=0;
        String entrada,textoSaida;

        while (numero > -1) {
            entrada = JOptionPane.showInputDialog(frame,"Digite o valor da compra");
            numero = Double.parseDouble(entrada);
            if (numero > -1){
                somaDinheiro+=numero;
                if (somaDinheiro >= 500){
                     saidaDesc=somaDinheiro*desconto;
                     compraComDesconto = somaDinheiro-saidaDesc;
                }
            }
        }
        textoSaida = String.format("total da compra R$(%.0f)\n total do desconto R$(%.0f)\n valor da compra R$(%.0f)",somaDinheiro,saidaDesc,compraComDesconto);
        JOptionPane.showMessageDialog(frame,textoSaida);
        frame.dispose();
    }

}
