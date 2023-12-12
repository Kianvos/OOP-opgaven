package calculator;

public class Divide implements Calculation{
    @Override
    public double operation(double[] values) {
        return values[0]/values[1];
    }
}
