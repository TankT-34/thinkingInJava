public class Excercize9 {
    public static void main(String[] args) {
        int count = 0;
        for (int num = 1000; num <= 9999; num++) {
            int d1 = num / 1000;
            int d2 = (num / 100) % 10;
            int d3 = (num / 10) % 10;
            int d4 = num % 10;

            // (d1 d2) * (d3 d4)
            int num1 = d1 * 10 + d2;
            int num2 = d3 * 10 + d4;
            if (num1 * num2 == num && num1 % 10 != 0 && num2 % 10 != 0) {
                System.out.println(num + " = " + num1 + " * " + num2);
                count++;
            }

            // (d1 d2) * (d4 d3)
            num1 = d1 * 10 + d2;
            num2 = d4 * 10 + d3;
            if (num1 * num2 == num && num1 % 10 != 0 && num2 % 10 != 0) {
                System.out.println(num + " = " + num1 + " * " + num2);
                count++;
            }

            // (d1 d3) * (d2 d4)
            num1 = d1 * 10 + d3;
            num2 = d2 * 10 + d4;
            if (num1 * num2 == num && num1 % 10 != 0 && num2 % 10 != 0) {
                System.out.println(num + " = " + num1 + " * " + num2);
                count++;
            }

            // (d1 d3) * (d4 d2)
            num1 = d1 * 10 + d3;
            num2 = d4 * 10 + d2;
            if (num1 * num2 == num && num1 % 10 != 0 && num2 % 10 != 0) {
                System.out.println(num + " = " + num1 + " * " + num2);
                count++;
            }

            // (d1 d4) * (d2 d3)
            num1 = d1 * 10 + d4;
            num2 = d2 * 10 + d3;
            if (num1 * num2 == num && num1 % 10 != 0 && num2 % 10 != 0) {
                System.out.println(num + " = " + num1 + " * " + num2);
                count++;
            }

            // (d1 d4) * (d3 d2)
            num1 = d1 * 10 + d4;
            num2 = d3 * 10 + d2;
            if (num1 * num2 == num && num1 % 10 != 0 && num2 % 10 != 0) {
                System.out.println(num + " = " + num1 + " * " + num2);
                count++;
            }
        }

        System.out.println("Найдено чисел: " + count);
    }
}