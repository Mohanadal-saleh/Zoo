public class Salamander extends Amphibians implements Environment,Feed
{
    private int numKind;


    public Salamander (String name, String color, int age, boolean toxic, int numKind)
    {
        this.name = name;
        this.age = age;
        this.color = color;
        this.toxic = toxic;
        setNumKind(numKind);
        printAll();
    }

    private void printAll ()
    {
        System.out.println("The Name is : " + name);
        System.out.println("The Age : " + age);
        System.out.println("The color : " + color);
        System.out.println("if the Salamander is toxic : " + toxic);
        System.out.println("His Country : "+Country());
        System.out.println("Live in Weather : "+ Weather());
        System.out.println("His Enviroment : "+ enviroment());
        System.out.println("Feed on : "+Eat());
        System.out.println("The Number of Kind : "+getNumKind());
    }

    @Override
    final public String Country ()
    {
        return "germany";
    }

    @Override
    final public String Weather ()
    {
        return "hot";
    }

    @Override
    final public String enviroment ()
    {
        return "gress";
    }

    @Override
    final public String Eat ()
    {
        return "insect";
    }

    public void setNumKind (int numKind)
    {
        this.numKind = numKind;
    }

    public int getNumKind ()
    {
        return numKind;
    }
}