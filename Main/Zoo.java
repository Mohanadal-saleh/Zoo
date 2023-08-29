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
        Animal jellyfish = new Jellyfish("jellyfish", "white", 3, false ,600);
        Animal shark = new Shark("shark", "white", 100, true,3);
        Animal octopus = new Octopus("fish.Octopus", "white", 5, true,8);
        choiceAnimal = s.nextInt();
        switch (choiceAnimal)
        {
            case 1 : printAnimal(jellyfish); break;
            case 2 : printAnimal(shark);break;
            case 3 : printAnimal(octopus);break;
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
        Animal ceacillian = new Caecillian("caecillian", "black", 20, true,4);
        Animal frog = new Frog("frog", "green", 16, false,50,10);
        Animal salamander = new Salamander("salamander", "varicolored", 20, false,10);
        choiceAnimal = s.nextInt();
        switch (choiceAnimal)
        {
            case 1 : printAnimal(ceacillian);break;
            case 2 : printAnimal(frog);break;
            case 3 :printAnimal(salamander);break;
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
        Animal falcon = new Falcon("falcon", "brown", 6, true,1);
        Animal gull = new Gull("gull", "white", 15, true, 3);
        Animal chicken = new Chicken("chicken", "white", 1, false,8);
        choiceAnimal = s.nextInt();
        switch (choiceAnimal)
        {
            case 1 :printAnimal(falcon); break;
            case 2 :printAnimal(gull);break;
            case 3 :printAnimal(chicken);break;
            default : System.out.println("the number is not valid!!");
            chooseBird();
        }

    }
    static void printAnimal(Animal s){
        s.print();
    }
}
