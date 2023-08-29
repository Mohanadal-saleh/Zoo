package fish;
import Main.*;
public class Octopus extends Fish implements Environment, Feed ,forPrint{
    private int numLegs;

    public Octopus(String name, String color, int age, boolean Predatory,int numLegs) {
        this.setName(name);
        this.setAge(age);
        this.setColor(color);
        this.Predatory = Predatory;
        setNumLegs(numLegs);
    }
    @Override
    public void printAll()
    {
        System.out.println("The Name is : " + getName());
        System.out.println("The Age : " + getAge());
        System.out.println("The color : " + getColor());
        System.out.println("if The animal is Preadatory : " + Predatory);
        System.out.println("His Country : "+Country());
        System.out.println("Live in Weather : "+ Weather());
        System.out.println("His Enviroment : "+ enviroment());
        System.out.println("Feed on : "+Eat());
        System.out.println("Number of legs : "+getNumLegs());
    }

    @Override
    final public String Country() {
        return "denimark";
    }

    @Override
    final public String Weather() {
        return "cold";
    }

    @Override
    final public String enviroment() {
        return "water";
    }

    @Override
    final public String Eat() {
        return "small fish";
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public int getNumLegs() {
        return numLegs;
    }
}
