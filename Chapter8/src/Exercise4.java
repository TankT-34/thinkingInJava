import java.util.Random;

class RandomInstrumentGenerator {
    private Random rand = new Random();

    public Instrument next() {
        switch(rand.nextInt(6)) {
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new Guitar();
            default: return new Wind();
        }
    }
}

public class Exercise4 {
    private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();

    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[10];

        for (int i = 0; i < instruments.length; i++) {
            instruments[i] = gen.next();
        }

        for (Instrument i : instruments) {
            System.out.println(i + ": ");
            i.play(Note.C_SHARP);
        }
    }
}