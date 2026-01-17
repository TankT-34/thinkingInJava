public class Excercize13 {
    public static void main(String[] args) {
        System.out.println("Инициализация полей в Java:");
        System.out.println("1. Числовые типы инициализируются 0");
        System.out.println("2. boolean инициализируется false");
        System.out.println("3. Ссылочные типы инициализируются null");
        System.out.println("4. char инициализируется '\\u0000'");

        class Test {
            int a;
            boolean b;
            String c;
        }

        Test t = new Test();
        System.out.println("\nПроверка:");
        System.out.println("int a = " + t.a);
        System.out.println("boolean b = " + t.b);
        System.out.println("String c = " + t.c);
    }
}