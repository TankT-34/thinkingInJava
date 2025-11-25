import java.util.*;
public class Excercize7 {
    public static void main(String[] args){
        Random rand = new Random();
        String[] options = {"Орёл", "Решка"};
        String result = options[rand.nextInt(options.length)];
        System.out.println("Результат: " + result);
    }
}
