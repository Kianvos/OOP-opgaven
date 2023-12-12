package practicumCommandPattern;

public class CommandOn implements Command{
    BasicAVdevice basicAVdevice;

    public CommandOn(BasicAVdevice basicAVdevice) {
        this.basicAVdevice = basicAVdevice;
    }

    @Override
    public void execute() {
        basicAVdevice.turnOn();
    }
}
