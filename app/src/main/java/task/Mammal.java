package task;

public abstract class Mammal extends Animal implements Vertebrate {
    
    public Mammal(String name, int age, double weight){
        super(name, age, weight);
    }

    public abstract void feedMilk();

    @Override
    public void move(){
       
    }

    @Override
    public void eat(){
        
    }

}
