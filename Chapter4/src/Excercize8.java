public class Excercize8 {
    public static void main(String[] args) {
        int n = 10;  // Можете изменить это число
        System.out.println("Первые " + n + " чисел Фибоначчи:");
        int a = 1;
        int b = 1;
        if (n >= 1) {
            System.out.print(a);
        }
        if (n >= 2) {
            System.out.print(", " + b);
        }
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}