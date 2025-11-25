public class Excercize12 {
    public static void main(String[] args) {
        int num = 0xFFFFFFFF; // 11111111111111111111111111111111

        System.out.println("Начальное число:");
        System.out.println(Integer.toBinaryString(num));

        num = num << 1;
        System.out.println("После сдвига влево:");
        System.out.println(Integer.toBinaryString(num));

        System.out.println("Беззнаковые сдвиги вправо:");
        for (int i = 0; i < 32; i++) {
            System.out.println(Integer.toBinaryString(num >>> i));
        }
    }
}