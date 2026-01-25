class Component1Dispose {
    Component1Dispose() {
        System.out.println("Component1Dispose()");
    }

    public void dispose() {
        System.out.println("Component1Dispose.dispose()");
    }
}

class Component2Dispose {
    Component2Dispose() {
        System.out.println("Component2Dispose()");
    }

    public void dispose() {
        System.out.println("Component2Dispose.dispose()");
    }
}

class Component3Dispose {
    Component3Dispose() {
        System.out.println("Component3Dispose()");
    }

    public void dispose() {
        System.out.println("Component3Dispose.dispose()");
    }
}

class RootDispose {
    private Component1Dispose c1;
    private Component2Dispose c2;
    private Component3Dispose c3;

    RootDispose() {
        c1 = new Component1Dispose();
        c2 = new Component2Dispose();
        c3 = new Component3Dispose();
        System.out.println("RootDispose()");
    }

    public void dispose() {
        System.out.println("RootDispose.dispose()");
        c3.dispose();
        c2.dispose();
        c1.dispose();
    }
}

class StemDispose extends RootDispose {
    private Component1Dispose c1;
    private Component2Dispose c2;
    private Component3Dispose c3;

    StemDispose() {
        c1 = new Component1Dispose();
        c2 = new Component2Dispose();
        c3 = new Component3Dispose();
        System.out.println("StemDispose()");
    }

    @Override
    public void dispose() {
        System.out.println("StemDispose.dispose()");
        c3.dispose();
        c2.dispose();
        c1.dispose();
        super.dispose();
    }
}

public class Excercise12 {
    public static void main(String[] args) {
        System.out.println("Создаем и уничтожаем объект StemDispose:");
        StemDispose stem = new StemDispose();
        try {
            // Использование объекта
            System.out.println("Используем объект...");
        } finally {
            stem.dispose();
        }
    }
}