package task;

public class Cat extends Mammal implements HasFur{
    private String furColor;
    public Cat(String name, int age, double weight, String furColor)
    {
        super(name, age, weight);
        
    }
    @Override
    public void groomFur() {
        
    }
    @Override
    public String getFurColor() {
        return furColor;
    }
    @Override
    public void feedMilk() {
        
    }
    @Override
    public void makeSound() {
        
    }
    @Override
    public void setFurColor(String color) {
       this.furColor=color;
    }

}
