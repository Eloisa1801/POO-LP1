package heranca;

public class Gato extends AnimalTerrestre{

    public Gato(){
        super();
    }
    //polimorfismo, sobre escrita do metodo emitirSom
    public void emitirSom(){
        System.out.println("Meoww");
    }
    //@Override - subescrita de classe, polimorfismo
}
