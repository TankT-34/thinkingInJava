public class Excercize14 {
    public static void compareStrings(String a, String b) {
        System.out.println("Сравниваем: '" + a + "' и '" + b + "'");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("!a.equals(b): " + !a.equals(b));
        System.out.println();
    }

    public static void main(String[] args) {
        compareStrings("hello", "hello");
        compareStrings("hello", "world");
        compareStrings("java", "java");
        compareStrings("test", "TEST");
    }
}
