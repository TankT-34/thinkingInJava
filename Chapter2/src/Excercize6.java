public class Excercize6 {
    int storage(String s){
        return s.length()*2;
    }
    public static void main(String[] args){
        Excercize6 line = new Excercize6();
        int result1 = line.storage("Hello World!");
        System.out.println("Количество байт для строки 'Hello World!': " + result1);

        int result2 = line.storage("I love Java, but Java doesn't love me");
        System.out.println("Количество байт для строки 'I love Java, but Java doesn't love me': " + result2);
    }
}
