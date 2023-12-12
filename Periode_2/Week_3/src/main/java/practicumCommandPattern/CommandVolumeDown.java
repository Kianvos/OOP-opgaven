package practicumCommandPattern;

public class CommandVolumeDown implements Command{
    BasicAVdevice basicAVdevice;

    public CommandVolumeDown(BasicAVdevice basicAVdevice) {
        this.basicAVdevice = basicAVdevice;
    }

    @Override
    public void execute() {
        basicAVdevice.volumeDown();
    }
}
