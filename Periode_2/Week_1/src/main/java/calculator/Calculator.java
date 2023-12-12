package calculator;

import java.util.Scanner;

public class Calculator {

    private Calculation calculation;

    /**
     * Opdracht:
     * Pas onderstaande code aan zodat het gebruik maakt van het Strategy pattern
     * <p>
     * De strategy is dan een interface bestaande uit:
     * <p>
     * public static double operation(double[] values)
     */

    public Calculator(Calculation calculation) {
        this.calculation = calculation;
    }



    public double Calculate(double[] values) {
        return calculation.operation(values);
    }
}