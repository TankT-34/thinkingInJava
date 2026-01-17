public class Excercize8 {
    void method1() {
        method2();       // Без this
        this.method2();  // С this
    }

    void method2() {
        System.out.println("Вызван Метод №2");
    }

    public static void main(String[] args) {
        Excercize8 obj = new Excercize8();
        obj.method1();
    }
}