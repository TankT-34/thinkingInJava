class A2 {
    private String name;

    A2(String name) {
        this.name = name;
        System.out.println("Конструктор A2(" + name + ")");
    }

    public String getName() {
        return name;
    }
}

class B2 {
    private int value;

    B2(int value) {
        this.value = value;
        System.out.println("Конструктор B2(" + value + ")");
    }

    public int getValue() {
        return value;
    }
}

class C2 extends A2 {
    private B2 b;

    C2(String aName, int bValue) {
        super(aName); // Вызов конструктора A2
        b = new B2(bValue); // Создание объекта B2
        System.out.println("Конструктор C2(" + aName + ", " + bValue + ")");
    }

    public void printInfo() {
        System.out.println("A2.name = " + getName() + ", B2.value = " + b.getValue());
    }
}

public class Excercise7 {
    public static void main(String[] args) {
        System.out.println("Создаем объект C2:");
        C2 c = new C2("Test", 42);
        c.printInfo();
    }
}