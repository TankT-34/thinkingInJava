public class Excercize7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print("i = " + i + ": ");

            switch (i) {
                case 1:
                    System.out.println("Один");
                    break;
                case 2:
                    System.out.println("Два");
                    break;
                case 3:
                    System.out.println("Три");
                    break;
                case 4:
                    System.out.println("Четыре");
                    break;
                case 5:
                    System.out.println("Пять");
                    break;
                default:
                    System.out.println("Больше 5");
            }
        }
    }
}