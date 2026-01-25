class BaseClassEx8 {
    private int value;

    // Единственный конструктор - не по умолчанию
    BaseClassEx8(int value) {
        this.value = value;
        System.out.println("BaseClassEx8(" + value + ")");
    }

    public int getValue() {
        return value;
    }
}

class DerivedClassEx8 extends BaseClassEx8 {
    // Конструктор по умолчанию
    DerivedClassEx8() {
        super(0); // Должен вызывать конструктор базового класса
        System.out.println("DerivedClassEx8()");
    }

    // Конструктор с аргументами
    DerivedClassEx8(int value, String message) {
        super(value * 2); // Вызов конструктора базового класса
        System.out.println("DerivedClassEx8(" + value + ", \"" + message + "\")");
    }
}

public class Excercise8 {
    public static void main(String[] args) {
        System.out.println("1. Конструктор по умолчанию:");
        DerivedClassEx8 d1 = new DerivedClassEx8();
        System.out.println("Значение: " + d1.getValue());

        System.out.println("\n2. Конструктор с аргументами:");
        DerivedClassEx8 d2 = new DerivedClassEx8(10, "Hello");
        System.out.println("Значение: " + d2.getValue());
    }
}