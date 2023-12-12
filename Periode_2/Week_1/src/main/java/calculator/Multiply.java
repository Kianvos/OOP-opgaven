package calculator;

public class Multiply implements Calculation{
    @Override
    public double operation(double[] values) {
        return values[0]*values[1];
    }
}
