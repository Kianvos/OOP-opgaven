import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int option;
        double[] values = new double[2];
        if (args.length == 0){
            option = getMenuOption();
            values = getPair();
        }else {
            option = Integer.parseInt(args[0]);
            values[0] = Integer.parseInt(args[1]);
            values[1] = Integer.parseInt(args[2]);
        }

        if (option == 0 ){
            System.exit(0);
        }


        double answer;
        switch(option) {
            case 1:
                answer = add(values);
                break;
            case 2:
                answer = subtract(values);
                break;
            case 3:
                answer = multiply(values);
                break;
            case 4:
                answer = divide(values);
                break;
            case 5:
                answer = randomNumber(values);
                break;
            case 6:
                answer = distance(values);
                break;
            default:
                answer = -1;
                break;
        }
        System.out.println("Antwoord: " + answer);
    }
    private static int getMenuOption(){
        System.out.println("Menu");
        System.out.println("1 Optellen");
        System.out.println("2 Aftrekken");
        System.out.println("3 Vermenigvuldigen");
        System.out.println("4 Delen");
        System.out.println("5 Genereer een random getal");
        System.out.println("6 Bereken afstand");
        System.out.println("Wat zou je willen doen?");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if ( option >= 1 && option <= 6) {
            return option;
        }else {
            System.out.printf("Helaas, %d is geen optie.\n",option);
            return 0;
        }
    }

    private static double getOperand(String question){
        System.out.println(question);
        double value;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        while (true){
            try {
                value = scanner.nextDouble();
                break;
            } catch (InputMismatchException mme) {
                System.out.println("Geen geldige waarde");
                scanner.nextLine();
            }
        }
        return value;
    }

    private static double[] getPair() {
        double x = getOperand("Eerste waarde: ");
        double y = getOperand("Tweede waarde: ");

        double[] values = {x, y}; // declare and initialise a double's array
        return values;
    }

    private static double add(double[] values) {
        return values[0]+values[1];
    }

    private static double subtract(double[] values) {
        return values[0]-values[1];
    }

    private static double multiply(double[] values) {
        return values[0]*values[1];
    }

    private static double divide(double[] values) {
        return values[0]/values[1];
    }

    private static double randomNumber(double[] values) {
        double random = Math.random();
        double max = Math.max(values[0], values[1]);
        double min = Math.min(values[0], values[1]);
        return (max-min)*random+min;
    }

    private static double distance(double[] values) {
        return 0;
    }
}
