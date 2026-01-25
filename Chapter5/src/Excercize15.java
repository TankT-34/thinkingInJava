public class Excercize15 {
    private String value;

    // Секция инициализации экземпляров
    {
        value = "Инициализировано в секции инициализации";
        System.out.println("Секция инициализации выполнена");
    }

    public Excercize15() {
        System.out.println("Конструктор выполнен, значение: " + value);
    }

    public static void main(String[] args) {
        new Excercize15();
    }
}