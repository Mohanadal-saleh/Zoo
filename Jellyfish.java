public class Jellyfish extends Fish implements Environment,Feed{
    private int elctricWh;
    public Jellyfish(String name, String color, int age, boolean Predatory,int elctricWh) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.Predatory = Predatory;
        setElctricWh(elctricWh);
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
