class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RectangularGlyph extends Glyph {
    private int width = 4;
    private int height = 5;

    @Override
    void draw() {
        System.out.println("RectangularGlyph.draw(), width = " +
                width + ", height = " + height);
    }

    RectangularGlyph(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println("RectangularGlyph(), width = " +
                width + ", height = " + height);
    }
}

public class Exercise9 {
    public static void main(String[] args) {
        new RectangularGlyph(10, 20);
    }
}