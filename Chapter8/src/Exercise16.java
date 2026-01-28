class RodentWithComponents {
    private Component1 brain = new Component1("Rodent brain");
    private Component2 heart = new Component2("Rodent heart");

    RodentWithComponents() {
        System.out.println("RodentWithComponents() constructor");
    }

    void dispose() {
        System.out.println("Disposing RodentWithComponents");
        heart.dispose();
        brain.dispose();
    }
}

class MouseWithComponents extends RodentWithComponents {
    private Component1 brain = new Component1("Mouse brain");
    private Component3 tail = new Component3("Mouse tail");

    MouseWithComponents() {
        System.out.println("MouseWithComponents() constructor");
    }

    @Override
    void dispose() {
        System.out.println("Disposing MouseWithComponents");
        tail.dispose();
        brain.dispose();
        super.dispose();
    }
}

class HamsterWithComponents extends RodentWithComponents {
    private Component2 cheeks = new Component2("Hamster cheeks");

    HamsterWithComponents() {
        System.out.println("HamsterWithComponents() constructor");
    }

    @Override
    void dispose() {
        System.out.println("Disposing HamsterWithComponents");
        cheeks.dispose();
        super.dispose();
    }
}

class Component1 {
    private String name;

    Component1(String name) {
        this.name = name;
        System.out.println("Creating " + name);
    }

    void dispose() {
        System.out.println("Disposing " + name);
    }
}

class Component2 {
    private String name;

    Component2(String name) {
        this.name = name;
        System.out.println("Creating " + name);
    }

    void dispose() {
        System.out.println("Disposing " + name);
    }
}

class Component3 {
    private String name;

    Component3(String name) {
        this.name = name;
        System.out.println("Creating " + name);
    }

    void dispose() {
        System.out.println("Disposing " + name);
    }
}

public class Exercise16 {
    public static void main(String[] args) {
        System.out.println("Creating MouseWithComponents:");
        MouseWithComponents mouse = new MouseWithComponents();

        System.out.println("\nCreating HamsterWithComponents:");
        HamsterWithComponents hamster = new HamsterWithComponents();

        System.out.println("\nDisposing objects:");
        mouse.dispose();
        System.out.println();
        hamster.dispose();
    }
}