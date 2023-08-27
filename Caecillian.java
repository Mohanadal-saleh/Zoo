public class Caecillian extends Amphibians implements Environment,Feed{
    private int numColor;

    public Caecillian(String name, String color, int age, boolean toxic,int numColor) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.toxic = toxic;
        setNumColor(numColor);
        printAll();
    }
    @Override
    public void printAll()
    {
        System.out.println("The Name is : " + name);
        System.out.println("The Age : " + age);
        System.out.println("The color : " + color);
        System.out.println("if the Ceacillian is toxic : " + toxic);
        System.out.println("His Country : "+Country());
        System.out.println("Live in Weather : "+ Weather());
        System.out.println("His Enviroment : "+ enviroment());
        System.out.println("Feed on : "+Eat());
        System.out.println("The number of his color : "+getNumColor());
    }

    @Override
    final public String Country() {
        return "brazel";
    }

    @Override
    final public String Weather() {
        return "hot";
    }

    @Override
    final public String enviroment() {
        return "wiadly";
    }

    @Override
    final public String Eat() {
        return "insect";
    }

    public void setNumColor(int numColor) {
        this.numColor = numColor;
    }

    public int getNumColor() {
        return numColor;
    }

}
