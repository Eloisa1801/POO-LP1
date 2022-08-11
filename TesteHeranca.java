package heranca;

public class TesteHeranca {
    public static void main(String[] args){
        Cao bilu = new Cao();
        bilu.setName("Bilu");
        bilu.setIdade(4);
        bilu.setRaca("Maltes");

        Dono eloisa = new Dono();
        eloisa.setNome("Eloisa");
        eloisa.setEndereco("Rua x, 123");
        eloisa.setAnimal("Bilu");

        eloisa.getAnimal().emitirSom(); 
        eloisa.andar();

        Funcionario fer = new Funcionario();
        fer.setMatricula(1234);
        fer.toString();
    }
    
}
