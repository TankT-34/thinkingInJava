public class Excercize5 {
    public static class DataOnly{
        int i = 47;
        double d = 1.1;
        boolean b = false;
    }
    public static void main(String[] args){
        DataOnly data = new DataOnly();
        System.out.println("Значение i: " + data.i);
        System.out.println("Значение d: " + data.d);
        System.out.println("Значение b: " + data.b);
    }
}
