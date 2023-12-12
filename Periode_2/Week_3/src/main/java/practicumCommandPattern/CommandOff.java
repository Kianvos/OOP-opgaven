package practicumCommandPattern;

public class CommandOff implements Command{
    BasicAVdevice basicAVdevice;

    public CommandOff(BasicAVdevice basicAVdevice) {
        this.basicAVdevice = basicAVdevice;
    }

    @Override
    public void execute() {
        basicAVdevice.turnOff();
    }
}
