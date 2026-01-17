public class Excercize2 {
    String initializedAtDeclaration = "Инициализировано при объявлении";
    String initializedInConstructor;
    String defaultInitialized;

    public Excercize2() {
        initializedInConstructor = "Инициализировано в конструкторе";
    }

    public Excercize2(String customValue) {
        initializedInConstructor = customValue;
    }

    public void printFields() {
        System.out.println("1. initializedAtDeclaration: \"" + initializedAtDeclaration + "\"");
        System.out.println("2. initializedInConstructor: \"" + initializedInConstructor + "\"");
        System.out.println("3. defaultInitialized: \"" + defaultInitialized + "\"");
        System.out.println("   defaultInitialized == null? " + (defaultInitialized == null));
    }

    public static void main(String[] args) {
        System.out.println("Oбъект с конструктором по умолчанию");
        Excercize2 obj1 = new Excercize2();
        obj1.printFields();

        System.out.println("\nOбъект с пользовательским конструктором");
        Excercize2 obj2 = new Excercize2("Свое значение");
        obj2.printFields();
    }
}