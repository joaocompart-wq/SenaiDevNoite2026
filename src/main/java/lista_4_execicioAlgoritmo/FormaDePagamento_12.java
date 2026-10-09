package lista_4_execicioAlgoritmo;

import javax.swing.*;
import java.util.Locale;

public class FormaDePagamento_12 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        String entTexto ,entNumero, textoSaida;
        entTexto="";entNumero="";

        double desconto1,valor,multDesc,somaDesc;
        desconto1 = 0; valor = 0;

        entTexto = JOptionPane.showInputDialog(frame,"digite um a forma de pagamento");
        entTexto.toLowerCase(Locale.ROOT);

        if (entTexto.equals("dinheiro")) { desconto1 = 0.10;
        }else if (entTexto.equals("cartao")) { desconto1 = 0.05;
        }else if (entTexto.equals("2x")) { desconto1 = 0;
        }

        entNumero= JOptionPane.showInputDialog(frame,"Digite o valor de um numero");
        valor = Double.parseDouble(entNumero);

        multDesc = valor*desconto1;
        somaDesc = valor-multDesc;

        textoSaida = String.format(" O valor da compra e de R$:(%.2f) \n O valor do desconto e de R$(%.2f) \n O valor da compra com desconto e (%.2f) ",valor,multDesc,somaDesc);

        JOptionPane.showMessageDialog(frame,""+textoSaida,"Saida",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();
    }
}
