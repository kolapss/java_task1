package task;

public class Cat extends Mammal implements HasFur{
    private String furColor;
    public Cat(String name, int age, double weight, String furColor)
    {
        super(name, age, weight);
        
    }
    @Override
    public void groomFur() {
        System.out.println(name + " is grooming its fur.");
    }
    @Override
    public String getFurColor() {
        return furColor;
    }
    @Override
    public void feedMilk() {
        System.out.println(name + " is feeding kittens.");
    }
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow.");
    }
    @Override
    public void setFurColor(String color) {
       this.furColor=color;
    }

}
