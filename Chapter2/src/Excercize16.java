//: initialization/Overloading.java
// Демонстрация перегрузки конструкторов наряду
// с перегрузкой обычных методов,

/**
 * Пример перегрузки методов
 */
class Tree {
    int height;

    /**
     * Конструктор без параметров
     */
    Tree() {
        System.out.println("Сажаем росток");
        height = 0;
    }

    /**
     * Конструктор с высотой
     */
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Создание дерева высотой " + height + " м.");
    }

    /**
     * Метод info без параметров
     */
    void info() {
        System.out.println("Дерево высотой " + height + " м.");
    }

    /**
     * Метод info с параметром
     */
    void info(String s) {
        System.out.println(s + ": Дерево высотой " + height + " м.");
    }
}

/**
 * Главный класс
 */
public class Excercize16 {
    public Tree tree;
    /**
     * Основной метод
     */
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Перегруженный метод");
        }
        new Tree();
    }
}
