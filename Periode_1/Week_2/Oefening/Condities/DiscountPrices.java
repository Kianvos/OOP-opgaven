import java.util.Locale;
import java.util.Scanner;

public class DiscountPrices {
    public static void main(String[] args) {
        double price = price();
        if (price >= 10.00){
            price = calculateNewPrice(price);
        }
        System.out.printf("Prijs na eventuele korting: %.2f\n", price );
    }
    private static double price() {
        System.out.print("Voer het bedrag van de aankopen in: ");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        return scanner.nextDouble();
    }

    private static double calculateNewPrice(double oldPrice) {
        return oldPrice*0.9;
    }
}
