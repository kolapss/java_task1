package task;

public class Whale extends Mammal implements Aquatic{

    public Whale(String name, int age, double weight) {
        super(name, age, weight);
    
    }

    @Override
    public void feedMilk() {
        System.out.println(name + " is feeding its calf underwater.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " sings a whale song.");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }

    @Override
    public boolean canBreatheUnderwater() {
       return false;
    }

}
