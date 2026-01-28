import java.util.Random;
enum Note {
    MIDDLE_C, C_SHARP, B_FLAT
}

class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    @Override
    public String toString() {
        return "Instrument";
    }
}

class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    public String toString() {
        return "Woodwind";
    }
}

class Guitar extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Guitar.play() " + n);
    }

    @Override
    public String toString() {
        return "Guitar";
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Guitar()  // Новый тип
        };

        // Полиморфный вызов
        for (Instrument i : orchestra) {
            i.play(Note.MIDDLE_C);
            System.out.println(i);
        }
    }
}