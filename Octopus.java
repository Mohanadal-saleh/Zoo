public class Octopus extends Fish implements Environment,Feed{
    private int numLegs;

    public Octopus(String name, String color, int age, boolean Predatory,int numLegs) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.Predatory = Predatory;
        setNumLegs(numLegs);
        printAll();
    }
    private void printAll ()
    {
        System.out.println("The Name is : " + name);
        System.out.println("The Age : " + age);
        System.out.println("The color : " + color);
        System.out.println("if The animal is Preadatory : " + Predatory);
        System.out.println("His Country : "+Country());
        System.out.println("Live in Weather : "+ Weather());
        System.out.println("His Enviroment : "+ enviroment());
        System.out.println("Feed on : "+Eat());
        System.out.println("Number of legs : "+getNumLegs());
    }

    @Override
    public String Country() {
        return "denimark";
    }

    @Override
    public String Weather() {
        return "cold";
    }

    @Override
    public String enviroment() {
        return "water";
    }

    @Override
    public String Eat() {
        return "small fish";
    }
    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public int getNumLegs() {
        return numLegs;
    }
}
