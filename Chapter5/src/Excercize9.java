public class Excercize9 {
    public Excercize9() {
        this("значение по умолчанию");
        System.out.println("Первый конструктор");
    }

    public Excercize9(String text) {
        System.out.println("Второй конструктор: " + text);
    }

    public static void main(String[] args) {
        Excercize9 obj = new Excercize9();
    }
}