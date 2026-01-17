public class Excercize10 {
    protected void finalize() {
        System.out.println("Вызван метод finalize()");
    }

    public static void main(String[] args) {
        new Excercize10();
        System.out.println("Объект создан");
        System.out.println("Метод finalize() может быть вызван, а может и нет");
        System.out.println("Зависит от сборщика мусора");
    }
}