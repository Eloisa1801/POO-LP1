package classes;
public class Conta_corrente{
   
    private String nome;
    private String cpf;
    private int agencia;
    private int conta;
    private double saldo;

    public Conta_corrente(String name){
        System.out.println("Criando o objeto:" + name);
        
    }

    public void setNome(String n){
        this.nome = n;
        
    }

    public String getNome() {
        return this.nome;   
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf() {
        return this.cpf;   
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return this.agencia;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getConta() {
        return this.conta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo() {
        return this.saldo;   
    }

    @Override
    public String toString() { //transformar objeto em string
        return ("Nome: " + this.nome + "\n CPF:" + this.cpf + "\n Agencia:" + this.agencia + "\n Conta:" + this.conta + "\n Saldo:" + this.saldo);
    }

    public boolean depositar(double valor) {
        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor < saldo) {
            this.saldo -= valor;
           return true;
        }
        else {
           return false;
        }
    }

    public double exibirSaldo() {
        return this.saldo;
    }

}

/*Criar os Modelos:
    - Conta Corrente
    - Conta Poupança
Regras: 
    - ter ao menos 3 atributos em cada Modelos
    - ter ao menos 2 métodos (saque e depósito)*/