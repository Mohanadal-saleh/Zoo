package bird;
import Main.*;
public class Falcon extends Birds implements Environment, Feed ,forPrint{
    private int deepWater;

    public Falcon(String name, String color, int age, boolean canFly,int deepWater) {
        this.setName(name);
        this.setAge(age);
        this.setColor(color);
        this.canFly = canFly;
        setDeepWater(deepWater);
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
        System.out.println("Feed on : "+Eat());
        System.out.println("the length of deep water : "+ getDeepWater());
    }

    @Override
    final public String Country() {
        return "spin";
    }

    @Override
    final public String Weather() {
        return "hot";
    }

    @Override
    final public String enviroment() {
        return "on mounten";
    }

    @Override
    final public String Eat() {
        return "meat";
    }

    public void setDeepWater(int deepWater) {
        this.deepWater = deepWater;
    }

    public int getDeepWater() {
        return deepWater;
    }
}
