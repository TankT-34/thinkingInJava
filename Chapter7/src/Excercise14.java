class Engine {
    public void start() {
        System.out.println("Engine.start()");
    }

    public void rev() {
        System.out.println("Engine.rev()");
    }

    public void stop() {
        System.out.println("Engine.stop()");
    }

    public void service() {
        System.out.println("Engine.service() - обслуживание двигателя");
        System.out.println("1. Замена масла");
        System.out.println("2. Проверка свечей");
        System.out.println("3. Замена фильтров");
    }
}

class Wheel {
    public void inflate(int psi) {
        System.out.println("Wheel.inflate(" + psi + " psi)");
    }
}

class Window {
    public void rollup() {
        System.out.println("Window.rollup()");
    }

    public void rolldown() {
        System.out.println("Window.rolldown()");
    }
}

class Door {
    public Window window = new Window();

    public void open() {
        System.out.println("Door.open()");
    }

    public void close() {
        System.out.println("Door.close()");
    }
}

class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door(), right = new Door();

    public Car() {
        for (int i = 0; i < 4; i++) {
            wheel[i] = new Wheel();
        }
    }
}

public class Excercise14 {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("=== Обслуживание автомобиля ===");

        // Вызов нового метода service()
        car.engine.service();

        System.out.println("\n=== Дополнительные операции ===");

        car.left.window.rollup();
        car.wheel[0].inflate(32);
        car.engine.start();
    }
}