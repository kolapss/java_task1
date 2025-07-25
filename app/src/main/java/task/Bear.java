package task;

public class Bear extends Mammal implements HasFur{

    private String furColor;

    public Bear(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    @Override
    public void groomFur() {
        
    }

    @Override
    public String getFurColor() {
        return furColor;
    }

    @Override
    public void setFurColor(String color) {
       
    }

    @Override
    public void feedMilk() {
        
    }

    @Override
    public void makeSound() {

    }

}
