package amphibians;
import Main.*;
public class Caecillian extends Amphibians implements Environment, Feed ,forPrint{
    private int numColor;
    public Caecillian(String name, String color, int age, boolean toxic,int numColor) {
        this.setName(name);
        this.setAge(age);
        this.setColor(color);
        this.toxic = toxic;
        setNumColor(numColor);
    }
    @Override
    public void printAll()
    {
        System.out.println("The Name is : " + getName());
        System.out.println("The Age : " + getAge());
        System.out.println("The color : " + getColor());
        System.out.println("if the Ceacillian is toxic : " + toxic);
        System.out.println("His Country : "+Country());
        System.out.println("Live in Weather : "+ Weather());
        System.out.println("Environment : "+ enviroment());
        System.out.println("Feed on : "+Eat());
        System.out.println("The number of his color : "+getNumColor());
    }

    @Override
    final public String Country() {
        return "brazil";
    }

    @Override
    final public String Weather() {
        return "hot";
    }

    @Override
    final public String enviroment() {
        return "wild";
    }

    @Override
    final public String Eat() {
        return "insect";
    }

    public void setNumColor(int numColor) {
        this.numColor = numColor;
    }

    public int getNumColor() {
        return numColor;
    }

}
