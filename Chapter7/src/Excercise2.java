class Cleanser {
    public void scrub() {
        System.out.println("Cleanser.scrub()");
    }

    public void foam() {
        System.out.println("Cleanser.foam()");
    }
}

class Detergent extends Cleanser {
    @Override
    public void scrub() {
        System.out.println("Detergent.scrub()");
        super.scrub();
    }
}

public class Excercise2 extends Detergent {
    @Override
    public void scrub() {
        System.out.println("Excercise2.scrub()");
        super.scrub();
    }

    public void sterilize() {
        System.out.println("Excercise2.sterilize()");
    }

    public static void main(String[] args) {
        Excercise2 ex = new Excercise2();
        ex.scrub();
        ex.sterilize();
        ex.foam();
    }
}