package LP1.Ordenacao;
import java.util.Random;
//import java.util.Scanner;

public class InitOrdenacao {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in); //leitura pelo teclado - classe | constructor | parametro 
        int vetor[] = new int[10];
        //int vetor2[] = new int[10];
        int vetor1[] = {1, 2, 3, 4, 5};
        int matriz[][] = new int[5][5];

        vetor[0] = 30;
        vetor1[0] = 40;
        matriz[0][0] = 1;

        /*for(int i = 0; i < 5; i++) {
            System.out.println("Digite o #" + (i+1) + "numero");
            vetor[i] = in.nextInt();
        }*/

    //----------------------------------------------------------------   

       // int min = 2, max = 10;
        //int num = (int) Math.random();
        //Random rand = new Random();
        //System.out.println(rand.nextInt(max-min)+min);

        //for(int l = 0; l < 5; l++) {
            //vetor[l] = rand.nextInt((max-min)+min);
            //System.out.println(vetor[l]);
        //}

     //----------------------------------------------------------------  
        Random rand = new Random();   
        int min = 10, max = 20; 
        int qtd = 0;
        boolean found = true;
        for(int i = 0; i < 10; i++) {  
            int temp = 0; 
            while(found) {
                temp = rand.nextInt(max-min)+min;
                for (int j = 0; j < qtd; j++) {
                    if(temp == vetor[j]){
                        found = true;
                    }
                    found = false;
                }
            }
            vetor[i] = temp;
            System.out.println(temp+" ");
            qtd++;
        }
    
    //----------------------------------------------------------------       
    }
}
