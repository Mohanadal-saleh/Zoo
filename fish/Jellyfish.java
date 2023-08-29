package fish;
import Main.*;
public class Jellyfish extends Fish implements Environment, Feed ,forPrint{
    private int elctricWh;
    public Jellyfish(String name, String color, int age, boolean Predatory,int elctricWh) {
        this.setName(name);
        this.setAge(age);
        this.setColor(color) ;
        this.Predatory = Predatory;
        setElctricWh(elctricWh);
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
        System.out.println("Shock force in volt : "+getElctricWh());
    }


    @Override
    final public String Country() {
        return "newziland";
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
        return "Small fish";
    }
    public void setElctricWh(int elctricWh) {
        this.elctricWh = elctricWh;
    }

    public int getElctricWh() {
        return elctricWh;
    }


}

