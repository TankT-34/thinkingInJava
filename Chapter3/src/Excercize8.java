public class Excercize8 {
    public static void main(String[] args) {
        long a = 0xFL;      // 15
        long b = 0x1AL;     // 26

        long c = 017L;      // 15
        long d = 032L;      // 26

        System.out.println("Шестнадцатеричные:");
        System.out.println("0xFL = " + a + " -> " + Long.toBinaryString(a));
        System.out.println("0x1AL = " + b + " -> " + Long.toBinaryString(b));

        System.out.println("Восьмеричные:");
        System.out.println("017L = " + c + " -> " + Long.toBinaryString(c));
        System.out.println("032L = " + d + " -> " + Long.toBinaryString(d));
    }
}