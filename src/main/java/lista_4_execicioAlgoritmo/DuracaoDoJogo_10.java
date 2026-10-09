package lista_4_execicioAlgoritmo;

import javax.swing.*;

public class DuracaoDoJogo_10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);


        int dia,horaInicio,horaFinal,soma;
        dia =0; soma = 0;
        horaInicio =0; horaFinal =0;
        String entrada,textoSaida;
        entrada =""; textoSaida = "";

        entrada = JOptionPane.showInputDialog("Digite o inicio do jogo ");
        horaInicio= Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("Digite o final do jogo ");
        horaFinal= Integer.parseInt(entrada);


        if (horaInicio > horaFinal) {
           soma = (24 - horaInicio+horaFinal);
        textoSaida = String.format("""
                    O jogo comeco as (%d)Horas e terminou as (%d)horas do outro dia
                    A duracao do jogo foi de (%d)
                    """,horaInicio,horaFinal,soma);
        }else {
            soma = horaFinal-horaInicio;
            textoSaida = String.format("""
                    O jogo comecou as (%d)horas e terminiou as (%d)horas do mesmo dia
                    A duracao do jogo foi de (%d)
                    """,horaInicio,horaFinal,soma);

} JOptionPane.showMessageDialog(frame,""+textoSaida,"saida do programa",JOptionPane.QUESTION_MESSAGE);
        frame.dispose();
} }
