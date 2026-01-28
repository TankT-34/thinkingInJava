class Cycle {
    void ride() {
        System.out.println("Riding a cycle");
    }

    int wheels() {
        return 0;
    }
}

class Unicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding a unicycle");
    }

    @Override
    int wheels() {
        return 1;
    }

    void balance() {
        System.out.println("Balancing on one wheel");
    }
}

class Bicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding a bicycle");
    }

    @Override
    int wheels() {
        return 2;
    }

    void balance() {
        System.out.println("Balancing on two wheels");
    }
}

class Tricycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding a tricycle");
    }

    @Override
    int wheels() {
        return 3;
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Cycle[] cycles = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };

        for (Cycle c : cycles) {
            c.ride();
            System.out.println("Wheels: " + c.wheels());
        }

        System.out.println("\nTesting balance():");
        for (Cycle c : cycles) {
            if (c instanceof Unicycle) {
                ((Unicycle)c).balance();
            } else if (c instanceof Bicycle) {
                ((Bicycle)c).balance();
            }
        }
    }
}