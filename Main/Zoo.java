package Main;
import amphibians.Caecillian;
import amphibians.Frog;
import amphibians.Salamander;
import bird.Chicken;
import bird.Falcon;
import bird.Gull;
import fish.Jellyfish;
import fish.Octopus;
import fish.Shark;

import java.util.Scanner;

public class Zoo
{
    static Scanner s = new Scanner(System.in);
    static int choiceGroup, choiceAnimal;

    public static void Start()
    {
        System.out.println("Enter your choice :");
        System.out.println("1- for fish");
        System.out.println("2- for birds");
        System.out.println("3- for amphibians.Amphibians");
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
        System.out.println("1- fish.Jellyfish");
        System.out.println("2- fish.Shark");
        System.out.println("3- fish.Octopus");
        choiceAnimal = s.nextInt();
        switch (choiceAnimal)
        {
            case 1 : new Jellyfish("jellyfish", "white", 3, false ,600);break;
            case 2 : new Shark("shark", "white", 100, true,3);break;
            case 3 : new Octopus("fish.Octopus", "white", 5, true,8);break;
            default : System.out.println("the number is not valid!!");
            chooseFish();
        }
    }

    static void chooseAmphibians ()
    {
        System.out.println("Enter your choice :");
        System.out.println("1- amphibians.Caecillian");
        System.out.println("2- amphibians.Frog");
        System.out.println("3- amphibians.Salamander");
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
        System.out.println("1- bird.Falcon");
        System.out.println("2- bird.Gull");
        System.out.println("3- bird.Chicken");
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
