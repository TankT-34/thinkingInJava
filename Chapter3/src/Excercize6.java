class Dogg{
    String name;
    String says;
}
public class Excercize6 {
    public static void main(String[] args){
        Dogg spot = new Dogg();
        Dogg scruffy = new Dogg();
        Dogg curly = new Dogg();
        curly=spot;
        spot.name = "Bobby";
        spot.says = "Sit";
        scruffy.name = "Lucky";
        scruffy.says = "Run";
        System.out.println(spot.name + " " + spot.says);
        System.out.println(scruffy.name + " " + scruffy.says);
        System.out.println(curly==spot);
        System.out.println(curly.equals(spot));
    }
}
