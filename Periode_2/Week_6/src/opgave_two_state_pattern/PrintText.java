package opgave_two_state_pattern;

public class PrintText {

    private final State lowercaseState = new LowercaseState(this);
    private final State uppercaseState = new UppercaseState(this);
    State state = lowercaseState;

    public State getLowercaseState() {
        return lowercaseState;
    }

    public State getUppercaseState() {
        return uppercaseState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void printText(String[] lines) {
        for(String line : lines) {
            printLine(line);
        }
    }

    public void printLine(String line) {
        if (line.isBlank()) {
            System.out.println();
        } else {
            state.writeText(line);
        }
    }
}