package classes;
public class Aula01{
    private int j = 0; //atributo encapsulado
    public static void main(String[] args) { //metodo
        int i = 0; //var do metodo main
    }

    Cachorro doguinho = new Cachorro(); //classe; objeto; construtor

    public static void soma(int a, int b){
        int i = 2; //var do metodo soma
        int soma = a+b+i+j;
    }

}
//todo atributo do objeto deve ser encapsulado
//sinal "+", public
//sinal "-", private
//sinal "#", protected
//sinal "~", package (heranca)
//atributo, metodos e classes podem ser private
//metodos sao funcoes que pertecem a uma classe 
