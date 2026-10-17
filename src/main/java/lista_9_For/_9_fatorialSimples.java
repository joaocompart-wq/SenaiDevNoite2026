package lista_9_For;


import javax.swing.*;
import java.util.ArrayList;

public class _9_fatorialSimples {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int numero=0,fatorial=1,calculo=0;
        String entrada,saida;
        ArrayList<String> lista=new ArrayList<>();
        entrada=JOptionPane.showInputDialog("Digite um numero para ver seu fatorial");
        numero=Integer.parseInt(entrada);
        for (int i = 1; i <= numero; i++) {
            calculo=fatorial*i;
            saida=String.format("%d*%d = %d%n",fatorial,i,calculo);
            lista.add(saida);
            fatorial=calculo;

        }
        JOptionPane.showMessageDialog(null, lista);

        frame.dispose();
      
    }
}
