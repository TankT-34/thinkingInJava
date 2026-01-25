enum Currency {
    ONE(1, "Один рубль"),
    FIVE(5, "Пять рублей"),
    TEN(10, "Десять рублей"),
    FIFTY(50, "Пятьдесят рублей"),
    ONE_HUNDRED(100, "Сто рублей"),
    FIVE_HUNDRED(500, "Пятьсот рублей");

    private final int value;
    private final String description;

    Currency(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }
}

public class Excercize22 {
    public static void main(String[] args) {
        Currency[] currencies = Currency.values();

        for (Currency currency : currencies) {
            System.out.print(currency + " (" + currency.getValue() + " руб.): ");

            // Команда switch для перечисления
            switch (currency) {
                case ONE:
                    System.out.println("Самая мелкая купюра, зеленая");
                    break;
                case FIVE:
                    System.out.println("Купюра синего цвета с изображением памятника");
                    break;
                case TEN:
                    System.out.println("Купюра коричнево-зеленого цвета с мостами");
                    break;
                case FIFTY:
                    System.out.println("Голубая купюра с изображением скульптур");
                    break;
                case ONE_HUNDRED:
                    System.out.println("Купюра коричневого цвета с изображением Большого театра");
                    break;
                case FIVE_HUNDRED:
                    System.out.println("Купюра фиолетового цвета с изображением Петра I");
                    break;
                default:
                    System.out.println("Неизвестная купюра");
            }
        }
    }
}