class Game {
    Game(int i) {
        System.out.println("Конструктор Game(" + i + ")");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i); // Должен вызывать конструктор базового класса
        System.out.println("Конструктор BoardGame(" + i + ")");
    }
}

class Chess extends BoardGame {
    Chess() {
        super(11); // Вызов конструктора BoardGame
        System.out.println("Конструктор Chess()");
    }
}

public class Excercise6 {
    public static void main(String[] args) {
        System.out.println("Создаем объект Chess:");
        Chess chess = new Chess();
        System.out.println("\nПорядок вызова конструкторов:");
        System.out.println("1. Chess() вызывает super(11)");
        System.out.println("2. BoardGame(11) вызывает super(11)");
        System.out.println("3. Game(11) выполняется");
        System.out.println("4. BoardGame(11) продолжает выполнение");
        System.out.println("5. Chess() продолжает выполнение");
    }
}