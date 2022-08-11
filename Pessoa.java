package heranca;

public class Pessoa {
    private String nome;
    private String endereco;
    public int passos;
    
    public void setNome(String n){
        this.nome = n;
    }

    public String getNome() {
        return this.nome;   
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco() {
        return this.endereco;
    }

    public void andar(){
        this.passos++;
        System.out.println("Estou andando");
    }
}
