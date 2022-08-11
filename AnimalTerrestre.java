package heranca;

public abstract class  AnimalTerrestre {
    //abstract
    protected String name;
    protected String raca;
    protected int idade;
    
    public void setName(String n){
        this.name = n;
        
    }

    public String getName() {
        return this.name;   
    }

    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getRaca() {
        return this.raca;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }


    //metodos abstract não pode ter corpo
    public abstract void emitirSom(){}

    
}
