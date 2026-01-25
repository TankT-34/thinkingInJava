class Component1Ex10 {
    private String name;

    Component1Ex10(String name) {
        this.name = name;
        System.out.println("Component1Ex10(\"" + name + "\")");
    }
}

class Component2Ex10 {
    private int id;

    Component2Ex10(int id) {
        this.id = id;
        System.out.println("Component2Ex10(" + id + ")");
    }
}

class Component3Ex10 {
    private double value;

    Component3Ex10(double value) {
        this.value = value;
        System.out.println("Component3Ex10(" + value + ")");
    }
}

class RootEx10 {
    private Component1Ex10 c1;
    private Component2Ex10 c2;
    private Component3Ex10 c3;

    RootEx10(String name, int id, double value) {
        c1 = new Component1Ex10(name + "-root");
        c2 = new Component2Ex10(id * 2);
        c3 = new Component3Ex10(value + 1.0);
        System.out.println("RootEx10(\"" + name + "\", " + id + ", " + value + ")");
    }
}

class StemEx10 extends RootEx10 {
    private Component1Ex10 c1;
    private Component2Ex10 c2;
    private Component3Ex10 c3;

    StemEx10(String name, int id, double value) {
        super(name + "-super", id + 10, value * 2);
        c1 = new Component1Ex10(name + "-stem");
        c2 = new Component2Ex10(id + 20);
        c3 = new Component3Ex10(value * 3);
        System.out.println("StemEx10(\"" + name + "\", " + id + ", " + value + ")");
    }
}

public class Excercise10 {
    public static void main(String[] args) {
        System.out.println("Создаем объект StemEx10:");
        StemEx10 stem = new StemEx10("test", 1, 2.5);
    }
}