class BaseOverloaded {
    public void method() {
        System.out.println("BaseOverloaded.method() без параметров");
    }

    public void method(int x) {
        System.out.println("BaseOverloaded.method(int): " + x);
    }

    public void method(String s) {
        System.out.println("BaseOverloaded.method(String): " + s);
    }
}

public class Excercise13 extends BaseOverloaded {
    // Добавляем новую перегрузку в производном классе
    public void method(double d) {
        System.out.println("Excercise13.method(double): " + d);
    }

    @Override
    public void method(String s) {
        System.out.println("Excercise13.method(String): " + s.toUpperCase());
    }

    public static void main(String[] args) {
        Excercise13 ex = new Excercise13();

        // Все методы доступны
        System.out.println("1. Метод из базового класса:");
        ex.method();

        System.out.println("\n2. Метод с int из базового класса:");
        ex.method(42);

        System.out.println("\n3. Переопределенный метод с String:");
        ex.method("test");

        System.out.println("\n4. Новая перегрузка в производном классе:");
        ex.method(3.14);

        System.out.println("\n5. Вызов через ссылку на базовый класс:");
        BaseOverloaded baseRef = ex;
        baseRef.method();
        baseRef.method(100);
        baseRef.method("base reference");
        // baseRef.method(2.71); // Ошибка - этого метода нет в BaseOverloaded
    }
}