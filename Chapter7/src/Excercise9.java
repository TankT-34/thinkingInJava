class Component1 {
    Component1() {
        System.out.println("Component1()");
    }
}

class Component2 {
    Component2() {
        System.out.println("Component2()");
    }
}

class Component3 {
    Component3() {
        System.out.println("Component3()");
    }
}

class Root {
    private Component1 c1;
    private Component2 c2;
    private Component3 c3;

    Root() {
        c1 = new Component1();
        c2 = new Component2();
        c3 = new Component3();
        System.out.println("Root()");
    }
}

class Stem extends Root {
    private Component1 c1;
    private Component2 c2;
    private Component3 c3;

    Stem() {
        // Неявный вызов super()
        c1 = new Component1();
        c2 = new Component2();
        c3 = new Component3();
        System.out.println("Stem()");
    }
}

public class Excercise9 {
    public static void main(String[] args) {
        System.out.println("Создаем объект Stem:");
        Stem stem = new Stem();
    }
}