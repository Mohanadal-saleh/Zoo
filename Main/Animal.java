package Main;

import java.util.Scanner;

public class Animal implements Environment, Feed ,forPrint{

    private String name;
    private String color;
    private int age;

    Scanner s = new Scanner(System.in);
    public void print(){
        System.out.println("what are you wanna know ?");
        System.out.println("1-Name / 2-age / 3-color / 4-country /5-weather/ 6- all info");
        int open = s.nextInt();
        switch (open){
            case 1:
                System.out.println("The Name is : " + name );
                System.out.println();
                System.out.println();
                Zoo.Start();break;
            case 2:
                System.out.println("The Age : " + age);
                System.out.println();
                System.out.println();
                Zoo.Start();break;
            case 3:
                System.out.println("The color : " + color);
                System.out.println();
                System.out.println();
                Zoo.Start();break;
            case 4:
                System.out.println("His Country : "+ Country());
                System.out.println();
                System.out.println();
                Zoo.Start();break;
            case 5:
                System.out.println("Live in Weather : "+ Weather());
                System.out.println();
                System.out.println();
                Zoo.Start();break;
            case 8:
                System.out.println("His Enviroment : "+ enviroment());
                System.out.println();
                System.out.println();
                Zoo.Start();break;
            case 7:
                System.out.println("Feed on : "+Eat());
                System.out.println();
                System.out.println();
                Zoo.Start();break;
            case 6:
                printAll();
                System.out.println();
                System.out.println();
                Zoo.Start();break;
            default:
                System.out.println("the value is not valid");
                print();

        }

    }


    @Override
    public String Country() {
        return null;
    }

    @Override
    public String Weather() {
        return null;
    }

    @Override
    public String enviroment() {
        return null;
    }

    @Override
    public String Eat() {
        return null;
    }


    public void printAll() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
