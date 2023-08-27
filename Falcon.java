public class Falcon extends Birds  implements Environment,Feed{
    private int deepWater;

    public Falcon(String name, String color, int age, boolean canFly,int deepWater) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.canFly = canFly;
        setDeepWater(deepWater);
        print();
    }
     void printAll ()
    {
        System.out.println("The Name is : " + name);
        System.out.println("The Age : " + age);
        System.out.println("The color : " + color);
        System.out.println("if the bird can be fly : " + canFly);
        System.out.println("His Country : "+Country());
        System.out.println("Live in Weather : "+ Weather());
        System.out.println("His Enviroment : "+ enviroment());
        System.out.println("Feed on : "+Eat());
        System.out.println("the length of deep water : "+ getDeepWater());
    }

    @Override
    final void speed() {
        System.out.println("the speed of falcon is 150km");
    }

    @Override
    final public String Country() {
        return "spin";
    }

    @Override
    final public String Weather() {
        return "hot";
    }

    @Override
    final public String enviroment() {
        return "on mounten";
    }

    @Override
    final public String Eat() {
        return "meat";
    }

    public void setDeepWater(int deepWater) {
        this.deepWater = deepWater;
    }

    public int getDeepWater() {
        return deepWater;
    }
}
