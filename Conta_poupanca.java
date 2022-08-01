package classes;
public class Conta_poupanca{

    private String nome1;
    private String cpf1;
    private int agencia1;
    private int conta1;
    private double saldo1;

    public Conta_poupanca(String name1){
        System.out.println("Criando o objeto:" + name1);
    }

    public void setNome1(String n1){
        this.nome = n1;
        
    }

    public String getNome1() {
        return this.nome1;   
    }

    public void setCpf1(String cpf1){
        this.cpf1 = cpf1;
    }
    public String getCpf1() {
        return this.cpf1;   
    }

    public void setAgencia1(int agencia1) {
        this.agencia1 = agencia1;
    }

    public int getAgencia1() {
        return this.agencia1;
    }
    public void setConta1(int conta1) {
        this.conta1 = conta1;
    }

    public int getConta1() {
        return this.conta1;
    }
    public void setSaldo1(double saldo1){
        this.saldo1 = saldo1;
    }
    public double getSaldo1() {
        return this.saldo1;   
    }

    // _________ METODOS __________

    @Override
    public String toString() { //transformar objeto em string
        return ("Nome: " + this.nome1 + "\n CPF:" + this.cpf1 + "\n Agencia:" + this.agencia1 + "\n Conta:" + this.conta1 + "\n Saldo:" + this.saldo1);
    }

    public boolean depositar(double valor1) {
        this.saldo1 += valor1;
        return true;
    }

    public boolean sacar(double valor1) {
        if (valor1 < saldo1) {
            this.saldo1 -= valor1;
           return true;
        }
        else {
           return false;
        }
    }

    public double exibirSaldo() {
        return this.saldo1;
    }

}