package amphibians;
import Main.*;
public class Salamander extends Amphibians implements Environment, Feed ,forPrint
{
    private int numKind;

    public Salamander (String name, String color, int age, boolean toxic, int numKind)
    {
        this.setName(name) ;
        this.setAge(age);
        this.setColor(color);
        this.toxic = toxic;
        setNumKind(numKind);
    }
    @Override
    public void printAll ()
    {
        System.out.println("The Name is : " + getName());
        System.out.println("The Age : " + getAge());
        System.out.println("The color : " + getColor());
        System.out.println("if the amphibians.Salamander is toxic : " + toxic);
        System.out.println("His Country : "+Country());
        System.out.println("Live in Weather : "+ Weather());
        System.out.println("His Enviroment : "+ enviroment());
        System.out.println("Main.Feed on : "+Eat());
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