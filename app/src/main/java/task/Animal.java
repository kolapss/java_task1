package task;

public abstract class Animal{
    protected String name;
    protected int age;
    protected double weight;

    public Animal(String name, int age, double wight){
        this.name = name;
        this.age = age;
        this.weight = wight;
    }
    void breathe(){
        System.out.println(name + " is breathing.");
    }

    public abstract void makeSound();

    public String getName(){return name;}
    public int getAge(){return age;}
    public double getWeight(){return weight;}
}
