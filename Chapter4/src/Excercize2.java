import java.util.Random;

public class Excercize2 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 1; i <= 25; i++) {
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            System.out.print(num1 + " и " + num2 + ": ");

            if (num1 > num2) {
                System.out.println(num1 + " > " + num2);
            } else if (num1 < num2) {
                System.out.println(num1 + " < " + num2);
            } else {
                System.out.println(num1 + " = " + num2);
            }
        }
    }
}