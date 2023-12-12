import java.util.Scanner;

public class Millenniumbug {
    public static void main(String[] args) {
        int geboortejaar = asker("Geboortejaar");
        int huidig_jaar = asker("Huidig jaar") + 100;

        int leeftijd = huidig_jaar - geboortejaar;
        if (leeftijd>100){
            leeftijd-=100;
        }
        System.out.println("Uw leeftijd: "+ leeftijd);

    }
    private static int asker(String information){
        System.out.printf("%s: ", information);
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        return amount;
    }
}
