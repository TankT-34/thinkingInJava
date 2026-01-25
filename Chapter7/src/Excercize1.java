class SimpleClass {
    private String name;

    public SimpleClass(String name) {
        this.name = name;
        System.out.println("Создан SimpleClass: " + name);
    }

    public String getName() {
        return name;
    }
}

public class Excercize1 {
    private SimpleClass ref; // Отложенная инициализация

    public void createObject() {
        if (ref == null) {
            ref = new SimpleClass("Объект с отложенной инициализацией");
        }
    }

    public void useObject() {
        if (ref != null) {
            System.out.println("Используем объект: " + ref.getName());
        } else {
            System.out.println("Объект еще не создан");
        }
    }

    public static void main(String[] args) {
        Excercize1 ex = new Excercize1();
        ex.useObject();
        ex.createObject();
        ex.useObject();
    }
}