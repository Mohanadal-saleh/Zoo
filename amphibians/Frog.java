package amphibians;
import Main.*;
public class Frog extends Amphibians implements Environment, Feed ,forPrint{
    private int jumpLength;

    public Frog(String name, String color, int age, boolean toxic,int jumpLength) {
        this.setName(name);
        this.setAge(age);
        this.setColor(color);
        this.toxic = toxic;
        setJumpLength(jumpLength);
        print();
    }
    @Override
    public void printAll()
    {
        System.out.println("The Name is : " + getName());
        System.out.println("The Age : " + getAge());
        System.out.println("The color : " + getColor());
        System.out.println("if the frog is toxic : " + toxic);
        System.out.println("His Country : "+Country());
        System.out.println("Live in Weather : "+ Weather());
        System.out.println("His Enviroment : "+ enviroment());
        System.out.println("Main.Feed on : "+Eat());
        System.out.println("His jumplength : "+ getJumpLength());
    }
    @Override
    final public String Country() {
        return "south africa";
    }

    @Override
    final public String Weather() {
        return "hot";
    }

    @Override
    final public String enviroment() {
        return "wildly";
    }

    @Override
    final public String Eat() {
        return "insect";
    }
    public void setJumpLength(int jumpLength) {
        this.jumpLength = jumpLength;
    }

    public int getJumpLength() {
        return jumpLength;
    }
}
