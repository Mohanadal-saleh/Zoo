package amphibians;
import Main.*;
public class Frog extends Amphibians implements Environment, Feed ,forPrint{

    private int speedW;
    private int speedG;

    public Frog(String name, String color, int age, boolean toxic,int speedW) {
        this.setName(name);
        this.setAge(age);
        this.setColor(color);
        this.toxic = toxic;
        setSpeed(speedW);
    }
    public Frog(String name, String color, int age, boolean toxic,int speedW,int speedG) {
        this.setName(name);
        this.setAge(age);
        this.setColor(color);
        this.toxic = toxic;
        setSpeed(speedW, speedG);
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
        System.out.println("His speed : In the Water : "+ getSpeedW());
        System.out.println("His speed : In the Ground : "+ getSpeedG());
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

    public int getSpeedW() {
        return speedW;
    }
    public int getSpeedG() {
        return speedG;
    }

    public void setSpeed(int speed) {
        this.speedW = speed;
    }
    public void setSpeed(int speedW,int speedG) {
        this.speedW = speedW;
        this.speedG = speedG;
    }



}
