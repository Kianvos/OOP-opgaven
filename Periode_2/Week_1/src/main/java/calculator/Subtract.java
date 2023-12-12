package calculator;

public class Subtract implements Calculation{
    @Override
    public double operation(double[] values) {
        return values[0]-values[1];
    }
}
