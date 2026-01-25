public class Excercize14 {
    static String staticField = "Инициализировано в точке определения";
    static String blockField;

    static {
        blockField = "Инициализировано в статическом блоке";
        System.out.println("Статический блок выполнен");
    }

    static void printFields() {
        System.out.println("staticField: " + staticField);
        System.out.println("blockField: " + blockField);
    }

    public static void main(String[] args) {
        System.out.println("Main метод начат");
        printFields();
    }
}
