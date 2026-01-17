public class Excercize4 {
    public Excercize4() {
        System.out.println("Сообщение из конструктора");
    }

    public Excercize4(String message) {
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Excercize4 obj1 = new Excercize4();
        Excercize4 obj2 = new Excercize4("Привет!");
    }
}