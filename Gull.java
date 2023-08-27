
public class Gull extends Birds implements Environment,Feed{
    private int weight;
    public Gull(String name, String color, int age, boolean canFly,int weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.canFly = canFly;
        this.setWeight(weight);
        printAll();
    }
    private void printAll ()
    {
        System.out.println("The Name is : " + name);
        System.out.println("The Age : " + age);
        System.out.println("The color : " + color);
        System.out.println("if the bird can be fly : " + canFly);
        System.out.println("His Country : "+Country());
        System.out.println("Live in Weather : "+ Weather());
        System.out.println("His Enviroment : "+ enviroment());
        System.out.println("Feed on : "+Eat());
        System.out.println("His weight : "+ getWeight());
    }

    @Override
    void speed() {
        System.out.println("the speed of gull is 150km");
    }

    @Override
    public String Country() {
        return "france";
    }

    @Override
    public String Weather() {
        return "hot";
    }

    @Override
    public String enviroment() {
        return "on sea";
    }

    @Override
    public String Eat() {
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
