class Detergent2 {
    private Cleanser2 cleanser = new Cleanser2();

    public void scrub() {
        cleanser.scrub();
        System.out.println("Detergent2.scrub()");
    }

    public void foam() {
        cleanser.foam();
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public String toString() {
        return cleanser.toString();
    }
}

class Cleanser2 {
    private String s = "Cleanser2";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public void foam() {
        append(" foam()");
    }

    public String toString() {
        return s;
    }
}

public class Excercise11 extends Detergent2 {
    @Override
    public void scrub() {
        System.out.println("Excercise11.scrub()");
        super.scrub();
    }

    public void sterilize() {
        System.out.println("Excercise11.sterilize()");
    }

    public static void main(String[] args) {
        Excercise11 ex = new Excercise11();
        ex.scrub();
        ex.sterilize();
        ex.dilute();
        ex.apply();
        ex.foam();
        System.out.println(ex);
    }
}