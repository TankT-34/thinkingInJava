class BaseClass {
    public void method() {
        System.out.println("BaseClass.method()");
    }
}

class DerivedClass extends BaseClass {
    @Override
    public void method() {
        System.out.println("DerivedClass.method()");
    }

    // Это перегрузка, а не переопределение
    public void method(String param) {
        System.out.println("DerivedClass.method(String): " + param);
    }
}

public class Excercixe3 {
    public static void main(String[] args) {
        BaseClass obj = new DerivedClass();
        obj.method(); // Вызывает переопределенный метод

        // obj.method("test"); // Ошибка компиляции - нет такого метода в BaseClass

        DerivedClass derived = new DerivedClass();
        derived.method(); // OK
        derived.method("test"); // OK - перегруженный метод
    }
}