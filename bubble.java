import java.util.Random;
public class bubble {
    private static final int TAM = 1000;
    public static void main(String[] args){
        int qtdTroca = 0;
        int vetor[] = new int[10];
        Random rand = new Random();
        for(int i=0;i<vetor.length;i++){
            vetor[i] = rand.nextInt(TAM * TAM - 1) + 1;
        }
        System.out.println("vetor desordenado");
        for(int i=0;i<vetor.length;i++){
            System.out.println(vetor[i] + " \t ");
        }

        System.out.println("Vetor ordenado");

        boolean troca = false;

        do{
            troca = false;
            for(int j=0;j<vetor.length - 1 ;j++){
                if(vetor[j] > vetor[j + 1]){
                    troca = true;
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    qtdTroca++;
                }
            }
        } while(troca);
        print(vetor);

    }

    public void print (int vetor[]){
        for(int i=0;i<vetor.length;i++){
            System.out.println(vetor[i] + " \t ");
        }
    }
    
}
