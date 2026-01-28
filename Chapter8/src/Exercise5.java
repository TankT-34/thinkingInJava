class Rodent {
    void eat() {
        System.out.println("Rodent.eat()");
    }

    void run() {
        System.out.println("Rodent.run()");
    }

    Rodent() {
        System.out.println("Creating Rodent");
    }
}

class Mouse extends Rodent {
    @Override
    void eat() {
        System.out.println("Mouse.eat()");
    }

    @Override
    void run() {
        System.out.println("Mouse.run()");
    }

    Mouse() {
        System.out.println("Creating Mouse");
    }
}

class Hamster extends Rodent {
    @Override
    void eat() {
        System.out.println("Hamster.eat()");
    }

    @Override
    void run() {
        System.out.println("Hamster.run()");
    }

    Hamster() {
        System.out.println("Creating Hamster");
    }
}

class Gerbil extends Rodent {
    @Override
    void eat() {
        System.out.println("Gerbil.eat()");
    }

    @Override
    void run() {
        System.out.println("Gerbil.run()");
    }

    Gerbil() {
        System.out.println("Creating Gerbil");
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Hamster(),
                new Gerbil()
        };

        System.out.println("\nCalling methods:");
        for (Rodent r : rodents) {
            r.eat();
            r.run();
            System.out.println("---");
        }
    }
}