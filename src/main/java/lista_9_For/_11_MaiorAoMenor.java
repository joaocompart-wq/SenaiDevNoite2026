package lista_9_For;

import javax.swing.*;

public class _11_MaiorAoMenor {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setAlwaysOnTop(true);

        int valorMenor=999,valorMaior=-1;
        int numero=0;
        String entrada,saida;
        for(int i=1;i<=5;i++){
            do {
                entrada=JOptionPane.showInputDialog("Digite um numero: ");
                numero=Integer.parseInt(entrada);
            }while(numero <= -1);
            if (numero<valorMenor){valorMenor=numero;}
             else if (numero > valorMaior) {valorMaior=numero;}


        }
        saida =String.format("O Maior numero %d \n menor numero %d",valorMaior,valorMenor);
        JOptionPane.showMessageDialog(frame,saida);
        }
    }


