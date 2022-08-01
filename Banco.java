package classes;

import classes.Conta_corrente;
import classes.Conta_poupanca;

public class Banco{
    public static void main(String[] args){

        Conta_corrente corrente = new Conta_corrente("corrente"); //classe; objeto; construtor
        Conta_poupanca poupanca = new Conta_poupanca("poupanca");

        corrente.setNome("Eloisa");
        corrente.setCpf("068.830.471-07");
        corrente.setAgencia(123);
        corrente.setConta(456789);
        corrente.setSaldo(2.675);

        poupanca.setNome1("Mariana");
        poupanca.setCpf1("082.127.011-74");
        poupanca.setAgencia1(244);
        poupanca.setConta1(196433);
        poupanca.setSaldo1(4.342);

        System.out.println(corrente.toString());
        System.out.println(poupanca.toString());

        /*System.out.println(corrente.getNome());
        System.out.println(corrente.getCpf());
        System.out.println(corrente.getAgencia());
        System.out.println(corrente.getConta());
        System.out.println(corrente.getSaldo());

        System.out.println(poupanca.getNome1());
        System.out.println(poupanca.getCpf1());
        System.out.println(poupanca.getAgencia1());
        System.out.println(poupanca.getConta1());
        System.out.println(poupanca.getSaldo1());*/

    }
}