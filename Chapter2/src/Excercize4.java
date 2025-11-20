public class Excercize4 {
    public static class DataOnly{
        int i;
        double d;
        boolean b;
    }
    public static void main(String[] args){
        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        double sum = data.i + data.d;
        System.out.println("Сумма: " + sum);
        System.out.println("Значение b: " + data.b);
    }
}
