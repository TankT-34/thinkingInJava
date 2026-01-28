public class Exercise11 {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        for (Cycle c : cycles) {
            if (c instanceof Unicycle) {
                ((Unicycle)c).balance();
            } else if (c instanceof Bicycle) {
                ((Bicycle)c).balance();
            } else {
                System.out.println("No balance method for " + c.getClass().getSimpleName());
            }
        }
    }
}