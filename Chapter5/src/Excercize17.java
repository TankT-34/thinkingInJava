class MyClass {
    MyClass(String str) {
        System.out.println("Конструктор MyClass вызван с аргументом: " + str);
    }
}

public class Excercize17 {
    public static void main(String[] args) {
        // Создаем массив ссылок, но не создаем объекты
        MyClass[] array = new MyClass[3];

        System.out.println("Массив создан, но объекты не инициализированы");

        // Выводим значения элементов массива
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}