package practicumCommandPattern;

public class CommandTest implements Command{
    Radio radio;

    public CommandTest(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.test();
    }
}
