public class Excercize8 {
    public static class StaticDemo {
        static int staticCount = 0;  // одно на все объекты
        int objectCount = 0;         // у каждого объекта свой

        public StaticDemo() {
            staticCount++;
            objectCount++;
        }
    }
    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();

        System.out.println("Статическое поле (одно для всех): " + StaticDemo.staticCount);
        System.out.println("У obj1: " + obj1.objectCount);
        System.out.println("У obj2: " + obj2.objectCount);
        System.out.println("У obj3: " + obj3.objectCount);
    }
}
