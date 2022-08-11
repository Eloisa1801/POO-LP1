package heranca;

public class Dono extends Pessoa{
    private AnimalTerrestre animal;
    private int qtdAnimais=0;
    public Dono(){
        super(); //chama o construtor da super classe
    }

    // public void alimentarAnimais(AnimalTerrestre animal){
    // }

    public void setQtdAnimais(int qtdAnimais) {
        this.qtdAnimais = qtdAnimais;
        
    }

    public int getQtdAnimais() {
        return this.qtdAnimais;   
    }

    public void alimentarAnimais(Cao animal){
        System.out.println("Estou alimentando o cao chamado "+animal.getName());
    }

    public void alimentarAnimais(Gato animal){
        System.out.println("Estou alimentando o gato chamado "+animal.getName());
    }

    public AnimalTerrestre getAnimal(){
        return this.animal;
    }
    public void setAnimal(AnimalTerrestre animal){
        this.animal = animal;
    }

    @Override
    public void andar(){
        this.passos += 2;
        System.out.println("estou correndo");
    }
}
