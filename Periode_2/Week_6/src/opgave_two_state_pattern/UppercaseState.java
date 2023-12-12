package opgave_two_state_pattern;

public class UppercaseState implements State{
    private PrintText printText;

    public UppercaseState(PrintText printText) {
        this.printText = printText;
    }

    @Override
    public void writeText(String line) {
        System.out.println(line.toUpperCase());
        printText.setState(printText.getLowercaseState());
    }
}
