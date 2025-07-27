package task;

public class Whale extends Mammal implements Aquatic{

    public Whale(String name, int age, double weight) {
        super(name, age, weight);
    
    }

    @Override
    public void feedMilk() {
       
    }

    @Override
    public void makeSound() {
       
    }

    @Override
    public void swim() {
        
    }

    @Override
    public boolean canBreatheUnderwater() {
       return false;
    }

}
