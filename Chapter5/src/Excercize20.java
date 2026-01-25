public class Excercize20 {

    // main метод с использованием varargs вместо String[] args
    public static void main(String... args) {
        System.out.println("Количество аргументов: " + args.length);

        if (args.length == 0) {
            System.out.println("Аргументы не переданы");
        } else {
            System.out.println("Аргументы командной строки:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] = " + args[i]);
            }
        }
    }
}