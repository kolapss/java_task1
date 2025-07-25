package task;

public abstract class Mammal extends Animal implements Vertebrate {
    
    public Mammal(String name, int age, double weight){
        super(name, age, weight);
    }

    public abstract void feedMilk();

    @Override
    public void move(){
        System.out.println(name + "is walking");
    }

    @Override
    public void eat(){
        System.out.println(name + "is walking");
    }

}
