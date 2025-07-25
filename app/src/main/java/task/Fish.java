package task;

public class Fish extends Animal implements Aquatic{

    private boolean hasGills;

    public Fish(String name, int age, double wight) {
        super(name, age, wight);
        
    }

    @Override
    public void swim() {
       System.out.println(name + " swims in water.");
    }

    @Override
    public boolean canBreatheUnderwater() {
        return hasGills;
    }

    @Override
    public void makeSound() {
       
    }

}
