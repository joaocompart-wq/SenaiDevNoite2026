package listaDeExecicio_8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _14_separandoParesemGrupos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorPar=0,comtadorImpar=0,numero=0;

        for (int i=12;i > 0;i--) {
            System.out.println("digite Essa quantidade "+i+" de valores numericos");
           numero= sc.nextInt();
            if (numero%2==0){
                contadorPar++;
            }else{
                comtadorImpar++;
            }
        }

        System.out.printf("quantidade de numeros paras (%d)\n quantidade de numeros impares (%d)",contadorPar,comtadorImpar);
    }
}
