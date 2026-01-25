public class Excercize19 {

    // Метод с переменным количеством аргументов
    public static void printStrings(String... strings) {
        System.out.println("Количество аргументов: " + strings.length);
        for (String str : strings) {
            System.out.println(str);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Передача списка объектов String, разделенных запятыми
        printStrings("Первый", "Второй", "Третий");

        // Передача массива String[]
        String[] array = {"Массив1", "Массив2", "Массив3", "Массив4"};
        printStrings(array);

        // Даже пустой список
        printStrings();
    }
}