public class Excercize5 {
    static int test(int testval, int target, int begin, int end) {
        if (testval >= begin && testval <= end) {
            if (testval > target) {
                return +1;
            } else if (testval < target) {
                return -1;
            } else {
                return 0;
            }
        } else {
            return -2;
        }
    }

    public static void main(String[] args) {
        // 1. testval в диапазоне
        System.out.println("test(10, 5, 0, 20) = " + test(10, 5, 0, 20));
        System.out.println("test(5, 10, 0, 20) = " + test(5, 10, 0, 20));
        System.out.println("test(5, 5, 0, 20) = " + test(5, 5, 0, 20));

        // 2. testval на границах диапазона
        System.out.println("test(0, 5, 0, 20) = " + test(0, 5, 0, 20));
        System.out.println("test(20, 5, 0, 20) = " + test(20, 5, 0, 20));

        // 3. testval вне диапазона
        System.out.println("test(-5, 5, 0, 20) = " + test(-5, 5, 0, 20));
        System.out.println("test(25, 5, 0, 20) = " + test(25, 5, 0, 20));
    }
}