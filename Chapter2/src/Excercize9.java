public class Excercize9 {
        public static void main(String[] args) {
            System.out.println("Автоматическая упаковка:");

            Integer integerObject = 12;
            Double doubleObject = 6.66;
            Boolean booleanObject = true;
            Character charObject = 'T';

            System.out.println("Integer: " + integerObject);
            System.out.println("Double: " + doubleObject);
            System.out.println("Boolean: " + booleanObject);
            System.out.println("Character: " + charObject);

            System.out.println("Автоматическая распаковка:");

            int intValue = integerObject;
            double doubleValue = doubleObject;
            boolean booleanValue = booleanObject;
            char charValue = charObject;

            System.out.println("int: " + intValue);
            System.out.println("double: " + doubleValue);
            System.out.println("boolean: " + booleanValue);
            System.out.println("char: " + charValue);

            System.out.println("Пример:");
            Integer a = 10;
            Integer b = 20;
            int result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        }
}
