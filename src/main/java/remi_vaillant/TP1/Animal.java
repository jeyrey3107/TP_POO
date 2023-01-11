package remi_vaillant.TP1;

public class Animal {
    private String nomAnimal;
    private TypeAnimal typeAnimal;
    public Animal(String na,TypeAnimal ta){
        this.nomAnimal=na;
        this.typeAnimal=ta;
    }
    public String getNomAnimal() {
        return this.nomAnimal;
    }
    public TypeAnimal getTypeAnimal() {
        return this.typeAnimal;
    }



}
