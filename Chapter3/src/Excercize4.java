class Speed {
    float distance;
    float time;

    float calculateSpeed() {
        return distance / time;
    }
}

public class Excercize4 {
    public static void main(String[] args) {
        Speed speed = new Speed();
        speed.distance = 260f;
        speed.time = 2.5f;

        System.out.println("Расстояние: " + speed.distance + " км");
        System.out.println("Время: " + speed.time + " ч");
        System.out.println("Скорость равна: " + speed.calculateSpeed() + " км/ч");
    }
}