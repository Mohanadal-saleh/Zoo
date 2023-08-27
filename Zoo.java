import java.awt.*;
import java.util.Scanner;

public class Zoo
{
    static Scanner s = new Scanner(System.in);
    static int choiceGroup, choiceAnimal, choiceInfo;
    static String cc;

    static void Start ()
    {
        System.out.println("Enter your choice :");
        System.out.println("1- for fish");
        System.out.println("2- for birds");
        System.out.println("3- for Amphibians");
        choiceGroup = s.nextInt();
        switch (choiceGroup)
        {
            case 1 : chooseFish();break;
            case 2 : chooseBird();break;
            case 3 : chooseAmphibians();break;
            default : System.out.println("the number is not valid!!");
            Start();
        }
    }

    private static void chooseFish ()
    {
        System.out.println("Enter your choice :");
        System.out.println("1- Jellyfish");
        System.out.println("2- Shark");
        System.out.println("3- Octopus");
        choiceAnimal = s.nextInt();
        switch (choiceAnimal)
        {
            case 1 : new Jellyfish("jellyfish", "white", 3, false ,600);break;
            case 2 : new Shark("shark", "white", 100, true,3);break;
            case 3 : new Octopus("Octopus", "white", 5, true,8);break;
            default : System.out.println("the number is not valid!!");
            chooseFish();
        }
    }

    static void chooseAmphibians ()
    {
        System.out.println("Enter your choice :");
        System.out.println("1- Caecillian");
        System.out.println("2- Frog");
        System.out.println("3- Salamander");
        choiceAnimal = s.nextInt();
        switch (choiceAnimal)
        {
            case 1 : new Caecillian("caecillian", "black", 20, true,4);break;
            case 2 : new Frog("frog", "green", 16, false,1);break;
            case 3 : new Salamander("salamander", "varicolored", 20, false,10);break;
            default : System.out.println("the number is not valid!!");
            chooseAmphibians();
        }
    }

    private static void chooseBird ()
    {
        System.out.println("Enter your choice :");
        System.out.println("1- Falcon");
        System.out.println("2- Gull");
        System.out.println("3- Chicken");
        choiceAnimal = s.nextInt();
        switch (choiceAnimal)
        {
            case 1 : new Falcon("falcon", "brown", 6, true,1);break;
            case 2 : new Gull("gull", "white", 15, true, 3);break;
            case 3 : new Chicken("chicken", "white", 1, false,8);break;
            default : System.out.println("the number is not valid!!");
            chooseBird();
        }
    }
}
