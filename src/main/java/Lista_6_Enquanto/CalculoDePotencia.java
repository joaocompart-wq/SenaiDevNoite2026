package Lista_6_Enquanto;

import javax.swing.*;
import java.util.ArrayList;

public class CalculoDePotencia {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculo de Potencia");
        frame.setAlwaysOnTop(true);

    int base,expoente,loop,saida,aB;
    loop=0;
    String entrada,textoDeSaida;
    ArrayList<String> listaDeCalculo = new ArrayList();
    entrada = JOptionPane.showInputDialog("Digite o valor da base ");
    base = Integer.parseInt(entrada);
    entrada = JOptionPane.showInputDialog("digite o valor do expoente");
    expoente = Integer.parseInt(entrada);
    entrada = null;

    saida = base*base;
    listaDeCalculo.add(""+base+"*"+base+"="+saida+"\n");
    if (expoente == 2){
    }else{
        while(loop < expoente){
            aB = saida*base;
            saida *= base;
            listaDeCalculo.add(""+saida+"*"+base+"="+aB+"\n");
            loop++;
        }
    }
    textoDeSaida = String.format("valor do exponecial final :(%d) \n calculos:%s",saida,listaDeCalculo);

    JOptionPane.showMessageDialog(frame,textoDeSaida);

        frame.dispose();
    }
    }
