public class Excercize7 {
    static class MyClass {
        void sayHello() {
            System.out.println("Йоу, я из MyClass!");
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.sayHello();
        System.out.println("Объект создан");
    }
}