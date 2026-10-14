package lista_7_EnquantoAlgoritomo;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
// tenta tiva de dividir os carateres e  verificar a senha
public class _15_ValidaDeSenha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> separa = new ArrayList<>();
        int senha=1234,senhaEnt=0,senhaSaida=0,letras;
        String entrada ;
        boolean v1=false,v2=false,v3=false,v4=false;

        do {
            //receber a senha do usuiario
            do {
                System.out.println("Digite seu senha:");
                entrada = sc.nextLine();
                letras = entrada.length();
                senhaEnt = Integer.parseInt(entrada);
                senhaSaida = Integer.parseInt(entrada);
            } while (letras != 4);
           // tentada dividir a senha recebida para usala na verificacao
            do {
                separa.add(senhaEnt%10);
                senhaEnt /= 10;
            } while (senhaEnt > 0);
            // da erro e nao verifica a entrada separada por array
           v1= separa.get(3) == 1;
           v2= (separa.get(2)==2);
           v3= (separa.get(1)==3);
           v4= (separa.get(0)==4);
            //ativa sem precisar
            if(v1 && v2 && v3 && v4){
            }else {
                System.out.printf("Senha errada\n primeiro numero (%b) \n segundo numero (%b) \n terceiro numero (%b) \n quarto numero (%b)\n",v1,v2,v3,v4);
            }
        } while (senha != senhaSaida);
        System.out.println("Senha valida!");
        sc.close();
    }
}
