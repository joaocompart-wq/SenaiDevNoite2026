package lista_9_For;

import javax.swing.*;
import java.sql.SQLOutput;

public class _4_Contar0a100em5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        int somador = 5;
        for (int i = 0; i < 100; i+=somador) {
            System.out.println(i);
        }

    }
}
