public class Excercize11 {
    protected void finalize() {
        System.out.println("Вызван метод finalize()");
    }

    public static void main(String[] args) {
        Excercize11 obj = new Excercize11();
        obj = null;

        System.gc();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Программа завершена");
    }
}