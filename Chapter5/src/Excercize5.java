public class Excercize5 {
    static class Dog {
        void bark() {
            System.out.println("Гав");
        }

        void bark(int x) {
            System.out.println("Аууу");
        }

        void bark(double d) {
            System.out.println("Ваф");
        }

        void bark(boolean b) {
            System.out.println("Ррр");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.bark();
        dog.bark(5);
        dog.bark(3.14);
        dog.bark(true);
    }
}