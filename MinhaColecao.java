package colecao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import heranca.Livro;

public class MinhaColecao {
    int vetor[] = new int[5];

    //declaração de collection - super classe
    List <Livro> livros = new ArrayList<Livro>(); //interface que herda da classe colecao
    //interface é uma classe abstract

    //Livro livros[];
    Livro l1 = new Livro ("Minha Colecao");
    Livro l2 = new Livro ("Minha Colecao1");
    Livro l3 = new Livro ("Minha Colecao2");
    Livro l4 = new Livro ("Minha Colecao3");

   //adicionando objetos na lista
    livros.add(l1);
    livros.add(l2);
    livros.add(l3);
    livros.add(l4);

    for (int i = 0; i < livros.size(); i++) {
        System.out.println(livros.get(i));
    }

    for (Livro l : livros){
        System.out.println(l);
    }

    livros.remove(0);

    //public class Sistemas 
    private final static String[] opcoes ={
        " Sistema biblioteca",
        "1 - Castrar Livro",
        "2 - Castrar Funcionario",
        "3 - Castrar Estudante",
        "4 - Castrar Autor",
        "5 - Realizar emprestimo",
        "6 - Receber emprestimo",
        "0 - Sair"
    };

    private Scanner buffer = new Scanner(System.in);

    public  static void main(String[] args){
        int op =1;
        while(op != 0){
            printMenu();
            System.out.println("\n\n");
        }
    }


    private static void printMenu(){
        for (String op: opcoes){
            System.out.println(op);
        } 
    }

    private static void escolha(int op){
        switch(op){
            
        }
    }

}
}
