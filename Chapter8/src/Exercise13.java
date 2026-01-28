class Glyph {
    Glyph() {
        System.out.println("Glyph() constructor");
        draw();
    }

    void draw() {
        System.out.println("Glyph.draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int width = 2;
    private int height = 3;

    RectangularGlyph(int w, int h) {
        width = w;
        height = h;
        System.out.println("RectangularGlyph(), width = " + width +
                ", height = " + height);
    }

    @Override
    void draw() {
        System.out.println("RectangularGlyph.draw(), width = " + width +
                ", height = " + height);
    }
}

public class Exercise13 {
    public static void main(String[] args) {
        System.out.println("Creating RoundGlyph:");
        new RoundGlyph(5);

        System.out.println("\nCreating RectangularGlyph:");
        new RectangularGlyph(10, 20);
    }
}