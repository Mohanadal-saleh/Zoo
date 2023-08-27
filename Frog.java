public class Frog extends Amphibians implements Environment,Feed{
    private int jumpLength;

    public Frog(String name, String color, int age, boolean toxic,int jumpLength) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.toxic = toxic;
        setJumpLength(jumpLength);
        printAll();
    }
    private void printAll ()
    {
        System.out.println("The Name is : " + name);
        System.out.println("The Age : " + age);
        System.out.println("The color : " + color);
        System.out.println("if the frog is toxic : " + toxic);
        System.out.println("His Country : "+Country());
        System.out.println("Live in Weather : "+ Weather());
        System.out.println("His Enviroment : "+ enviroment());
        System.out.println("Feed on : "+Eat());
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
