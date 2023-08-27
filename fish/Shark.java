package fish;
import Main.*;
public class Shark extends Fish implements Environment, Feed ,forPrint{
    private int width ;

    public Shark(String name, String color, int age, boolean Predatory,int width) {
        this.setName(name);
        this.setAge(age);
        this.setColor(color);
        this.Predatory = Predatory;
        setWidth(width);
        print();
    }
    @Override
    public void printAll()
    {
        System.out.println("The Name is : " + getName());
        System.out.println("The Age : " + getAge());
        System.out.println("The color : " + getColor());
        System.out.println("if The Main.Animal is Preadatory : " + Predatory);
        System.out.println("His Country : "+Country());
        System.out.println("Live in Weather : "+ Weather());
        System.out.println("His Enviroment : "+ enviroment());
        System.out.println("Main.Feed on : "+Eat());
        System.out.println("His width : "+getWidth());

    }

    @Override
    final public String Country() {
        return "amirican";
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

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
