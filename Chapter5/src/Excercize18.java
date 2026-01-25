public class Excercize18 {
    public static void main(String[] args) {
        // Создаем массив ссылок
        MyClass[] array = new MyClass[3];

        System.out.println("Массив создан");

        // Создаем объекты и заполняем массив
        for (int i = 0; i < array.length; i++) {
            array[i] = new MyClass("Объект " + (i + 1));
        }

        System.out.println("\nВсе объекты созданы");
    }
}