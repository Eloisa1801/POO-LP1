package heranca;

import java.time.LocalDate;

public abstract class Pessoas {
    protected String nome;
    protected String endereco;
    protected LocalDate dtNascimento;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDtNascimento() {
        return this.dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Pessoas(){}

    public Pessoas(String _nome, LocalDate _dtNascimento, String _endereco){
        this.nome = _nome;
        this.endereco = _endereco;
        this.dtNascimento = _dtNascimento;
    }
}
