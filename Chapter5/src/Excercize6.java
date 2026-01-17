public class Excercize6 {
    static class Dog {
        void bark(int x, double d) {
            System.out.println("Гав с int " + x + " и double " + d);
        }

        void bark(double d, int x) {
            System.out.println("Рычание с double " + d + " и int " + x);
        }
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(5, 3.14);
        dog.bark(3.14, 5);
    }
}