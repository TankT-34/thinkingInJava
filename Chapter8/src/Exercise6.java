class Base {
    void method1() {
        System.out.println("Base.method1()");
        method2();
    }

    void method2() {
        System.out.println("Base.method2()");
    }
}

class Derived extends Base {
    @Override
    void method2() {
        System.out.println("Derived.method2()");
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.method1();
    }
}