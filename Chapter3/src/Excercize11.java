public class Excercize11 {
    public static void main(String[] args) {
        int num = 0x80000000; // 10000000000000000000000000000000

        System.out.println("Начальное число:");
        System.out.println(Integer.toBinaryString(num));

        System.out.println("Сдвиги вправо:");
        for (int i = 0; i < 32; i++) {
            System.out.println(Integer.toBinaryString(num >> i));
        }
    }
}