package heranca;

import java.time.LocalDate;

public class Autor extends Pessoas{
    private String formacao;
    private int qtdLivros;

    public String getFormacao() {
        return this.formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getQtdLivros() {
        return this.qtdLivros;
    }

    public void setQtdLivros(int qtdLivros) {
		this.qtdLivros = qtdLivros;
	}

    public Autor(
        String nome,
        LocalDate dtNascimento,
        String formacao,
        String endereco,
        int qtdLivros
    ){}

}
