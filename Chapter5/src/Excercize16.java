public class Excercize16 {
    public static void main(String[] args) {
        String[] stringArray = new String[5];

        // Присваиваем объекты String каждому элементу
        stringArray[0] = "Первый";
        stringArray[1] = "Второй";
        stringArray[2] = "Третий";
        stringArray[3] = "Четвертый";
        stringArray[4] = "Пятый";

        // Выводим содержимое массива
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Элемент " + i + ": " + stringArray[i]);
        }

        // Или с использованием foreach
        System.out.println("\nС использованием foreach:");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}