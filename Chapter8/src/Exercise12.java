class Component1 {
    Component1() {
        System.out.println("Component1()");
    }

    void dispose() {
        System.out.println("Component1.dispose()");
    }
}

class Component2 {
    Component2() {
        System.out.println("Component2()");
    }

    void dispose() {
        System.out.println("Component2.dispose()");
    }
}

class Component3 {
    Component3() {
        System.out.println("Component3()");
    }

    void dispose() {
        System.out.println("Component3.dispose()");
    }
}

class Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
    private Shared shared;

    Root(Shared shared) {
        this.shared = shared;
        shared.addRef();
        System.out.println("Root()");
    }

    void dispose() {
        System.out.println("Root.dispose()");
        shared.dispose();
        c3.dispose();
        c2.dispose();
        c1.dispose();
    }
}

class Stem extends Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
    private Shared shared;

    Stem(Shared shared) {
        super(shared);
        this.shared = shared;
        shared.addRef();
        System.out.println("Stem()");
    }

    @Override
    void dispose() {
        System.out.println("Stem.dispose()");
        shared.dispose();
        c3.dispose();
        c2.dispose();
        c1.dispose();
        super.dispose();
    }
}

public class Exercise12 {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Stem stem = new Stem(shared);

        try {
            // Использование объекта
            System.out.println("\nUsing stem object...");
        } finally {
            System.out.println("\nDisposing stem object:");
            stem.dispose();
        }
    }
}