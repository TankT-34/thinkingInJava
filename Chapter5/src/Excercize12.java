public class Excercize12 {
    static class Tank {
        boolean isEmpty = true;

        void fill() {
            isEmpty = false;
            System.out.println("Бак наполнен");
        }

        void empty() {
            isEmpty = true;
            System.out.println("Бак опустошен");
        }

        protected void finalize() {
            if (!isEmpty) {
                System.out.println("ОШИБКА: Бак не пуст перед очисткой!");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("1: Бак пуст");
        Tank tank1 = new Tank();
        tank1 = null;
        System.gc();

        System.out.println("\n2: Бак полон");
        Tank tank2 = new Tank();
        tank2.fill();
        tank2 = null;
        System.gc();

        System.out.println("\n3: Бак наполнили и опустошили");
        Tank tank3 = new Tank();
        tank3.fill();
        tank3.empty();
        tank3 = null;
        System.gc();

        try {
            Thread.sleep(100);
        } catch (Exception e) {}
    }
}