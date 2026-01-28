class AlertStatus {
    public void status() {
        System.out.println("Base alert status");
    }
}

class NormalStatus extends AlertStatus {
    @Override
    public void status() {
        System.out.println("Normal operations");
    }
}

class WarningStatus extends AlertStatus {
    @Override
    public void status() {
        System.out.println("Warning: system alert");
    }
}

class CriticalStatus extends AlertStatus {
    @Override
    public void status() {
        System.out.println("CRITICAL: Immediate action required!");
    }
}

class Starship {
    private AlertStatus status = new NormalStatus();

    public void setStatusNormal() {
        status = new NormalStatus();
    }

    public void setStatusWarning() {
        status = new WarningStatus();
    }

    public void setStatusCritical() {
        status = new CriticalStatus();
    }

    public void showStatus() {
        status.status();
    }

    public void changeStatusRandom() {
        int rand = (int)(Math.random() * 3);
        switch(rand) {
            case 0: setStatusNormal(); break;
            case 1: setStatusWarning(); break;
            case 2: setStatusCritical(); break;
        }
    }
}

public class Exercise14 {
    public static void main(String[] args) {
        Starship enterprise = new Starship();

        System.out.println("Initial status:");
        enterprise.showStatus();

        System.out.println("\nChanging to warning:");
        enterprise.setStatusWarning();
        enterprise.showStatus();

        System.out.println("\nChanging to critical:");
        enterprise.setStatusCritical();
        enterprise.showStatus();

        System.out.println("\nRandom status changes:");
        for (int i = 0; i < 5; i++) {
            enterprise.changeStatusRandom();
            enterprise.showStatus();
        }
    }
}