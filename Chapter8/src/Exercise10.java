class AlertStatus {
    void status() {
        System.out.println("Normal status");
    }
}

class AlarmStatus extends AlertStatus {
    @Override
    void status() {
        System.out.println("Alarm status!");
    }
}

class WarningStatus extends AlertStatus {
    @Override
    void status() {
        System.out.println("Warning status");
    }
}

class SafeStatus extends AlertStatus {
    @Override
    void status() {
        System.out.println("Safe status");
    }
}

class Starship {
    private AlertStatus status = new SafeStatus();

    void setAlarm() {
        status = new AlarmStatus();
    }

    void setWarning() {
        status = new WarningStatus();
    }

    void setSafe() {
        status = new SafeStatus();
    }

    void showStatus() {
        status.status();
    }
}

public class Exercise10 {
    public static void main(String[] args) {
        Starship ship = new Starship();
        ship.showStatus();

        ship.setAlarm();
        ship.showStatus();

        ship.setWarning();
        ship.showStatus();

        ship.setSafe();
        ship.showStatus();
    }
}