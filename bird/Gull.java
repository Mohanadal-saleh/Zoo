package bird;
import Main.*;
public class Gull extends Birds implements Environment, Feed ,forPrint{
    private int weight;
    public Gull(String name, String color, int age, boolean canFly,int weight) {
        this.setName(name);
        this.setAge(age);
        this.setColor(color);
        this.canFly = canFly;
        this.setWeight(weight);
    }
    @Override
    public void printAll()
    {
        System.out.println("The Name is : " + getName());
        System.out.println("The Age : " + getAge());
        System.out.println("The color : " + getColor());
        System.out.println("if the bird can be fly : " + canFly);
        System.out.println("His Country : "+Country());
        System.out.println("Live in Weather : "+ Weather());
        System.out.println("His Enviroment : "+ enviroment());
        System.out.println("Main.Feed on : "+Eat());
        System.out.println("His weight : "+ getWeight());
    }

    @Override
    final public String Country() {
        return "france";
    }

    @Override
    final public String Weather() {
        return "hot";
    }

    @Override
    final public String enviroment() {
        return "on sea";
    }

    @Override
    final public String Eat() {
        return "fish";
    }
    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public int getWeight() {
        return weight;
    }
}
