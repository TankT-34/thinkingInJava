public class Exercise15 {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        System.out.println("Array of Cycle (polymorphism):");
        for (Cycle c : cycles) {
            c.ride();
            System.out.println("Wheels: " + c.wheels());
        }

        System.out.println("\nTrying to call balance():");
        for (Cycle c : cycles) {

            if (c instanceof Unicycle) {
                ((Unicycle)c).balance();
            } else if (c instanceof Bicycle) {
                ((Bicycle)c).balance();
            } else {
                System.out.println(c.getClass().getSimpleName() +
                        " doesn't have balance() method");
            }
        }

        System.out.println("\nDemonstrating wrong downcast:");
        try {
            Tricycle t = (Tricycle) cycles[0];
            System.out.println("This won't be printed");
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }

        System.out.println("\nSafe downcasting:");
        for (Cycle c : cycles) {
            if (c instanceof Unicycle u) {
                u.balance();
            } else if (c instanceof Bicycle b) {
                b.balance();
            }
        }
    }
}