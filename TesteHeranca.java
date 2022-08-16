package heranca;

import java.time.LocalDate;
import java.time.Month;

public class TesteHeranca {
    public static void main(String[] args){
        // Cao bilu = new Cao();
        // bilu.setName("Bilu");
        // bilu.setIdade(4);
        // bilu.setRaca("Maltes");

        // Dono eloisa = new Dono();
        // eloisa.setNome("Eloisa");
        // eloisa.setEndereco("Rua x, 123");
        // eloisa.setAnimal("Bilu");

        // eloisa.getAnimal().emitirSom(); 
        // eloisa.andar();

        // Funcionario fer = new Funcionario();
        // fer.setMatricula(1234);
        // fer.toString();


        Funcionario func = new Funcionario();
        func.setNome("Leticia");
        LocalDate dtAdmissao= LocalDate.of(1990, Month.MAY, 3);
    }
    
}
