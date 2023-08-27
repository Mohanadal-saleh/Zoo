package Main;

import java.util.Scanner;

public class Animal implements Environment, Feed ,forPrint{

    private String name;
    private String color;
    private int age;

    Scanner s = new Scanner(System.in);
    public void print(){
        System.out.println("what are you wanna know ?");
        System.out.println("Name / age / color /country/weather/ all info");
        String open = s.next();
        switch (open){
            case "name":
                System.out.println("The Name is : " + name); Zoo.Start();break;
            case "age":
                System.out.println("The Age : " + age);Zoo.Start();break;
            case "color":
                System.out.println("The color : " + color);Zoo.Start();break;
            case "country":
                System.out.println("His Country : "+ Country());Zoo.Start();break;
            case "weather":
                System.out.println("Live in Weather : "+ Weather());Zoo.Start();break;
            case "enviroment":
                System.out.println("His Enviroment : "+ enviroment());Zoo.Start();break;
            case "eat":
                System.out.println("Main.Feed on : "+Eat());Zoo.Start();break;
            case "info":
                printAll();
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
