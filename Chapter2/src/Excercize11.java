public class Excercize11 {
    public static class AllTheColorsOfTheRainbow {
        int anIntegerRepresentingColors;

        void changeTheHueOfTheColor(int newHue) {
            anIntegerRepresentingColors = newHue;
        }
    }
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow rainbow = new AllTheColorsOfTheRainbow();

        rainbow.changeTheHueOfTheColor(5);

        System.out.println("Первый цвет: " + rainbow.anIntegerRepresentingColors);

        rainbow.changeTheHueOfTheColor(2);
        System.out.println("Второй цвет: " + rainbow.anIntegerRepresentingColors);
    }
}
