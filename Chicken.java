public class Chicken extends Birds implements Environment,Feed{
    private int numEgg;

    public Chicken(String name, String color, int age, boolean canFly,int numEgg) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.canFly = canFly;
        setNumEgg(numEgg);
        print();
    }

     void printAll ()
    {
        System.out.println("The Name is : " + name);
        System.out.println("The Age : " + age);
        System.out.println("The color : " + color);
        System.out.println("if the bird can be fly : " + canFly);
        System.out.println("His Country : "+Country());
        System.out.println("Live in Weather : "+ Weather());
        System.out.println("His Enviroment : "+ enviroment());
        System.out.println("Feed on : "+Eat());
        System.out.println("the number of egg : "+ getNumEgg());
    }

    @Override
    final public String Country() {
        return "sudan";
    }

    @Override
    final public String Weather() {
        return "hot";
    }

    @Override
    final public String enviroment() {
        return "gress";
    }

    @Override
    final public String Eat() {
        return "worms";
    }

    public void setNumEgg(int numEgg) {
        this.numEgg = numEgg;
    }

    public int getNumEgg() {
        return numEgg;
    }
}
