package lista_9_For;

import javax.swing.*;

public class _5_ExibirNumerosParDe0a10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        for (int i = 0; i < 20; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }


    }
}
