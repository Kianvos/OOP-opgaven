package opgave_two_state_pattern;

public class LowercaseState implements State {
    private PrintText printText;

    public LowercaseState(PrintText printText) {
        this.printText = printText;
    }

    @Override
    public void writeText(String line) {
        System.out.println(line.toLowerCase());
        printText.setState(printText.getUppercaseState());
    }
}
