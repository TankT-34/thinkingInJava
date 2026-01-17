public class Excercize1 {
    String uninitializedString;
    public static void main(String[] args) {
        Excercize1 example = new Excercize1();
        System.out.println("Значение uninitializedString: " + example.uninitializedString);

        if (example.uninitializedString == null) {
            System.out.println("Дa, ссылка равна null");
        } else {
            System.out.println("Нет, ссылка не равна null");
        }
    }
}