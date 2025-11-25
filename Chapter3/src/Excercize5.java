class Dog{
    String name;
    String says;
}
public class Excercize5 {
    public static void main(String[] args){
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.name = "Bobby";
        spot.says = "Sit";
        scruffy.name = "Lucky";
        scruffy.says = "Run";
        System.out.println(spot.name + " " + spot.says);
        System.out.println(scruffy.name + " " + scruffy.says);
    }
}
