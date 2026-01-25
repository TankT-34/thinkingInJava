class A {
    A() {
        System.out.println("Конструктор A()");
    }
}

class B {
    B() {
        System.out.println("Конструктор B()");
    }
}

class C extends A {
    B b = new B();
    // Нет явного конструктора
}

public class Excercise5 {
    public static void main(String[] args) {
        System.out.println("Создаем объект C:");
        C c = new C();
        System.out.println("Порядок вызова:");
        System.out.println("1. Конструктор базового класса A()");
        System.out.println("2. Инициализация полей производного класса (B())");
        System.out.println("3. Конструктор производного класса (если был)");
    }
}