package colecao;

import java.util.Set;
import java.util.HashSet;


public class Colecao {

    public static void main (String[] args) {

        Set<String> grupo1, grupo2;
        grupo1 = new HashSet<String>();
        grupo2 = new HashSet<String>();

        String s1, s2, s3, s4, s5, s6;

        s1 = "Manuel";
        s2 = "Carol";
        s3 = "Bruna";
        s4 = "Bruno";
        s5 = "Carolina";
        s6 = "Beto";

        grupo1.add(s1);
        grupo1.add(s2);
        grupo1.add(s3);
        grupo1.add(s4);
        grupo1.add(s5);
        grupo1.add(s1);

        grupo2.add(s1);
        grupo2.add(s2);
        grupo2.add(s3);
        grupo2.add(s4);
        grupo2.add(s5);
        grupo2.add(s6);


    System.out.println("### GRUPO 1 ###");
        for(String s : grupo1){
            System.out.print(s);
        }      
        
    

    System.out.println("### GRUPO 2 ###");
        for(String s : grupo2){
            System.out.print(s);
        } 
        
        if(grupo2.contains("Ana")){
            System.out.println("Existe Ana dentro da colação");
        }

        grupo1.remove(s1);

    }
}
