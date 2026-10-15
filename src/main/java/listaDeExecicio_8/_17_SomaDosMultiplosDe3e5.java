package listaDeExecicio_8;

import java.util.ArrayList;


public class _17_SomaDosMultiplosDe3e5 {
    public static void main(String[] args) {

        ArrayList<String> multiplo3e5,multiplo3,multiplo5 = new ArrayList<>();
        multiplo3e5= new ArrayList<>();
        multiplo3= new ArrayList<>();
        multiplo5= new ArrayList<>();

       for(int i=1;i <= 100;i++){
           if (i%3==0 && i%5==0){
               multiplo3e5.add(""+i);
           } else if (i%3==0) {
               multiplo3.add(""+i);
           } else if (i%5==0) {
               multiplo5.add(""+i);
           }
       }

        System.out.printf("""
                multiplos de 5 e e :%s
                
                Multiplos de 5: %s
                
                Multiplos de 3 : %s
                """,multiplo3e5,multiplo5,multiplo3);
    }
}
