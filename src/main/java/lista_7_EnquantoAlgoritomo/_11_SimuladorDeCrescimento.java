package lista_7_EnquantoAlgoritomo;

import javax.swing.*;

public class _11_SimuladorDeCrescimento {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int loop=0;
        double taxaDeCrecimento = 0.05;
        double limiteDeCrescimento = 1000,numero=0,calculoCr=0;
        String entrada ,saidaTexto;
        do {
            entrada = JOptionPane.showInputDialog(frame, "Digite um valor inicial");
            numero = Double.parseDouble(entrada);
            if(numero<=-1){JOptionPane.showMessageDialog(frame, "!Erro! \n numero negativo\n Tente novamente");}
        } while (numero <= -1);
        while(numero < limiteDeCrescimento){
            calculoCr = numero*taxaDeCrecimento;
            numero += calculoCr;
            loop++;
        }
        saidaTexto = String.format("Valor limite :(%.0f)\n numero de loop :(%d) \n  valor de saida (%.0f)", limiteDeCrescimento, loop,numero);
        JOptionPane.showMessageDialog(frame,saidaTexto);

    }
}
