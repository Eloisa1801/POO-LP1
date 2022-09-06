package LP1.lista;

public class ListaLinear {

    public static class Lista{
        public No inicio; //primeiro elemento
        public int tam; // tamanho da lista

    }

    public static class No{
        public int info;
        public No prox;
        

    }

    public static void main(String[] args){
        Lista l = iniciarLista();
        l = addInicio(l, 10);
        l = addInicio(l, 5);
        l = addInicio(l, 1);
        l = addFim(l, 8);
        l = addFim(l, 3);
        l = addInicio(l, 0);
        printLista(l);
    }
        //Lista l = new iniciarLista();
        //l.inicio = null;

        // No l1 = new No();
        // No l2 = new No();
        // No l3 = new No();

        // l1.prox = l2;

        public static Lista iniciarLista(){
            Lista l = new Lista();
            l.inicio = null;
            l.tam = 0;
            return l;
        }

        public static Lista addInicio (Lista l, int val){
            No n1 = new No();
            n1.info = val;
            n1.prox = l.inicio;
            l.inicio = n1;
            l.tam++;
            return l;
        }

        public static void printLista(Lista l){
            System.out.println("L ->");
            No aux = l.inicio;
            while(l.inicio != null){
                System.out.println(aux.info + " -> ");
                aux = aux.prox;
            }
            System.out.println("NULL");
        }

        public static Lista addFim(Lista l, int val){
            No novo = new No();
            novo.info = val;
            novo.prox = null;
            if(l.inicio == null){
                l.inicio = novo;
                l.tam++;
            }
            
            No aux = l.inicio;
                while(aux.prox != null){
                aux = aux.prox;
            }
            aux.prox = novo;
            return l;
        }
        

    }


