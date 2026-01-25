class Base {
    Base() {
        System.out.println("Конструктор Base() вызван");
    }

    Base(String msg) {
        System.out.println("Конструктор Base(String): " + msg);
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("Конструктор Derived() вызван");
    }

    Derived(String msg) {
        super(msg); // Явный вызов конструктора базового класса
        System.out.println("Конструктор Derived(String) вызван");
    }

    Derived(int num) {
        // Неявный вызов super()
        System.out.println("Конструктор Derived(int): " + num);
    }
}

public class Excercise4 {
    public static void main(String[] args) {
        System.out.println("1. Создание Derived():");
        new Derived();

        System.out.println("\n2. Создание Derived(String):");
        new Derived("test");

        System.out.println("\n3. Создание Derived(int):");
        new Derived(42);
    }
}