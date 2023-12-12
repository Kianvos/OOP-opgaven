package calculator;

public class Add implements Calculation{
    @Override
    public double operation(double[] values) {
        return values[0]+values[1];
    }
}
