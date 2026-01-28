import java.util.Random;

class Shape {
    public void draw() {
        System.out.println("Shape.draw()");
    }

    public void erase() {
        System.out.println("Shape.erase()");
    }

    public void message() {
        System.out.println("Base shape message");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void message() {
        System.out.println("Circle message");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void message() {
        System.out.println("Square message");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle.erase()");
    }
}

class RandomShapeGenerator {
    private Random rand = new Random();

    public Shape next() {
        switch(rand.nextInt(4)) {
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Rectangle();
            default: return new Circle();
        }
    }
}

public class Exercise2 {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];

        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = gen.next();
        }

        for (Shape shape : shapes) {
            shape.draw();
            shape.erase();
            shape.message();
            System.out.println("---");
        }
    }
}