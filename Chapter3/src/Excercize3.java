class Number {
    float num;
}
public class Excercize3 {
    static void f(Number i) {
        i.num = 8.256f;
    }

    public static void main(String[] args) {
        Number x = new Number();
        x.num = 2.84f;
        System.out.println("1: x.num: " + x.num);
        f(x);
        System.out.println("2: x.num: " + x.num);
    }
}
