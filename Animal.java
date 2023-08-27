import java.util.Scanner;

public class Animal implements Environment , Feed{

    String name;
    String color;
    int age;

    void speed(){
        System.out.println("speed of animal");
    }
    Scanner s = new Scanner(System.in);
    void print(){
        System.out.println("what are you wanna know ?");
        System.out.println("Name / age / color /country/weather/ all info");
        String open = s.next();
        switch (open){
            case "name":
                System.out.println("The Name is : " + name);break;
            case "age":
                System.out.println("The Age : " + age);break;
            case "color":
                System.out.println("The color : " + color);break;
            case "country":
                System.out.println("His Country : "+ Country());break;
            case "weather":
                System.out.println("Live in Weather : "+ Weather());break;
            case "enviroment":
                System.out.println("His Enviroment : "+ enviroment());break;
            case "eat":
                System.out.println("Feed on : "+Eat());break;
            case "info":
                printAll();break;
            default:
                System.out.println("the value is not valid");

        }
    }

    void printAll() {
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
}
