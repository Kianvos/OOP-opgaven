import java.util.Scanner;

public class LastChanceGas {
    public static void main(String[] args) {
        int tankinhoud = countAsker("Tankinhoud");
        int benzinemeter = countAsker("Benzinemeter");
        int kmLiter = countAsker("Kilometers per liter");

        int literOver = tankinhoud*benzinemeter/100;
        int kmRijden = literOver*kmLiter;

        if (kmRijden <= 320){
            System.out.println("Tanken!");
        }else{
            System.out.println("Rijd door");
        }
    }
    private static int countAsker(String information){
        System.out.printf("%s: ", information);
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        return amount;
    }

}
