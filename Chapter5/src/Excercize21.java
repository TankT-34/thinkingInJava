enum PaperCurrency {
    ONE, FIVE, TEN, FIFTY, ONE_HUNDRED, FIVE_HUNDRED
}

public class Excercize21 {
    public static void main(String[] args) {
        System.out.println("Типы бумажных денег:");

        // Перебираем значения enum
        for (PaperCurrency currency : PaperCurrency.values()) {
            System.out.println(currency + " - порядковый номер: " + currency.ordinal());
        }
    }
}