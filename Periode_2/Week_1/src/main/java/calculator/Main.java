package calculator;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            int keuze = getMenuOption();
            if (keuze == 0) {
                exit = true;
                continue;
            }
            double[] pair = getPair();

            double antwoord = 0;
            switch (keuze) {
                case 1:
                    antwoord = new Calculator(new Add()).Calculate(pair);
                    break;
                case 2:
                    antwoord = new Calculator(new Subtract()).Calculate(pair);
                    break;
                case 3:
                    antwoord = new Calculator(new Multiply()).Calculate(pair);
                    break;
                case 4:
                    antwoord = new Calculator(new Divide()).Calculate(pair);
                    break;
            }

            System.out.println(String.format("Antwoord: %f", antwoord));
        }
    }


    public static int getMenuOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "Menu\n" +
                        "0 Einde\n" +
                        "1 Optellen\n" +
                        "2 Aftrekken\n" +
                        "3 Vermenigvuldigen\n" +
                        "4 Delen\n" +
                        "Wat zou je willen doen? ");
        int keuze = scanner.nextInt();
        while (keuze < 0 || keuze > 5) {
            System.out.println(String.format("Helaas, %d is geen optie.", keuze));
            keuze = scanner.nextInt();
        }
        return keuze;
    }

    public static double getOperand(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static double[] getPair() {
        double x = getOperand("Eerste waarde: ");
        double y = getOperand("Tweede waarde: ");

        double[] values = {x, y}; // declare and initialise a double's array
        return values;
    }
}
