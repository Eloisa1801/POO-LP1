package heranca;

public class Funcionario extends Pessoa{

    private int matricula;

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String toString(){
        return "{" +"matricula ='" + getMatricula() + "'" +"};
    }
    
}
